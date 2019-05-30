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
    //Get the username and password that they typed 
    $name = $_POST['username'];
    $pass = $_POST['password'];
    //Check our database to see if there are any records where this matches.
    $sqlStr = "SELECT * FROM users WHERE username = '$name' and password = '$pass';";

    $result = $link->query($sqlStr);
    $num_rows = $result->num_rows;

    //If there are one or more people in our user list with this user/password combo, display info.
    if ($num_rows > 0)
    {

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
    }

    //There was nobody with this name & password.
    else
    {
      echo 'Invalid username & password.';
    }
    // Close connection
    mysqli_close($link);
    ?>
  </body>
</html>
