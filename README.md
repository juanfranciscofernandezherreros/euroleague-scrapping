# Scrapping Eeuroleague Data

## Starting 🚀

Project to Scrapping data from Match in Euroleague

### How to use it 📋

I try to explain how to use it.

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
curl -X GET "http://localhost:8485/api/public/v1/sync/teams/2000" -H  "accept: application/json"
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
curl -X GET "http://localhost:8485/api/public/v1/sync/games/clubcode/MAD/seassoncode/2020" -H  "accept: application/json"
```

#### Obtain data from a specific match

```bash
curl -X GET "http://localhost:8485/api/public/v1/data?gamecode=324&seasoncode=2020" -H  "accept: application/json"
```

#### Upload files

```bash
curl -X POST "http://localhost:8485/file/upload/EVOLUTION" -H  "accept: application/json" -H  "Content-Type: application/json" -d "{\"file\":\"string\"}"
```

