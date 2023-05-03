# SpringBoot-PosgreSQL-CRUD
CRUD operation using springboot as backend framework and postgreSQL as database

INSTRUCTIONS

IDE for SpringBoot, PostgreSQL and API testing tool are required for this project

1. Import the CSV file or create a table in your postgreSQL database with a name of 'article' that has the following columns 'id', 'title' and 'description'

API TESTING ( Open your API Testing Tool )

1. Add Article

        POST METHOD
        localhost:8080/api/post

         {
            "title": "title",
            "description": "description"
         }

2. Update Article by ID

        UPDATE METHOD
         localhost:8080/api/article/1

         {
            "title": "new title",
            "description": "new description"
         }

3. Delete Article by ID

        DELETE METHOD
        localhost:8080/api/article/1

4. Get Article by ID

        GET METHOD
        localhost:8080/api/article/3








