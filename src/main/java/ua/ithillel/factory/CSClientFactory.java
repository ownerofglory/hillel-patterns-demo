package ua.ithillel.factory;

public class CSClientFactory {
    public CSClient createCSClient(Region  region) {
        if (region == Region.EMEA) {
            return new EMEACSClient();
        } else if (region == Region.AMAP) {
            return new AMAPCSClient();
        }

        return null;
    }
}
