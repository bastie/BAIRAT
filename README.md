# BAIRAT
Basties Artificial Intelligence Robot process Automation Test

Attention: This is a PoC project.

## Notes
Project using 

* Dependency and Buildsystem (Maven), 
* Java Dialect (Lombok), 
* OCR (Tesseract with tess4j), 
* RDBMS (H2Database )
* JPA (Hibernate)

and is under developing with 

* vi, 
* Eclipse

under using from

* Java 11+,
* zsh


### Runtime notes

* tesseract
* tesseract-lang [optional]
* jna.library.path=/opt/local/lib/:/usr/local/Cellar/tesseract/4.1.1/lib     #if it is same on your system
* tesseractInstance.setDatapath("/usr/local/Cellar/tesseract-lang/4.1.0/share/tessdata/");        // if it is same on your system



## Productselection
* Maven - it works
* Lombok - nice, fast, integrated killer of boilerplate code for Java
* Tesseract - no better especially purer Java impl. found
* H2Database - it is ok for now and abstraction layer invisible the underlying database
* Hibernate - it is discussed and recommended by some advisors

* vi - fast, small, work, but I am not an expert
* Eclipse - JBuilder doesn't work
* Java 11+ - last LTS and I'm familiar with Java
* zsh - default cli from underlying OS



``#EOF``