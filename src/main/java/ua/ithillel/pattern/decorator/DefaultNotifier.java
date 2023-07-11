package ua.ithillel.pattern.decorator;

public class DefaultNotifier extends Notifier {
    @Override
    public void sendMessage(String message) {
        System.out.println("Message: " + message);
    }
}
