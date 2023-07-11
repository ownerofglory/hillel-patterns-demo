package ua.ithillel.chain;

public class LoggingFilter extends Filter {
    private static final Logger LOGGER = new DefaultLogger();
    @Override
    public void doFilter(Request request, Response response) {
        LOGGER.info("Requst arrived", request.toString());

        if (next != null) {
            next.doFilter(request, response);
        }

        LOGGER.info("Response returned", response.toString());
    }
}
