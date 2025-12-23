# Projeto Spring Boot – API REST com JPA

Este é um projeto back-end desenvolvido em Java utilizando Spring Boot, seguindo o padrão de API REST, com persistência de dados usando JPA / Hibernate. O projeto foi criado com foco em aprendizado e prática dos principais conceitos de desenvolvimento back-end, baseado no curso do Nelio Alves.

## 🚀 Tecnologias utilizadas

Java  
Spring Boot  
Spring Data JPA  
Hibernate  
Maven  
Banco de Dados (H2 / PostgreSQL / MySQL, conforme configuração)  
Postman (para testes da API)

## 🏗️ Arquitetura do projeto

O projeto segue uma arquitetura em camadas, separando responsabilidades:

Entities – modelo de domínio  
Repositories – acesso aos dados  
Services – regras de negócio  
Resources – controladores REST  
Config – configurações da aplicação  

## 📂 Estrutura do projeto

src/main/java/com.educandoweb.course
│
├── config
│ └── TestConfig
│
├── entities
│ ├── enums
│ ├── pk
│ ├── Category
│ ├── Order
│ ├── OrderItem
│ ├── Payment
│ ├── Product
│ └── User
│
├── repositories
│
├── services
│
├── resources
│ ├── CategoryResources
│ ├── OrderResources
│ ├── ProductResources
│ └── UserResources
│
└── CourseApplication


## 🔗 Endpoints REST (exemplos)

GET /users  
GET /products  
GET /orders  
POST /users  
POST /orders  

Os endpoints podem ser testados utilizando o Postman.

## ⚙️ Como executar o projeto

1. Clone o repositório  
git clone https://github.com/davirezo/workshop-springboot3-jpa.git

css
Copiar código

2. Abra o projeto em uma IDE (IntelliJ IDEA ou STS)

3. Execute a classe `CourseApplication`

4. A aplicação estará disponível em  
http://localhost:8080

## 🎯 Objetivo do projeto

Praticar desenvolvimento back-end com Java  
Aprender Spring Boot na prática  
Entender JPA e Hibernate  
Desenvolver APIs REST  
Aplicar boas práticas de organização em camadas  
Evoluir o portfólio para oportunidades de estágio  

## 👨‍💻 Autor

Davi Rezo  
Estudante de Desenvolvimento Back-end Java
