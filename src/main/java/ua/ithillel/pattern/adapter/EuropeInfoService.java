package ua.ithillel.pattern.adapter;

public class EuropeInfoService implements InfoService {
    @Override
    public Information getInfo(String name) {
        return new Information("Info for: "+ name);
    }
}
