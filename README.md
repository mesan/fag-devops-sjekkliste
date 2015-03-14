# azure-java-application-insights
Java in azure with application insights

Applikasjonen er veldig enkel. Det er en Todoliste. Den har et RESTful API, er laget med [Spring Boot] [spring-boot-url] og benytter en in-memory database.

###Det som trengs
- [Java] [java-url] 1.6 eller nyere.
- [Maven] [maven-url], følg installasjonsbeskrivelsen på nedlastingssiden.

###Kjør applikasjonen:
- fra kommandolinja med kommandoen: `mvn spring-boot:run`
- fra IDE ved å kjøre TodoApplication.java som inneholder main metoden.

###Hva applikasjonen kan gjøre
Da det ikke er noe GUI så benytt gjerne en REST-klient. Det gjør lagring av data enklere.

####Legg til en Todo
URL: localhost:8080/todo (POST)

Forventet input:

- title (text)
- content (text)

####List alle Todos
URL: localhost:8080/todos (GET)

[java-url]: http://www.oracle.com/technetwork/java/javase/downloads/index.html
[maven-url]: http://maven.apache.org/
[spring-boot-url]: http://projects.spring.io/spring-boot/