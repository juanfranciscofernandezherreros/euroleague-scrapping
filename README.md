# Scrapping Euroleague Data

## Starting 🚀

Project to Scrapping data from Match in Euroleague

### How to use it 📋

I try to explain how to use the endpoints more complex .. we could use swagger for the rest of endpoints

```bash
http://localhost:8485/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/
```

#### Obtain all years 

```bash
curl -X GET "http://localhost:8485/api/public/v1/years" -H  "accept: application/json"
```

```
[
  "2020",
  "2019",
  "2018",
  "2017",
  "2016",
  "2015",
  "2014",
  "2013",
  "2012",
  "2011",
  "2010",
  "2009",
  "2008",
  "2007",
  "2006",
  "2005",
  "2004",
  "2003",
  "2002",
  "2001",
  "2000"
]
```

#### Obtain all teams of year selected

```bash
curl -X GET "http://localhost:8485/api/public/v1/teams/year/2000" -H  "accept: application/json"
```

```bash
{
  "content": [
    {
      "team": "BER",
      "nameTeam": "ALBA Berlin",
      "seasson": "2020",
      "url": "https://www.euroleague.net/competition/teams/showteam?clubcode=BER&seasoncode=E2020"
    },
    {
      "team": "DYR",
      "nameTeam": "Zenit St Petersburg",
      "seasson": "2020",
      "url": "https://www.euroleague.net/competition/teams/showteam?clubcode=DYR&seasoncode=E2020"
    }
  ],
  "pageable": {
    "sort": {
      "sorted": false,
      "unsorted": true,
      "empty": true
    },
    "offset": 0,
    "pageSize": 40,
    "pageNumber": 0,
    "unpaged": false,
    "paged": true
  },
  "last": true,
  "totalElements": 18,
  "totalPages": 1,
  "size": 40,
  "number": 0,
  "sort": {
    "sorted": false,
    "unsorted": true,
    "empty": true
  },
  "numberOfElements": 18,
  "first": true,
  "empty": false
}
```
#### Obtains all match of team filtered by year and teamcode

```bash
curl -X GET "curl -X GET http://localhost:8485/api/public/v1/games/teams/showteam?clubcode=MAD&seasoncode=2020" -H  "accept: application/json"
```

```bash
{
  "content": [
    {
      "id": null,
      "numberMatch": "15",
      "winLose": "W",
      "versus": "at Olympiacos Piraeus",
      "teamPhaseGameScore": "82 - 86",
      "matchLink": "https://www.euroleague.net/main/results/showgame?gamecode=132&seasoncode=E2020",
      "header": {
        "Live": false,
        "Round": "15",
        "Date": "18/12/2020",
        "Hour": "20:00 ",
        "Stadium": "PEACE AND FRIENDSHIP STADIUM",
        "Capacity": "0",
        "TeamA": "OLYMPIACOS PIRAEUS",
        "TeamB": "REAL MADRID",
        "CodeTeamA": "OLY",
        "TVCodeA": "OLY",
        "CodeTeamB": "MAD",
        "TVCodeB": "RMB",
        "imA": "OLY       ",
        "imB": "MAD       ",
        "ScoreA": "82",
        "ScoreB": "86",
        "CoachA": "BARTZOKAS, GEORGIOS",
        "CoachB": "LASO, PABLO",
        "GameTime": "45:00",
        "wid": "90",
        "Quarter": "",
        "FoultsA": "22",
        "FoultsB": "19",
        "TimeoutsA": "5",
        "TimeoutsB": "3",
        "ScoreQuarter1A": 12,
        "ScoreQuarter2A": 30,
        "ScoreQuarter3A": 51,
        "ScoreQuarter4A": 69,
        "ScoreExtraTimeA": 82,
        "ScoreQuarter1B": 12,
        "ScoreQuarter2B": 31,
        "ScoreQuarter3B": 49,
        "ScoreQuarter4B": 69,
        "ScoreExtraTimeB": 86,
        "Phase": "REGULAR SEASON",
        "PhaseReducedName": "R S ",
        "Competition": "EUROLEAGUE 2020-21",
        "CompetitionReducedName": "E2020     ",
        "pcom": "E2020     ",
        "Referee1": "RYZHYK, BORYS",
        "Referee2": "ZAMOJSKI, JAKUB",
        "Referee3": "HORDOV, TOMISLAV"
      },
      "gameCode": "132",
      "seassonCode": "2020",
      "team": "MAD"
    }
  ],
  "pageable": {
    "sort": {
      "sorted": false,
      "unsorted": true,
      "empty": true
    },
    "offset": 0,
    "pageSize": 40,
    "pageNumber": 0,
    "paged": true,
    "unpaged": false
  },
  "last": true,
  "totalPages": 1,
  "totalElements": 39,
  "size": 40,
  "number": 0,
  "sort": {
    "sorted": false,
    "unsorted": true,
    "empty": true
  },
  "numberOfElements": 39,
  "first": true,
  "empty": false
}
```

#### Obtain data from a specific match

```bash
curl -X GET "http://localhost:8485/api/public/v1/data?gamecode=324&seasoncode=2020" -H  "accept: application/json"
```

#### Upload files

```bash
curl -X POST "http://localhost:8485/file/upload/EVOLUTION" -H  "accept: application/json" -H  "Content-Type: application/json" -d "{\"file\":\"string\"}"
```

