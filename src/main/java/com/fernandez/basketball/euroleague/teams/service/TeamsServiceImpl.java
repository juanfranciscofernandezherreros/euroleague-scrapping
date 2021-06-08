package com.fernandez.basketball.euroleague.teams.service;

import com.fernandez.basketball.euroleague.teams.dto.TeamsDTO;
import com.fernandez.basketball.utils.DocumenUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class TeamsServiceImpl implements TeamsService{

    @Override
    public Page<TeamsDTO> syncAllTeamsByYear(String year, Pageable pageable) {
        String url = "https://www.euroleague.net/competition/teams?seasoncode=E"+year;
        List<String> teamsStringList = new ArrayList<>();
        List<TeamsDTO> teamsDTOList = new ArrayList<>();
        // Compruebo si me da un 200 al hacer la petición
        if (DocumenUtils.getStatusConnectionCode(url) == 200) {
            // Obtengo el HTML de la web en un objeto Document
            Document document = DocumenUtils.getHtmlDocument(url);
            Elements links = document.select("a[href]");
            for (Element link : links) {
                if(!link.text().isEmpty() && link.attr("href").contains("/competition/teams/showteam")){
                    TeamsDTO teamsDTO = new TeamsDTO();
                    String newUrl = "https://www.euroleague.net".concat(link.attr("href"));
                    String[] parts = newUrl.split("&");
                    String part1 = parts[0].substring(63,66); // 123
                    String part2 = parts[1].substring(12,16); // 654321
                    teamsStringList.add(newUrl);
                    teamsDTO.setTeam(part1);
                    teamsDTO.setUrl(newUrl);
                    teamsDTO.setNameTeam(link.text());
                    teamsDTO.setSeasson(part2);
                    teamsDTOList.add(teamsDTO);
                }
            }
        }else{
            log.error("El Status Code no es OK es: "+DocumenUtils.getStatusConnectionCode(url));
        }
        return convertList2Page(teamsDTOList,pageable);
    }

    private Page convertList2Page(final List list, final Pageable pageable) {
        return getPage(list, pageable);
    }

    static Page getPage(final List list, final Pageable pageable) {
        int startIndex = (int) pageable.getOffset();
        int endIndex = (int) ((pageable.getOffset() + pageable.getPageSize()) > list.size() ? list.size()
                : pageable.getOffset() + pageable.getPageSize());
        List subList = list.subList(startIndex, endIndex);
        return new PageImpl(subList, pageable, list.size());
    }
}
