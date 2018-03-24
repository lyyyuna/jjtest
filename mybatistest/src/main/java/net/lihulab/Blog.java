package net.lihulab;

import java.util.ArrayList;

public class Blog{
    private int id;
    private String title;
    private Author author;
    private ArrayList<Post> posts;

    public Blog() {}

    public Blog(Integer id) {
        super();
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor(){
        return author;
    }

    public void setAuthor(Author au) {
        this.author = au;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> ps) {
        this.posts = ps;
    }
}