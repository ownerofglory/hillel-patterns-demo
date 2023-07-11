package ua.ithillel.chain;

public class AuthFilter extends Filter {
    @Override
    public void doFilter(Request request, Response response) {
        System.out.println("Authorizing request: " + request);

        if (request.getData().equals("Hello")) {
            if (next != null) {
                next.doFilter(request, response);
            }
        } else {
            response.setCode(403);
            response.setData("Unauthorized");
        }


    }
}
