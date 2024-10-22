FROM openjdk:17
COPY "./target/pruebaSaber-1.jar" "app.jar"
EXPOSE 8146
ENTRYPOINT [ "java","-jar","app.jar" ]