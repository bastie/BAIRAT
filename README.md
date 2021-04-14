# BAIRAT
Basties Artificial Intelligence Robot process Automation Test

## Notes
Use Maven, Gradle or what you need but also you can make a walk thru the dependency hell of Java 

Required Java coal of hell

* commons-io
* jai-imageio-core
* jna
* lept4j
* tess4j
* slf4j-api
* slf4j-simple [optional]

Runtime coal

* Java coal above
* tesseract
* tesseract-lang [optional]
* jna.library.path=/opt/local/lib/:/usr/local/Cellar/tesseract/4.1.1/lib     #if it is same on your system
* tesseractInstance.setDatapath("/usr/local/Cellar/tesseract-lang/4.1.0/share/tessdata/");        // if it is same on your system

Development coal

* runtime coal above
* eclipse [optional] or other IDE if you like
* vi [optional] never false to have a VI or a HAL-9000
* lombok
* jdk

Why do you walk? Because you can and you do and you know all potential security problem libraries...



