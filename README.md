Hibernate Tutorial Project with Gradle
-----------------------

Project created with the 'gradle-quickstart' lazybones template

Use to explore hibernate and common tools

* [github](https://github.com/ngandriau/hibernateTutorialNico)
* bintray
* travis
* cobertura
* findbugs
* jdepend
* codenarc

# Howto:

## intellij-idea integration

Just import the projet from the build.gradle

## run the tests

    ./gradlew test

!!Currently broken, work from IDEA, but not from gradle. Cannot find the Id generator from package-info.java

## generate code coverage report

    ./gradlew cobertura

  report is then located at `~/build/reports/cobertura/index.html`



