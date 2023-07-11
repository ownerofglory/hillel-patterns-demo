package ua.ithillel.chain;

public class DefaultHandler implements Handler {

    @Override
    public Response handle(Request request) {

        Response response = new Response();
        if (request.getData().equals("Hello")) {

            response.setCode(200);
            response.setData("Bye!");
        } else {
            response.setCode(404);
        }


        return response;
    }
}
