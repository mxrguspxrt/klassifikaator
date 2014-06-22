#!/bin/bash

export DOCKER_HOST=tcp://192.168.59.103:2375
alias docker="sudo docker -H $DOCKER_HOST"
docker run -a stdin -a stdout -i -t devbox /bin/bash
