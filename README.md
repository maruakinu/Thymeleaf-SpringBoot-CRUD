# SpringBoot-PosgreSQL-CRUD
CRUD operation using springboot as backend framework and postgreSQL as database


INSTRUCTIONS

IDE for SpringBoot, PostgreSQL and API testing tool are required for this project

Import the CSV file or create a table in your postgreSQL database with a name of 'article' that has the following columns 'id', 'title' and 'description'


 Add New Article

 POST METHOD
 localhost:8080/api/post
 
 {
    "title": "title",
    "description": "description"
 }
 
 Get Article by ID
 localhost:8080/api/article/3


 Update Article by Id
 localhost:8080/api/article/3

 {
    "title": "new title",
    "description": "new description"
 }

 Delete Article by ID
 localhost:8080/api/article/3
