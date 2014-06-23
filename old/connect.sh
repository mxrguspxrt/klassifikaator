#!/bin/bash

export DOCKER_IP=192.168.59.103

export APPS_FOLDER="`pwd`"
sudo bash -c "echo '$APPS_FOLDER -rw -network 192.168.59.0 -mask 255.255.255.0' > /etc/exports"
sudo nfsd restart

export DOCKER_HOST="tcp://$DOCKER_IP:2375"
alias docker="sudo docker -H $DOCKER_HOST"
docker run -v /Users/dte/Projects/klassifikaator/apps:/srv/ -a stdin -a stdout -i -t devbox /bin/bash 
