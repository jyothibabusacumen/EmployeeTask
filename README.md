                                                         springboot-RestApi-Example
A complete Spring Boot example application for REST APIs.

**Installation**
1. make sure that java8 and maven latest version installed.
2. clone this repo that https://github.com.

**Contents**
1. Src
2. Target
3. pom
4. .gitignore
5. README

#src

consists of two modules 1. Main 
                        2. Test
                        
main module consists of java classes and resources.resources consists of static ,templates and application properties.
Test module consists of TestCases.

#Target
Target get generated once we build our project.It consists of classes,generated-sources , generated-test-sources,test-classes.

#pom
project object model(pom) it consists of maven dependencies , plugins and required libraries.

#gitignore
.gitignore tells which files  should ignore i.e to untrack from working directory.

#README.md
it tells main aid of projects,contents ,usage etc..

# Run the project
java -jar Demo<version>.jar

#Build the project
mvn install
