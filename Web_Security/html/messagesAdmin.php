<html>
  <head>
    <title>Your Messages</title>
  </head>
  <body>
    <h1>
      Messages:
    </h1>
    <?php
      /* Attempt MySQL server connection. Assuming you are running MySQL
      server with default setting (user 'root' with no password) */
      $link = mysqli_connect("localhost", "root", "", "mysql");
      // Check connection
      if($link === false){
        die("ERROR: Could not connect. " . mysqli_connect_error());
      }
      //echo "Connected successfully (".$link->host_info.")";
      echo "<hr>";
      //Get the username and password that they typed 
      $name = $_POST['username'];
      $pass = $_POST['password'];
      //Check our database to see if there are any records where this matches.
      $sqlStr = "SELECT * FROM users WHERE username = '$name' and password = '$pass';";

      $result = $link->query($sqlStr);
      $num_rows = $result->num_rows;

      //If there are one or more people in our user list with this user/password combo, display info.
      if ($num_rows > 0){
        //This is the SQL command
        $sqlStr = "Select * from messages;";

        $selRes = $link->query($sqlStr);
        //echo $sqlRes;
        if ($selRes){
          echo "<table border = 1>";
          echo "<tr><td>Name</td><td>Subject</td><td>Message</td></tr>";
          while($selRow = mysqli_fetch_assoc($selRes)){
            echo "<tr>";
            echo "<td>";
            echo $selRow['name'];
            echo "</td><td>";
            echo $selRow['subject'];
            echo "</td><td>";
            echo $selRow['message'];
            echo "</td></tr>";
          }

          echo "</table>";
        }
      }
      else{
        echo "Invalid username or password.";
      }
       // Close connection
      mysqli_close($link);
    ?>
    <hr>
    <a href = "messagesAdmin.html">Back</a>
  </body>
</html>
