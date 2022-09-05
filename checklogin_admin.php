<?php
    session_start();
    $username=$_POST['id'];
    $password=$_POST['password'];
    $bool=true;
    include 'connect.php'; //Connect to server
	mysqli_select_db($con,"eschool");
    $query = mysqli_query($con,"Select * from admin WHERE id='$username'"); // Query the users table
    $num= mysqli_num_rows($query); //Checks if username exists
	$table_users="";
	$table_password="";
    if($num > 0) //IF there are no returning rows or no existing username
    {
       while($row = mysqli_fetch_assoc($query)) // display all rows from query
       {
		  $table_user=$row['id'];
          $table_password=$row['password'];
	   if(($username == $table_user) && ($password == $table_password))
		  {
             if($table_password==$password)
			 {
			 $_SESSION['admin_id'] = $username;			 //set the username in a session. This serves as a global variable
			 header('location:home_admin.php');
			 }			 // redirects the user to the authenticated home page
          }
		else{
        Print '<script>alert("Incorrect Username or Password!");</script>'; // Prompts the user
        Print '<script>window.location.assign("admin_login.php");</script>'; // redirects to login.php
		  }
        }
    }
    else
    {
        Print '<script>alert("Username doesn\'t exist!");</script>';// Prompts the user
        Print '<script>window.location.assign("admin_login.php");</script>';
    }

?>