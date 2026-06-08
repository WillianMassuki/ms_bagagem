# MS Bagagem

## Descrição

O **MS Bagagem** é um microserviço desenvolvido com Spring Boot responsável pelo gerenciamento de bagagens em um sistema aeroportuário. A aplicação disponibiliza APIs REST para cadastro, consulta, atualização e exclusão de informações relacionadas às bagagens.

## Tecnologias Utilizadas

* Java 21
* Spring Boot 4.0.6
* Spring Data JPA
* Spring MVC
* PostgreSQL
* SpringDoc OpenAPI (Swagger)
* Maven
* Spring Cloud 2025.1.1

## Dependências Principais

| Dependência                  | Descrição                      |
| ---------------------------- | ------------------------------ |
| Spring Boot Starter WebMVC   | Desenvolvimento de APIs REST   |
| Spring Boot Starter Data JPA | Persistência de dados          |
| PostgreSQL Driver            | Conexão com banco PostgreSQL   |
| SpringDoc OpenAPI            | Documentação automática da API |
| Spring Boot DevTools         | Ferramentas de desenvolvimento |
| Spring Boot Test             | Testes unitários e integração  |

## Pré-requisitos

Antes de executar a aplicação, certifique-se de possuir instalado:

* Java 21 ou superior
* Maven 3.9+
* PostgreSQL 15+
* Docker (opcional)

## Configuração do Banco de Dados

Exemplo de configuração no arquivo `application.yml`:

```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/ms_bagagem
    username: postgres
    password: 1234

  jpa:
    hibernate:
      ddl-auto: update

    show-sql: true

    properties:
      hibernate:
        format_sql: true
```

## Executando com Docker

Criar o container PostgreSQL:

```bash
docker run -d \
  --name postgres-ms-bagagem \
  -e POSTGRES_DB=ms_bagagem \
  -e POSTGRES_USER=postgres \
  -e POSTGRES_PASSWORD=1234 \
  -p 5432:5432 \
  postgres:latest
```

## Executando a Aplicação

Clone o projeto:

```bash
git clone <url-do-repositorio>
```

Acesse o diretório:

```bash
cd ms_bagagem
```

Compile o projeto:

```bash
mvn clean install
```

Execute a aplicação:

```bash
mvn spring-boot:run
```

## Documentação da API

Após iniciar a aplicação, a documentação Swagger estará disponível em:

```text
http://localhost:8080/swagger-ui.html
```

ou

```text
http://localhost:8080/swagger-ui/index.html
```

A especificação OpenAPI estará disponível em:

```text
http://localhost:8080/v3/api-docs
```

## Estrutura do Projeto

```text
src
├── main
│   ├── java
│   │   └── br/com/ms_bagagem
│   │       ├── controller
│   │       ├── service
│   │       ├── repository
│   │       ├── model
│   │       └── config
│   └── resources
│       ├── application.yml
│       └── data.sql
└── test
```

## Testes

Executar todos os testes:

```bash
mvn test
```

Gerar relatório de testes:

```bash
mvn verify
```

## Build

Gerar o artefato da aplicação:

```bash
mvn clean package
```

O arquivo JAR será criado em:

```text
target/ms_bagagem-0.0.1-SNAPSHOT.jar
```

## Executar o JAR

```bash
java -jar target/ms_bagagem-0.0.1-SNAPSHOT.jar
```

## Autor

Projeto desenvolvido para fins acadêmicos e de estudo utilizando arquitetura baseada em microserviços.
