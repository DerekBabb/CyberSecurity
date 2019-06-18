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
      //This is the SQL command
      $sqlStr = "Select * from messages;";

      $selRes = $link->query($sqlStr);
      //echo $sqlRes;
      if ($selRes)
      {
        echo "<table border = 1>";
        echo "<tr><td>Name</td><td>Subject</td><td>Message</td></tr>";
        while($selRow = mysqli_fetch_assoc($selRes))
        {
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
       // Close connection
      mysqli_close($link);
    ?>
  </body>
</html>
