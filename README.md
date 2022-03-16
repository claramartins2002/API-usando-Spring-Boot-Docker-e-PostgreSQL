# Estudos Docker: PostgreSQL image

> API simples que utiliza como banco de dados uma imagem instanciada via Docker. 
## Linguagens e tecnologias utilizadas

- Spring Boot
- PostgreSQL
- Spring Web 
- Docker


## Descrição
A API possui a tabela Employee e é relacionada à EmployeeAudit, para adicionar o autor dos inserts via Http. Para iniciar a aplicação, primeiramente é preciso rodar via terminal `mvn clean install -DskipTests=true` para evitar erros de compilação dentro do container. Depois, é preciso rodar o `docker-compose up` para inicializar os documentos de configuração do Docker (o Dockerfile e o docker-compose.yml). 






