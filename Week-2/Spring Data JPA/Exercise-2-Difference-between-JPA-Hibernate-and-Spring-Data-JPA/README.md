# Difference between JPA, Hibernate and Spring Data JPA

## Java Persistence API (JPA)

- JPA is a Java Specification (JSR 338).
- It provides a standard way to map Java objects to database tables.
- It does not provide an implementation.
- Hibernate, EclipseLink and OpenJPA are implementations of JPA.

---

## Hibernate

- Hibernate is an Object Relational Mapping (ORM) framework.
- It is one of the most popular implementations of JPA.
- It provides Session API, Transaction management and Query Language (HQL).
- Requires more boilerplate code compared to Spring Data JPA.

---

## Spring Data JPA

- Spring Data JPA is built on top of JPA.
- It uses Hibernate (or another JPA provider) internally.
- Reduces boilerplate code.
- Automatically generates CRUD methods.
- Integrates with Spring Boot.
- Manages transactions using @Transactional.

---

## Comparison

| Feature | JPA | Hibernate | Spring Data JPA |
|----------|-----|-----------|-----------------|
| Type | Specification | ORM Framework | Spring Module |
| Implementation | No | Yes | Uses JPA |
| Boilerplate Code | Medium | High | Very Low |
| Transaction Management | No | Manual | Automatic |
| CRUD Operations | Manual | Manual | Repository Methods |

---

## Conclusion

JPA defines the standard.

Hibernate implements the standard.

Spring Data JPA simplifies Hibernate and JPA by reducing boilerplate code and providing repository-based data access.