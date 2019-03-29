mvn clean
docker stop app
docker rm app
docker rmi bandas/datasource
docker stop banco
docker rm banco
docker rmi bandas/banco
