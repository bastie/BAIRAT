#!/bin/zsh



brew install adoptopenjdk
brew install eclipse-java


#
mkdir -p ../3rd/libs/mit

curl https://projectlombok.org/downloads/lombok.jar >../3rd/libs/mit/lombok.jar

#EOF
