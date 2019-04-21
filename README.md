# VirtualBook
Java 1.8
PostgreSQL 9.5
IDE - Spring Tool Suite
ThymeLeaf
MaterializeCSS 1.0.0 standard version CSS e JS -> src/main/resources/static/materialize

Application.properties
spring.datasource.url=jdbc:postgresql://localhost:5432/virtualbook
spring.datasource.username=postgres
spring.datasource.password=admin
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.hibernate.ddl-auto=update

OBS: [ Classe model Livro ]  os campos IdCliente, dataAquisicao, dataEntrega devem ser "setados" manualmente no momento da aquisição.
