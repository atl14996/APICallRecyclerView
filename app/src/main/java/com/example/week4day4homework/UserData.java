package com.example.week4day4homework;

public class UserData {

    String username;
    String avatarURL;
    int numRepos;
    String joinedDate;

    public UserData(String username, String avatarURL, int numRepos, String joinedDate) {
        this.username = username;
        this.avatarURL = avatarURL;
        this.numRepos = numRepos;
        this.joinedDate = joinedDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatarURL() {
        return avatarURL;
    }

    public void setAvatarURL(String avatarURL) {
        this.avatarURL = avatarURL;
    }

    public int getNumRepos() {
        return numRepos;
    }

    public void setNumRepos(int numRepos) {
        this.numRepos = numRepos;
    }

    public String getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(String joinedDate) {
        this.joinedDate = joinedDate;
    }
}
