FROM fedora

RUN dnf install http://download.elastic.co/beats/filebeat/filebeat-1.1.0-x86_64.rpm -y

CMD filebeat -c /config/filebeat.yml