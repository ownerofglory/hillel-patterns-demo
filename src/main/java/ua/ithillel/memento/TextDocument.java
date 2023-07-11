package ua.ithillel.memento;

import java.time.LocalDateTime;

public class TextDocument implements Cloneable, Persistable {
    private ChangeHistory changeHistory = new ChangeHistory();

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

        if (image != null) {
            textDocument.setImage(image.clone());
        }

        return textDocument;
    }

    @Override
    public void persist() {
        TextDocument clone = this.clone();
        changeHistory.save(clone);
    }

    public ChangeHistory getChangeHistory() {
        return changeHistory;
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
