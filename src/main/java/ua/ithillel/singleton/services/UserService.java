package ua.ithillel.singleton.services;

import ua.ithillel.singleton.MyConnection;

public class UserService {
    private final MyConnection connection;

    public UserService(MyConnection connection) {
        this.connection = connection;
    }
}
