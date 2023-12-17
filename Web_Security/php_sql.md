# PHP and SQL

## Overview
In our last lesson we setup a SQL database, now we would like to access that information in the database on our website.  We will create sites using PHP that can display information found in a SQL database.

## Purpose
Modern websites use databases to store and manage information.  We want to better understand the framework that makes the connection between a webpage and a database possible.

### Objectives
#### Students will be able to:
- Display information from their database on a web page.

### Preparation

### Links
- For the Teacher
  - [https://www.vice.com/en_us/article/aekzez/the-history-of-sql-injection-the-hack-that-will-never-go-away](https://www.vice.com/en_us/article/aekzez/the-history-of-sql-injection-the-hack-that-will-never-go-away)
- For the Students


### Vocabulary

### Teaching Guide
### Activity
Follow the guides on code academy for PHP and SQL.
- These will help you better understand how these languages work.
- Understanding the language will allow you to follow how the flaws are exploited.

### Activity
Upload the ExampleForms.html and ExampleForms.php to your web server.
- [ExampleForms.html](html/ExampleForms.html)
- [ExampleForms.php](html/ExampleForms.php)

Verify that the information has been added to the database by logging into the MySQL server and typing
select * from names;

### Activity
Using a MySQL database in command line is not a very convenient way to see the info in a database. Upload the pullData.html & pullData.php documents to the server.
Verify that they can display the contents of the database to a web page.
- [pullData.html](html/pullData.html)
- [pullData.php](html/pullData.php)

### Discussion
- This is not a very secure way to display the contents of a database.
- Is there a way to add authentication?


### Activity
Add the pullDataAdmin.html & pullDataAdmin.php documents to your project.
- [pullDataAdmin.html](html/pullDataAdmin.html)
- [pullDataAdmin.php](html/pullDataAdmin.php)
Follow the [Secure Viewing SQL with HTML.docx](docs/Secure_Viewing_SQL_HTML.docx) document to create a secure, password protected method to see the contents of an SQL database.

- This is not totally Secure.
- How can this form be broken into?
- What allows this type of from to be injected using a simple SQL injection?

### Activity
Add the contact.html, contact.php, and messages.php documents to your project.
- [contact.html](html/contact.html)
- [contact.php](html/contact.php)
- [messagesAdmin.html](html/messagesAdmin.html)
- [messagesAdmin.php](html/messagesAdmin.php)

Add a table to your mySQL database called messages with columns name, subject, message.
Test to make sure the contact.html/php will post to the database and that messages.php will read messages.

Now type a message that has some HTML in it. What happens in the message viewing center?
What happens if you type a message like &lt; script &gt; alert("Surprise!") &lt; /script &gt;?

Now, make this whole thing secure so we can't do this type of injection and need a secure log in to see our messages.

### Wrap-up
- How could your secure site be made truly secure?
- Why did the SQL injection work?
- How did knowing the protocols of SQL and PHP allow you to break the security you had built?

### Assessment Questions

### Extended Learninghttps://derekbabb.github.io/CyberSecurity/
- Buggy Web App [https://www.mmebvba.com/sites/bwapp/index.htm](https://www.mmebvba.com/sites/bwapp/index.htm)
- Hacksplaining Lessons [https://www.hacksplaining.com/lessons](https://www.hacksplaining.com/lessons)
- Bobby Tables [https://bobby-tables.com/](https://bobby-tables.com/)
- Pentest Ground [https://pentest-ground.com/](https://pentest-ground.com/)
### Standards Alignment
Indiana - CS3S-1.2
Indiana - CS3S-2.1
Indiana - CS3S-4.1
## License
[Cyber Security Curriculum](https://github.com/DerekBabb/CyberSecurity) <a rel="license" href="http://creativecommons.org/licenses/by-nc-sa/4.0/"><img alt="Creative Commons License" style="border-width:0" src="https://i.creativecommons.org/l/by-nc-sa/4.0/88x31.png" /></a> is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-sa/4.0/">Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License</a>.
