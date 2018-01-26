<!DOCTYPE html>
<html>
    <head>
        <title>Hubbub&trade; Login</title>
    </head>
    <body>
        <div class="masthead">
            <img src="images/hubbub-logo.png"/>
        </div>
        <h1>Log In and Start Hackin'!</h1>
        <h2 class="flash">${flash}</h2>
        <form method="POST" action="main">
            <input type="hidden" name="action" value="login"/>
            Username: <input type="text" name="username" required/><br/>
            Password: <input type="password" name="password" required/><br/>
            <input type="submit" value="Get Hackin'"/>
        </form>
    </body>
</html>
