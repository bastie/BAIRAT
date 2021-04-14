#!/bin/zsh



brew install adoptopenjdk
brew install eclipse-java

brew install tesseract tesseract-lang

#
mkdir -p ../3rd/libs/mit
mkdir -p ../3rd/libs/apache2
mkdir -p ../3rd/libs/bsd3

curl https://projectlombok.org/downloads/lombok.jar --output ../3rd/libs/mit/lombok.jar

curl https://repo1.maven.org/maven2/net/sourceforge/tess4j/tess4j/4.5.4/tess4j-4.5.4.jar --output ../3rd/libs/apache2/tess4j.jar
curl https://repo1.maven.org/maven2/net/sourceforge/lept4j/lept4j/1.14.0/lept4j-1.14.0.jar --output ../3rd/libs/apache2/lept4j.jar
curl https://repo1.maven.org/maven2/org/slf4j/slf4j-api/1.7.30/slf4j-api-1.7.30.jar --output ../3rd/libs/mit/slf4j-api.jar
curl https://repo1.maven.org/maven2/org/slf4j/slf4j-simple/1.7.30/slf4j-simple-1.7.30.jar --output ../3rd/libs/mit/slf4j-simple.jar

curl https://repo1.maven.org/maven2/com/github/jai-imageio/jai-imageio-core/1.4.0/jai-imageio-core-1.4.0.jar --output ../3rd/libs/bsd3/jai-imageio-core.jar 
curl https://repo1.maven.org/maven2/commons-io/commons-io/2.8.0/commons-io-2.8.0.jar --output ../3rd/libs/apache2/commons-io.jar

curl https://repo1.maven.org/maven2/net/java/dev/jna/jna/5.8.0/jna-5.8.0.jar --output ../3rd/libs/apache2/jna-5.8.0.jar
curl https://repo1.maven.org/maven2/net/java/dev/jna/jna-platform/5.8.0/jna-platform-5.8.0.jar --output ../3rd/libs/apache2/jna-platform-5.8.0.jar
curl https://github.com/java-native-access/jna/blob/master/lib/native/darwin-x86-64.jar --output ../3rd/libs/apache2/darwin-x86-64.jar


#EOF
