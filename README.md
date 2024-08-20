# To-Do List Application

Este é um To-Do List construído com **Spring Boot**, **Thymeleaf** e banco de dados **H2** em memória. 
## Funcionalidades

- **CRUD de Tarefas:** Criação, leitura, atualização e exclusão de tarefas.
- **Gestão de Usuários:** Gerenciamento de usuários no sistema.
- **Integração com Thymeleaf:** Interface web construída com Thymeleaf para renderização dinâmica no lado do servidor.
- **Banco de Dados H2:** Banco de dados em memória para armazenamento temporário de dados, reiniciado a cada vez que a aplicação é desligada.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **Thymeleaf**
- **H2 Database**
- **Maven**

## Pré-requisitos

Certifique-se de ter o seguinte software instalado em sua máquina:

- **Java 17** ou superior
- **Maven 4**

## Como Rodar o Projeto

Siga os passos abaixo para rodar o projeto localmente:

1. **Clone o Repositório:**

   ```bash
   git clone https://github.com/aguedamaiara/ToDoSpring.git
   cd ToDoSpring
   ```

2. **Compile o Projeto:**

   Compile o projeto utilizando o Maven para garantir que todas as dependências sejam baixadas corretamente:

   ```bash
   mvn clean install
   ```

3. **Rodar a Aplicação:**

   Você pode rodar a aplicação diretamente usando o Maven ou executando o arquivo `.jar` gerado.

   - Usando Maven:

     ```bash
     mvn spring-boot:run
     ```

   - Ou, após a compilação:

     ```bash
     java -jar target/ToDoSpring.jar
     ```

4. **Acessar a Aplicação:**

   Uma vez que o servidor estiver rodando, acesse o aplicativo no navegador:

   ```
   http://localhost:8080
   ```

