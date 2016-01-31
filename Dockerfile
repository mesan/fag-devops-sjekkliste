FROM java:8

ADD target/sjekkliste-0.1.0.jar /sjekkliste.jar

WORKDIR /

CMD java -jar /sjekkliste.jar
