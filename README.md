# GraphQL CRUD API with Spring Boot

This project implements a **GraphQL CRUD API** using **Spring Boot**. It allows you to interact with data efficiently through GraphQL queries and mutations.

---

## 🚀 Features
- **GraphQL Integration** with Spring Boot.
- Full CRUD Operations: Create, Read, Update, Delete.
- Simple Schema & Resolvers for easy customization.
- Integration with an in-memory database (**H2**) for quick setup.
- RESTful and GraphQL endpoints coexist.

---

## 🛠️ Technologies Used

- **Java 17**  
- **Spring Boot**  
- **GraphQL Java** (with Spring Boot Starter)  
- **Spring Data JPA**  
- **H2 Database** (or MySQL/PostgreSQL, as needed)  
- **Lombok**  
- **Maven**  

---

## ⚙️ Setup and Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/samyrh/GraphQL.git

   ```

2. **Install Dependencies**
   Ensure you have Maven installed, then run:
   ```bash
   mvn clean install
   ```

3. **Run the Application**
   ```bash
   mvn spring-boot:run
   ```
   The application will be available at:
   - **http://localhost:8080/graphql** for GraphQL queries.
   - **http://localhost:8080/h2-console** to view the database (default credentials).

---

## 📜 GraphQL Schema Example

Here is the GraphQL schema for a basic `Book` entity:

```graphql
# Book Entity Schema
schema {
  query: Query
  mutation: Mutation
}

type Book {
  id: ID!
  title: String!
  author: String!
}

type Query {
  getBook(id: ID!): Book
  listBooks: [Book]
}

type Mutation {
  createBook(title: String!, author: String!): Book
  updateBook(id: ID!, title: String, author: String): Book
  deleteBook(id: ID!): String
}
```

---

## 📚 Example Queries & Mutations

### 1. Fetch All Books
```graphql
query {
  listBooks {
    id
    title
    author
  }
}
```

### 2. Fetch a Single Book
```graphql
query {
  getBook(id: 1) {
    id
    title
    author
  }
}
```

### 3. Create a New Book
```graphql
mutation {
  createBook(title: "Spring Boot Essentials", author: "John Doe") {
    id
    title
    author
  }
}
```

### 4. Update a Book
```graphql
mutation {
  updateBook(id: 1, title: "Updated Title") {
    id
    title
    author
  }
}
```

### 5. Delete a Book
```graphql
mutation {
  deleteBook(id: 1)
}
```

---

**Happy Coding! 🚀**
