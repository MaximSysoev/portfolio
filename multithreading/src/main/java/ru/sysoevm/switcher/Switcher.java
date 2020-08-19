package ru.sysoevm.switcher;

public class Switcher extends Thread {

    private String s = "";
    private int k = 1;
    private final Object lock = new Object();

    public void add(int n) throws InterruptedException {
        synchronized (this.lock) {
            try {
                if (n%2!=0) {
                    if (k==1) {
                        for (int i = 0; i < 10; i++) {
                            s = s + Integer.toString(n);
                        }
                        k = 2;
                        this.lock.notify();
                    }
                } else {
                    if (k!=2) {
                        System.out.println("Поток в ожидании...");
                        this.lock.wait();
                    }
                    for (int i=0; i < 10; i++) {
                        s = s + Integer.toString(n);
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }


    }

    public String getS() {
        return s;
    }

    public static void main(String[] args) throws InterruptedException {
        Switcher switcher = new Switcher();

        Thread task1 = new Thread() {
            @Override
            public void run() {
                try {
                        switcher.add(1);
                    System.out.println(switcher.getS() + " " + Thread.currentThread().getName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        Thread task2 = new Thread() {
            @Override
            public void run() {
                try {
                    switcher.add(2);
                    System.out.println(switcher.getS() + " " + Thread.currentThread().getName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        task1.start(); // 1
        task2.start(); // 2






    }

}
