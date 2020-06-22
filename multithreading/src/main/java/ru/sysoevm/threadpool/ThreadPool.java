package ru.sysoevm.threadpool;

import ru.sysoevm.simpleblockingqueue.SimpleBlockingQueue;

import java.util.LinkedList;
import java.util.List;

public class ThreadPool<E> {
    private final List<Thread> threads = new LinkedList<>();
    private final  SimpleBlockingQueue<Runnable> tasks = new SimpleBlockingQueue<>();

    public void work (Runnable job) {
        Thread thread = new Thread(job);
        threads.add(thread);
        thread.start();
    }


    public void shutdown() {
        for (Thread thread:threads) {
            thread.interrupt();
        }
    }

    public SimpleBlockingQueue<Runnable> getTasks() {
        return tasks;
    }

    public List<Thread> getThreads() {
        return threads;
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadPool threadPool = new ThreadPool();

        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                try {
                    threadPool.getTasks().doSomething(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                threadPool.getTasks().changeBlock();
            }
        };

        threadPool.work(task1);
        threadPool.work(task2);
        threadPool.shutdown();

    }
}
