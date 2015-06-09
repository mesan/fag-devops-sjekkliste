# azure-java-application-insights

[![Build Status](https://ci.dag.im/buildStatus/icon?job=azure-java-application-insights)](https://ci.dag.im/job/azure-java-application-insights)

Java i [Azure](http://azure.microsoft.com/en-us/) med [Application Insights](http://azure.microsoft.com/en-us/services/application-insights/)

Applikasjonen er veldig enkel. Det er en Todoliste. Den har et RESTful API, er laget med [Spring Boot](http://projects.spring.io/spring-boot/) og benytter SQL Server i Azure.

### Det som trengs
- [Java 7](http://www.oracle.com/technetwork/java/javase/downloads/index.html) eller nyere.
- [Maven](http://maven.apache.org/), følg installasjonsbeskrivelsen på nedlastingssiden.

### Kjør applikasjonen:
- fra kommandolinja med kommandoen: `mvn spring-boot:run`
- fra IDE ved å kjøre TodoApplication.java som inneholder main metoden.

### Hva applikasjonen kan gjøre
Da det ikke er noe GUI så benytt gjerne en REST-klient. Det gjør lagring av data enklere.

#### List alle Todos
`GET /todo`

#### Legg til en Todo
`POST /todo`

Forventet input:

```json
    {
      "title": "eksempeltittel",
      "content": "beskrivelse for todo"
    }
```
    
#### Endre en Todo
`PUT /todo`

Forventet input:

```json
    {
      "id": 1,
      "title": "ny tittel",
      "content": "nytt innhold",
      "completed": true
    }
```

#### Slette en Todo
`DELETE /todo/{id}`

#### Fremprovosere exception
Denne brukes for enkelt å få en stack trace og se hvordan det logges i Azure.

`GET /api/throwexception`


#### Ytelsestesting

##### Regn ut Pi med `n` desimaler

 `GET /api/pi/{n}`

##### Sorter et array med lengde `n`

`GET /api/sort/{n}`

### Deployment til Microsoft
`mvn clean package -P deployazure -Dftp_host="host" -Dftp_user="ftpuser" -Dftp_password="pw" -Ddb_user="dbuser" -Ddb_password="pw"`

Merk fnuttene (") rundt brukernavn og passord. De er nødvendig for å slippe escaping.
