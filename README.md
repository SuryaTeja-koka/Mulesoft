# Mulesoft
This is my MuleSoft Coding Problem's Solution



## Softwares and Languages Used:
  1) I selected MYSQL as my database to do the operations and the jar file I used is mysql-connector-java-8.0.24 (Type-4 driver)
     1.1 You can simply download the jarfile from this website (https://jar-download.com/artifacts/mysql/mysql-connector-java) or I am also uploading the jarfile along the project to make it easy for you.
     1.2 My port number for MYSQL is 3306, username: root, password: root
  
  2) I used java to connect to the database (JDBC) and I used Eclipse IDE to create and run the project
  

## Approach and General Idea:

  1) I have created a seperate class under the Connection package -- It returns me the connection object whenever I call for a getConnection method.
  2) I am using the connection object to establish connection between MySQL Database and java -- I used Prepared Statement as it is convenient to execute the same (or similar) SQL statements repeatedly with high efficiency.
  



## Tasks and My code naming conventions:

1) Connect to the SQLite database (or any Database you know): Used MYSQL.

2) Creating a new SQLite database – created, used java as the language and MYSQL(Type-4 Driver)

3) Creating a new table (Movies) using JDBC / Other Languages - Used JDBC - Creation code in CreatingMoviesTable.java

4) Inserting data into Movies table from a Java (any language) program - Insertion code in InsertingRecords.java

5) Querying data from Movies table with or without parameters  
	5.1 after having the movies data in the table, you need to query the movie details (name, actor, actress, director, year of release) using a SELECT statement - code present in DisplayingALLRecords.java <br>
	5.2 You will need to write a program to issue a simple SELECT statement to query all rows from the Movies table, as well as use a query with parameter like actor name to select movies based on the actor's name - code present in DisplayRecordByActorName.java
