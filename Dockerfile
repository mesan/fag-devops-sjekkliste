FROM java

ADD build/libs/sjekkliste-0.1.0.jar /sjekkliste.jar

WORKDIR /

CMD java -jar /sjekkliste.jar
