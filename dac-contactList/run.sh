cd database
docker build -t payara/database .
docker run -p 5433:5432 -d --name database payara/database

cd ..

mvn clean package

docker build -t payara/app .
docker run -p 4848:4848 -p 8081:8080 --name app --link database:host-banco payara/app
