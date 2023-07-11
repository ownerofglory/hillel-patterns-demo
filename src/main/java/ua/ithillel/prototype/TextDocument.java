package ua.ithillel.prototype;

import java.time.LocalDateTime;

public class TextDocument implements Cloneable {
    private String title;
    private String content;
    private LocalDateTime date;

    private Image image;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    // deep copy
    public TextDocument clone() {
        TextDocument textDocument = new TextDocument();
        textDocument.setContent(content);
        textDocument.setDate(date);
        textDocument.setTitle(title);

        textDocument.setImage(image.clone());

        return textDocument;
    }

//    @Override
//    // shallow copy
//    public TextDocument clone() {
//        TextDocument textDocument = new TextDocument();
//        textDocument.setContent(content);
//        textDocument.setDate(date);
//        textDocument.setTitle(title);
//        // reference
//        textDocument.setImage(image);
//
//        return textDocument;
//    }
}
