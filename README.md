
# Diagrama de Relacionamento de Entidades

Este diagrama mostra o relacionamento entre as entidades do sistema.

```mermaid
classDiagram
    class User {
        +Long id
        +String name
        +String email
        +String phone
        +String password
        +List<Order> orders
    }

    class Order {
        +Long id
        +Instant moment
        +Integer orderStatus
        +User client
        +Set<OrderItem> items
        +Payment payment
    }

    class OrderItem {
        +OrderItemPK id
        +Integer quantity
        +Double price
    }

    class Payment {
        +Long id
        +Instant moment
        +Order order
    }

    class Product {
        +Long id
        +String name
        +String description
        +Double price
        +String imagUrl
        +Set<Category> categories
        +Set<OrderItem> items
    }

    class Category {
        +Long id
        +String name
        +Set<Product> products
    }

    User "1" --> "0..*" Order : places
    Order "1" --> "0..*" OrderItem : contains
    OrderItem "0..*" --> "1" Product : references
    Order "1" --> "1" Payment : has
    Product "0..*" --> "0..*" Category : belongsTo
    Product "0..*" --> "0..*" OrderItem : includedIn
