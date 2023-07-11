package ua.ithillel.singleton;

public class MyConnection {
    private static MyConnection connection;

    private MyConnection() {
    }

    public static MyConnection getConnection() {
        if (connection != null) {
            connection = new MyConnection();
        }

        return connection;
    }


    public Object getData() {
        return "Hello";
    }
}
