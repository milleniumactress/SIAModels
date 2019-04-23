# SIAModels
Java classes representing objects available in UNPAR's Sistem Informasi Akademik. Requires Java 1.8.

Testing menggunakan Apache Maven.


# Test Plan
Cara membuat Test Plan :
Harus digenerate dulu dengan cara mengetik command $ mvn site di terminal, dan filenya bisa ditemukan di directory
../SIAModels/target/site/testapidocs/index.html.

# Test Report
Cara membuat Test Report :
Dengan menggunakan command $ mvn surefire-report:report, dan filenya bisa ditemukan di directory
../SIAModels/target/site/surefire-report.html

# Code Coverage Report
Cara membuat Code Coverage Report :
Dengan menggunakan command $ mvn package, dan filenya bisa ditemukan di directory
../SIAModels/target/site/jacoco/index.html

# Travis
Link Travis : https://travis-ci.com/milleniumactress/SIAModels
