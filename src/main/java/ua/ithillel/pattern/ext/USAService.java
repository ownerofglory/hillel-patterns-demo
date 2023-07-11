package ua.ithillel.pattern.ext;

import ua.ithillel.pattern.adapter.Information;

public class USAService {
    public Information getInformation(String fistname, String lastname) {
        return new Information("Info for: " + fistname + " " + lastname);
    }
}
