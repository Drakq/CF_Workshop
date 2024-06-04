# Startup

## Run App
```bash
.\gradlew build
java -jar .\build\libs\Workshop-0.0.1-SNAPSHOT.war --SPRING.PROFILES.ACTIVE=dev
```

## Deploy
### Build WAR
```bash
./gradlew clean build
```

### Push to Cloud Foundry
```bash
cf push
```