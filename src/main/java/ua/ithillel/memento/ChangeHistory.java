package ua.ithillel.memento;

import java.util.Stack;

public class ChangeHistory {
    private Stack<Persistable> history = new Stack<>();

    public Persistable undo() {
        return  history.pop();
    }

    public void save(Persistable persistable) {
        history.push(persistable);
    }

}
