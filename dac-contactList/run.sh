docker build -t payara/database ./database
docker run -p 5433:5432 -d --name database payara/database
mvn clean package
docker build -t payara/app .
docker run -p 4848:4848 -p 8081:8080 -d --name app --link database:host-banco payara/app