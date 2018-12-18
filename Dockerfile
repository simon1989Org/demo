FROM openjdk:8
MAINTAINER 243120877@qq.com
LABEL app="demoApp" version="0.0.1" by="Simon"
COPY ./target/demo-0.0.1-SNAPSHOT.jar demo.jar
CMD java -jar demo.jar
EXPOSE 8080