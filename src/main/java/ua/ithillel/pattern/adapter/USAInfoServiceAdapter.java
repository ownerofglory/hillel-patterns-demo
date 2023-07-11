package ua.ithillel.pattern.adapter;


import ua.ithillel.pattern.ext.USAService;

public class USAInfoServiceAdapter implements InfoService {
    private USAService usaService;

    public USAInfoServiceAdapter(USAService usaService) {
        this.usaService = usaService;
    }

    @Override
    public Information getInfo(String name) {
        String[] s = name.split(" ");
        return usaService.getInformation(s[0], s[1]);
    }
}
