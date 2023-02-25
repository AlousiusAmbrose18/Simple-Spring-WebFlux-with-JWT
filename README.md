# Simple-Spring-WebFlux-with-JWT

Description:
            This is simple spring web application which will give response based on the user authority.. In this project have used two different DataBase (Mysql and MangoDB) for two diffrent user group. For example: ADMIN and USER are the two different Group. So ADMIN can access and view all the data from MySqlDB and USER can only access and view MongoDB. Spring Security with JWT is used for authentication and authorization.. 
            
            #ListOfProducts ---> MySqlDB <----------> ADMIN 
            #ListOfBrands   ---> MangoDB <----------> USER

# Tools:

 IDE        : Spring-Tool-Suit 4
 DataBase   : Mysql, MangoDB
 project Structure : Maven
 
 ----------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
 # How to Run
 
 Change the DataBase configuration like host, username, password in Application.properties (src/main/resource). 
 Add user details as per UserInfo Entity.
 # host - /user/new               -- create new user
 # host - /user/authendicate      -- get JWT for existing user
 # host - /products/allproducts   -- to get all products (only  ADMIN can access )
 # host - /products/brand         -- to get all Brands (only  User can access )
  
          
