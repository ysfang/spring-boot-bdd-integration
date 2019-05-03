# Spring Boot BDD Integration
Spring Boot + Cucumber + Serenity with Gradle build


## BDD Integration Test
1. Download the [Chrome Web Driver v73.0](https://chromedriver.storage.googleapis.com/index.html?path=73.0.3683.68/) of your OS to the configured path in [serenity.conf](/src/bdd-test/resources/serenity.conf)   

2. Running below command and get Serenity report at: [/target/site/serenity/index.html](.//target/site/serenity/index.html)
```bash
./gradlew clean test
```

## Test Types
* Spring Boot + Cucumber + Serenity integrated tests are located in [/src/bdd-test](.//src/bdd-test)

* Regular Spring Boot tests are located in [/src/test](.//src/test)