package com.isa.marcinpt.model;

public class User {
    private String userName;
    private String teamName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public User() {
    }

    public User(String userName, String teamName) {
        this.userName = userName;
        this.teamName = teamName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", teamName='" + teamName + '\'' +
                '}';
    }
}
