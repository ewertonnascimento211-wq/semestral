# 🗓️ Event Manager API (CRUD Java Spring Boot)

Um sistema de gerenciamento de usuários, endereços e eventos. A API permite cadastrar usuários, associar um endereço único a cada perfil e gerenciar uma lista de eventos que o usuário deseja participar.

---

## 🚀 Tecnologias Utilizadas

*   **Java 17** ou superior
*   **Spring Boot 3.x**
*   **Spring Data JPA** (Persistência de dados)
*   **Banco de Dados** (Ex: H2 Database / MySQL / PostgreSQL)
*   **Maven** (Gerenciador de dependências)
*   **Lombok** (Produtividade e redução de código boilerplate)

---

## 🛠️ Funcionalidades

### 👤 Usuários (Users)
*   Cadastrar novo usuário.
*   Listar todos os usuários cadastrados.
*   Buscar usuário por ID.
*   Atualizar dados do usuário.
*   Deletar usuário.

### 🏠 Endereços (Addresses)
*   Vincular um endereço obrigatório ou opcional ao usuário (Relação 1:1).
*   Atualizar endereço do usuário.

### 📅 Eventos (Events)
*   Criar e listar eventos globais disponíveis na plataforma.
*   **Inscrição em Eventos:** Permitir que um usuário adicione eventos à sua lista de participação (Relação N:N).

---

## 📋 Arquitetura do Banco de Dados (Entidades)

O sistema baseia-se em três entidades principais:
1.  **User**: Possui um `Address` (OneToOne) e uma lista de `Events` (ManyToMany).
2.  **Address**: Contém rua, número, cidade, estado e CEP.
3.  **Event**: Contém nome do evento, data, horário e local.

---

## 🛣️ Rotas da API (Endpoints Principais)

### Usuários
*   `GET /api/users` - Lista todos os usuários.
*   `GET /api/users/{id}` - Busca um usuário específico.
*   `POST /api/users` - Cria um novo usuário.
*   `PUT /api/users/{id}` - Atualiza um usuário.
*   `DELETE /api/users/{id}` - Remove um usuário.

### Eventos e Inscrições
*   `POST /api/events` - Cria um novo evento global.
*   `GET /api/events` - Lista todos os eventos disponíveis.
*   `POST /api/users/{userId}/events/{eventId}` - Inscreve o usuário em um evento.

---

## 💻 Como Executar o Projeto

### Pré-requisitos
*   Java 17 instalado.
*   Maven instalado.

### Passo a Passo

1. Clone o repositório:
```bash
git clone https://github.com
```

2. Entre na pasta do projeto:
```bash
cd nome-do-repositorio
```

3. Instale as dependências e compile o projeto:
```bash
mvn clean install
```

4. Execute a aplicação:
```bash
mvn spring-boot:run
```

A API estará disponível em `http://localhost:8080`.

---

## 👤 Autor

Desenvolvido por **Seu Nome**.
