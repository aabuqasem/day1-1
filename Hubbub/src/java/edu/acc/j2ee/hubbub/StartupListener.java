package edu.acc.j2ee.hubbub;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class StartupListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        UserDao users = new UserDao();
        User johndoe = users.register("johndoe", "P@ssw0rd", "P@ssw0rd");
        sce.getServletContext().setAttribute("users", users);
        PostDao posts = new PostDao();
        posts.post(johndoe, "Hey! It's my first Hubbub Post! Whee!!");
        sce.getServletContext().setAttribute("posts", posts);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
