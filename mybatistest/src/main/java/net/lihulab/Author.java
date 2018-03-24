package net.lihulab;

public class Author {
    private int id;
    private String username;
    private String password;
    private String email;
    private String bio;
    private String favouriteSection;

    public Author() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String e) {
        this.email = e;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String b) {
        this.bio = b;
    }

    public String getFavouriteSection() {
        return favouriteSection;
    }

    public void setFavouriteSection(String f) {
        this.favouriteSection = f;
    }
}