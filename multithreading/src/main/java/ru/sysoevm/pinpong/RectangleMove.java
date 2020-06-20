package ru.sysoevm.pinpong;

import javafx.scene.shape.Rectangle;

public class RectangleMove implements Runnable {
    private final Rectangle rect;
    private int ch = 10;

    public RectangleMove(Rectangle rect) {
        this.rect = rect;

    }

    @Override
    public void run() {
        while (true) {
            while (!Thread.currentThread().isInterrupted()) {
                this.rect.setX(this.rect.getX() + ch);
                if (this.rect.getX() > 250) {
                    ch = -10;
                }
                if (this.rect.getX() < 10) {
                    ch = 10;
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

        }
    }

}

