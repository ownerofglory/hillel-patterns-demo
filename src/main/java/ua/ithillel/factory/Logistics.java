package ua.ithillel.factory;

public abstract class Logistics {
    public abstract void deliver();

    public static Logistics createTransport(LogisticsType type) {
        if (type == LogisticsType.ROAD) {
            return new RoadLogistics();
        } else if (type == LogisticsType.SEA) {
            return new SeaLogistics();
        }

        throw new RuntimeException();
    }
}
