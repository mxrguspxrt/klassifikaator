# boot2docker start
#
# export DOCKER_HOST=tcp://192.168.59.103:2375
# alias docker="sudo docker -H $DOCKER_HOST"
# docker build -t my_development_container .
#
# alias x='docker run my_development_container'
# x echo yo
#
# docker run -a stdin -a stdout -i -t postgre /bin/bash
# docker ps -a | grep 'weeks ago' | awk '{print $1}' | xargs docker rm



FROM ubuntu
MAINTAINER margus@wave.ee

# BASE
RUN apt-get update
RUN apt-get install -y openssh-server wget unzip curl 

# POSTGRE
RUN apt-get update
RUN apt-get -y -q install python-software-properties software-properties-common
RUN apt-get -y -q install postgresql postgresql-client postgresql-contrib
USER postgres
RUN    /etc/init.d/postgresql start &&\
    psql --command "	CREATE USER docker WITH SUPERUSER PASSWORD 'docker';" &&\
    createdb -O docker docker
RUN echo "host all  all    0.0.0.0/0  md5" >> /etc/postgresql/9.3/main/pg_hba.conf
RUN echo "listen_addresses='*'" >> /etc/postgresql/9.3/main/postgresql.conf
EXPOSE 5432
VOLUME  ["/etc/postgresql", "/var/log/postgresql", "/var/lib/postgresql"]
CMD ["/usr/lib/postgresql/9.3/bin/postgres", "-D", "/var/lib/postgresql/9.3/main", "-c", "config_file=/etc/postgresql/9.3/main/postgresql.conf"]

#JAVA 
USER root
RUN cd /opt
RUN wget --no-check-certificate --no-cookies --header "Cookie: oraclelicense=accept-securebackup-cookie" http://download.oracle.com/otn-pub/java/jdk/8u5-b13/jdk-8u5-linux-x64.tar.gz
RUN echo "export JAVA_HOME='jdk1.8.0_05'" >> /root/.bashrc
source /root/.bashrc

# GRAILS
USER root
RUN curl -s get.gvmtool.net | bash
RUN yes | gvm install grails

