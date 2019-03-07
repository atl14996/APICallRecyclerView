package com.example.week4day4homework;

public class RepoData {

    private String name;
    private String owner;
    private String url;
    private int size;
    private String pushed;

    public RepoData(String name, String owner, String url, int size, String pushed) {
        this.name = name;
        this.owner = owner;
        this.url = url;
        this.size = size;
        this.pushed = pushed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getPushed() {
        return pushed;
    }

    public void setPushed(String pushed) {
        this.pushed = pushed;
    }
}
