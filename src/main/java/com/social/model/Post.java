package com.social.model;

public class Post {

    private String author;
    private String content;
    private int likes;
    private String image;

    public Post() {
    }

    public Post(String author, String content, int likes, String image) {
        this.author = author;
        this.content = content;
        this.likes = likes;
        this.image = image;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public int getLikes() {
        return likes;
    }

    public String getImage() {
        return image;
    }
}