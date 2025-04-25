Este é um projeto CRUD completo em **Spring Boot**, usando arquitetura MVC, persistência com **MySQL**, e testes via Postman ou Bruno.
As entidades principais são **Produto** e **Categoria**, com relacionamento `@ManyToOne` entre elas.

**requisitos**
- Java 17+ (ou 11)
- Maven
- Spring Boot
- MySQL
- VS Code ou IntelliJ
- XAMPP

Instalação e Configuração do MySQL com XAMPP

1. Baixe e instale o XAMPP:
   https://www.apachefriends.org/index.html

2. Abra o XAMPP Control Panel e clique em "Start" no serviço MySQL.

3. Acesse http://localhost/phpmyadmin

4. Clique em “Novo” no menu à esquerda.

5. Crie o banco com:
   - Nome: bancocrud
