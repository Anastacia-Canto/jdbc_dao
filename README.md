# jdbc_dao

Project about database manipulation using JDBC and Data Access Object (DAO) design pattern. 

## Concepts

- JDBC
  
  JDBC stands for Java Database Connectivity. It is an API that provides methods to query and update data in a relational database.This way you can create classes that define the actions you can operate on your database, as insert, delete, retrieve data and more using the JDBC tools. 

- DAO
  
  DAO stands for Data Access Object and it is useful to isolate database manipulation logic from service layer. This
  way we have a **model** which is the class of interest, an **interface** that defines all the methods to manipulate and access the class and a **concrete class** that implements this interface, where all the logic will be written. The layer that needs the model, will create it and use it through this concrete class.
  Bringing it to my case, we have one more step that is an static class that works as a unique point to instantiate either Seller or Department objects. 
  

## Study case
The case context is about two entities (Seller and Department) that correspond to two tables on a database. These
tables are connected in a way that a department can have many sellers, so each seller contain an id of the correspondent department. The queries are manipulated by specific methods defined in an object (DAO) that uses JDBC to connect to MySQL.
These objects are created and defined from an interface (DAOFactory).

![image](https://github.com/Anastacia-Canto/jdbc_dao/assets/91332251/61ad30da-7096-4d8c-96a0-0e35e124b165)

image from Nelio Alves, UDEMY course (Java Completo 2023 Programação Orientada a Objetos + Projetos). 


- Table examples

Seller Table:
| Id | Name              | Email            | BirthDate          | BaseSalary | DepartmentId |
|----|-------------------|------------------|--------------------|------------|--------------|
|1   |Meredith Grey      |grey@email.com    |1978-04-21 00:00:00 |2090        |2             |
|2   |Cristina Yang      |yang@email.com    |1971-07-20 00:00:00 |3000        |1             |
|3   |Isobel Stevens     |stevens@email.com |1981-06-23 00:00:00 |3000        |3             |
|4   |George O'Malley    |omalley@email.com |1973-03-26 00:00:00 |3000        |2             |
|5   |Alex Karev         |karev@email.com   |1970-09-19 00:00:00 |3000        |1             |


Department Table:
| Id | Name        |
|----|-------------|
|1   |Electronics  |
|2   |Books        |
|3   |Fashion      |

- Resources
  
  [JDBC](https://www.ibm.com/docs/en/informix-servers/12.10?topic=started-what-is-jdbc)
  
  [JDBC](https://docs.oracle.com/javase/8/docs/technotes/guides/jdbc/)

  [DAO](https://www.digitalocean.com/community/tutorials/dao-design-pattern)
  
