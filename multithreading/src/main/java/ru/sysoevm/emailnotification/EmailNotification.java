package ru.sysoevm.emailnotification;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EmailNotification {

    private final ExecutorService pool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    public void emailTo(User user) {
        pool.submit(new Runnable() {
            @Override
            public void run() {
                String subject = String.format("Notification {%s} to email {%s}", user.getUsername(), user.getEmail());
                String body = String.format("Add a new event to {%s}", user.getUsername());
                send(subject, "", user.getEmail());
                System.out.println(String.format("Send to email '%s' successfully!", user.getEmail()));
            }
        });
    }

    public void close() {
        pool.shutdown();
        while (!pool.isTerminated()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void send(String subject, String body, String email) {

    }

    public static void main(String[] args) {
        EmailNotification en = new EmailNotification();
        en.emailTo(new User("user1", "user1@email"));
        en.emailTo(new User("user2", "user2@email"));
        en.emailTo(new User("user3", "user3@email"));
        en.close();

    }

}
