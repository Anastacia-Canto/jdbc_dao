# jdbc_dao

Project about database manipulation using JDBC and Data Access Object (DAO) design with dependency injection. 

The case context is about two entities (Seller and Department) that correspond to two tables on a database. These
tables are connected in a way that a department can have many sellers, so each seller contain an id of the correspondent
department. The querys are manipulated by specific methods defined in an object (DAO) that uses JDBC to connect to MySQL.
These objects are created and defined from an interface (DAOFactory - dependency injection).
