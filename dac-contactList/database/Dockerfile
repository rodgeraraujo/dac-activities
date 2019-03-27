FROM postgres:latest

ENV POSTGRES_DB contactList
ENV POSTGRES_USER postgres
ENV POSTGRES_PASSWORD 123

COPY create.sql /docker-entrypoint-initdb.d/

