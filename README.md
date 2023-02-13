# Asteroid Database Application

## Application Description
This application will allow you to connect to a database that contains information on asteroids. It will allow you to search the database for specfic 
asteroids based on the type of material it is constructed of as well as the Designation name assigned to it. Below are the steps on how to set up the 
application so you can access the database through a web page.

## Prerequisites
* Apache Netbeans
* MySQL Community Edition (ensure that you have MySQL installed)
* Apache Tomcat (ensure Apache Tomcat is installed in the Servers section of Services)
* mysql-connector (download and add jar file to Libraries)
* JDK 17 (ensure JDK is installed in Libraries)

## Application Setup
Your Library in Netbeans should look like this:

<img width="449" alt="Screenshot 2023-02-13 at 6 21 17 PM" src="https://user-images.githubusercontent.com/64021870/218596607-58402291-8e30-4a5a-b943-c63ce7a71aae.png">

<ins>Database</ins>

You have to add the asteroid data to your local mysql. In order to create the database download the sql files in the Database folder then log into mysql 
and run:

`source /your/path/to/asteroids.sql` then

`source /your/path/to/Asteroid_Data.sql`

These files can be found in the Database folder

<ins>To run the application</ins>

Once you open the project in Netbeans go to the AsteroidAssember.java file and replace the username and password in each of the DBConnect objects in every 
method with the login information for your local mysql user. 

<img width="776" alt="Process the information from the query" src="https://user-images.githubusercontent.com/64021870/218598422-fbb552f1-f998-4fd3-a175-380e90faabd4.png">

Now that the everything is configured run the project and the application will start in your web browser. It should look like the screen shot below:

<img width="1141" alt="Lincoln's Database Application" src="https://user-images.githubusercontent.com/64021870/218598530-58420e06-3c74-4bc6-a0b9-270057babc17.png">

Enter the type and Designation, click submit, and the asteroid information will be displayed. For example if you enter ‘Carboneous’ for type and ’C-f4314-j’ 
for Designation you will see the screen shot below:

<img width="1318" alt="Asteroid Information" src="https://user-images.githubusercontent.com/64021870/218598723-c1a55889-a8c5-4788-aa98-d4031258a3ef.png">

Different Type’s and Designation’s can be found in the Asteroid_Data.sql file. Fell free to use them to test out the application!
