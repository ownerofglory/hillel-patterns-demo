package ua.ithillel.chain;

public class Request {
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Request{" +
                "data=" + data +
                '}';
    }
}
