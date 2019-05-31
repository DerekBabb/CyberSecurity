 <?php
   /* Attempt MySQL server connection. Assuming you are running MySQL
   server with default setting (user 'root' with no password) */
   $link = mysqli_connect("localhost", "root", "", "mysql");

   // Check connection
   if($link === false){
       die("ERROR: Could not connect. " . mysqli_connect_error());
   }

   // Attempt insert query execution
   // names is the table
   // firstName & lastName are the columns
   // the values are pulled from the post in the HTML forms documemt
   $sql = "INSERT INTO messages (name, subject, message) VALUES ('$_POST[name]','$_POST[subject]','$_POST[message]')";

   if(mysqli_query($link, $sql)){
       echo "Records inserted successfully.";
   } else{
       echo "ERROR: Could not able to execute $sql. " . mysqli_error($link);
   }

   // Close connection
   mysqli_close($link);
 ?>
