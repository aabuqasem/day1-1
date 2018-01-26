<!DOCTYPE html>
<html>
    <head>
        <title>Post to Hubbub&trade;</title>
    </head>
    <body>
        <div class="masthead">
            <img src="images/hubbub-logo.png"/>
        </div>
        <h1>What are you hackin' on today?</h1>
        <h2 class="flash">${flash}</h2>
        <form method="POST" action="main">
            <input type="hidden" name="action" value="post"/>
            <textarea cols="50" rows="4" name="content"></textarea><br/>
            <input type="submit" value="Tell the world!"/>
        </form>
    </body>
</html>
