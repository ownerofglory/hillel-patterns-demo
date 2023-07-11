package ua.ithillel.chain;

public class MyServer extends Server {
    private Handler handler;
    private Filter filterChain;

    public MyServer(Handler handler) {
        this.handler = handler;
    }

    public MyServer(Handler handler, Filter filterChain) {
        this.handler = handler;
        this.filterChain = filterChain;
    }

    @Override
    public void server(Request request, Response response) {
        filterChain.doFilter(request, response);

        Response handle = handler.handle(request);

        response.setData(handle.getData());
        response.setCode(handle.getCode());
    }
}
