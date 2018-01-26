<!DOCTYPE html>
<html>
    <head>
        <title>Hubbub&trade; Assimilation</title>
    </head>
    <body>
        <div class="masthead">
            <img src="images/hubbub-logo.png"/>
        </div>        
        <h1>Join our Community!</h1>
        <h2 class="flash">${flash}</h2>
        <form method="POST" action="main">
            <input type="hidden" name="action" value="join"/>
            Choose a username: <input type="text" name="username" required/><br/>
            Pick a strong password: <input type="password" name="password1" required/><br/>
            Repeat that password: <input type="password" name="password2" required/><br/>
            <input type="submit" value="Sign me up!"/>
        </form>
    </body>
</html>
