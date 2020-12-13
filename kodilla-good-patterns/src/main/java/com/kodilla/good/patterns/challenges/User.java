package com.kodilla.good.patterns.challenges;

public class User {
    private String name;
    private String surname;
    private boolean isAdult;

    public User(String name, String surname, boolean isAdult) {
        this.name = name;
        this.surname = surname;
        this.isAdult = isAdult;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean isAdult() {
        return isAdult;
    }
}
