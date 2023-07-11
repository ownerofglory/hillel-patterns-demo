package ua.ithillel.chain;

public class Response {
    private Object data;
    private int code;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Response{" +
                "data=" + data +
                ", code=" + code +
                '}';
    }
}
