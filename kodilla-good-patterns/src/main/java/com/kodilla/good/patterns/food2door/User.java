package com.kodilla.good.patterns.food2door;

public final class User {
    private final String userName;
    private final String userSurname;
    private final String userAddress;

    public User(final String userName, final String userSurname, final String userAddress) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.userAddress = userAddress;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getUserAddress() {
        return userAddress;
    }
}
