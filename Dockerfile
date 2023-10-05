# 베이스 이미지로 OpenJDK 17을 사용
FROM openjdk:17-jdk-slim

# 애플리케이션 JAR와 함께 필요한 라이브러리나 기타 파일들을 Docker 이미지에 복사
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar

# Spring Boot 애플리케이션 실행
ENTRYPOINT ["java","-jar","/app.jar"]
