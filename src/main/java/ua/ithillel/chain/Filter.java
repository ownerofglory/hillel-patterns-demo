package ua.ithillel.chain;

public abstract class Filter {
    protected Filter next;

    public void setNext(Filter next) {
        this.next = next;
    }

    public abstract void doFilter(Request request, Response response);
}
