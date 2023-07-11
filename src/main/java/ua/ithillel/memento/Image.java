package ua.ithillel.memento;

public class Image implements Cloneable {
    private String name;
    private Object content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    @Override
    protected Image clone() {
        Image image = new Image();
        image.setContent(content);
        image.setName(name);
        return image;
    }
}
