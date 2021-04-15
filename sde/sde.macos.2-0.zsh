#!/bin/zsh



brew install adoptopenjdk
brew install eclipse-java

brew install tesseract tesseract-lang

#
mkdir -p ../3rd/libs/mit

curl https://projectlombok.org/downloads/lombok.jar --output ../3rd/libs/mit/lombok.jar

#curl https://repo1.maven.org/maven2/net/java/dev/jna/jna-platform/5.8.0/jna-platform-5.8.0.jar --output ../3rd/libs/apache2/jna-platform-5.8.0.jar
#curl https://github.com/java-native-access/jna/blob/master/lib/native/darwin-x86-64.jar --output ../3rd/libs/apache2/darwin-x86-64.jar


#EOF
