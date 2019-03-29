docker build -t bandas/banco ./postgres
docker run -p 5433:5432 -d --name banco bandas/banco

mvn clean package
docker build -t bandas/datasource .
docker run -p 8080:8080 -p 4848:4848 -d --name app --link banco:host-banco bandas/datasource