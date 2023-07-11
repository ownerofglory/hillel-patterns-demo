package ua.ithillel.factory;

public class SeaLogistics extends Logistics {
    // fields...

    @Override
    public void deliver() {
        System.out.println("Delivering over the sea");
    }
}
