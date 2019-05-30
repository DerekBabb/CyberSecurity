<html>
  <head>
    <title>The data</title>
  </head>
  <body>
    <h1>
      Database information
    </h1>
    <?php
      /* Attempt MySQL server connection. Assuming you are running MySQL
      server with default setting (user 'root' with no password) */
      $link = mysqli_connect("localhost", "root", "", "mysql");
      // Check connection
      if($link === false){
        die("ERROR: Could not connect. " . mysqli_connect_error());
      }
      echo "Connected successfully (".$link->host_info.")";
      echo "<br><hr>";
      //This is the SQL command
      $sqlStr = "Select * from names;";

      $selRes = $link->query($sqlStr);
      echo $sqlRes;
      if ($selRes)
      {
        while($selRow = mysqli_fetch_assoc($selRes))
        {
          echo $selRow['lastName'] . ', ' . $selRow['firstName'] . '<br/>';
        }
      }
       // Close connection
      mysqli_close($link);
    ?>
  </body>
</html>
