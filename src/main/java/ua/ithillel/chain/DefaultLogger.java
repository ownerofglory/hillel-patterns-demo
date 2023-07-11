package ua.ithillel.chain;

import java.util.Arrays;

public class DefaultLogger implements Logger {
    @Override
    public void info(String... vars) {
        System.out.println(Arrays.toString(vars));
    }
}
