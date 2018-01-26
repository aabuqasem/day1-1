package edu.acc.j2ee.hubbub;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Post implements Serializable {
    private User author;
    private String content;
    private LocalDateTime posted;

    public Post() {
    }

    public Post(User author, String content, LocalDateTime posted) {
        this.author = author;
        this.content = content;
        this.posted = posted;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getPosted() {
        return posted;
    }

    public void setPosted(LocalDateTime posted) {
        this.posted = posted;
    }

    @Override
    public String toString() {
        return "Post{" + "author=" + author + ", content=" + content + ", posted=" + posted + '}';
    }

    
}
