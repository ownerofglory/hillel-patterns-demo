package ua.ithillel.factory;

public class RoadLogistics extends Logistics {
    @Override
    public void deliver() {
        System.out.println("Delivering via road");
    }
}
