<<<<<<< HEAD
# Sjekkliste

[![Build Status](https://ci.dag.im/buildStatus/icon?job=sjekkliste-build)](https://ci.dag.im/job/sjekkliste-build)


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
=======
# Sjekkliste

[![Build Status](https://ci.dag.im/buildStatus/icon?job=sjekkliste-build)](https://ci.dag.im/job/sjekkliste-build)


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

#### Health service

##### Se hvilket versjonsnummer som ligger ute, og når det ble bygget

`GET /api/health`
>>>>>>> 9959471a70997e44a671a539e7c2d7204c239dcd
