package ua.ithillel.singleton.services;

import ua.ithillel.singleton.MyConnection;

public class ProductService {
    private final MyConnection connection;

    public ProductService(MyConnection connection) {
        this.connection = connection;
    }
}
