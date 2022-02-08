<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
       <title>Login</title>
    <style>
        .container {
            height: 400px;
            width: 350px;
            box-shadow: 1px 1px 2px 1px gray;
            border-radius: 10px;
            margin: auto;
            position: relative;
            top: 150px;
        }

        .logindiv {
            margin: auto;
            width: 210px;
            text-align: center;
            padding-top: 40px;
        }

        .loginform {
            display: flex;
            flex-direction: column;
        }

        .loginform>input {
            height: 30px;
            width: 200px;
        }

        .loginform>button {
            margin: auto;
            margin-top: 30px;
        }

        .submit {
            height: 30px;
            width: 100px;
            color: white;
            background-color: blue;
            border: none;
            border-radius: 2px;
            font-family: 'Trebuchet MS', sans-serif;
        }
    </style>
</head>

<body>


    <div class="container">
        <div class="logindiv">
            <h2 style="font-family: 'Trebuchet MS', sans-serif; color:blue">INFOAZA</h2>
            <form action="loginuser" class="loginform">
                <input placeholder="Username" type="text" name="user_name" style="margin-top: 60px;">
                <input placeholder="Password" type="password" name="user_pass" style="margin-top: 30px;">
                <button class="submit">Submit</button>
            </form>
        </div>

    </div>
</body>
</html>