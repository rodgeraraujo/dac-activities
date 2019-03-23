mvn clean package
docker build -t payara/app .
docker run -p 8081:8080 -d --name app payara/app