package ru.sysoevm.threadpoolTest;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import ru.sysoevm.threadpool.ThreadPool;

import static org.hamcrest.MatcherAssert.assertThat;


public class ThreadPoolTest {

    private ThreadPool threadPool;
    private Runnable task1;
    private Runnable task2;

    @Before
    public void setUp() {
        threadPool = new ThreadPool();

        task1 = new Runnable() {
            @Override
            public void run() {
                try {
                    threadPool.getTasks().doSomething(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        task2 = new Runnable() {
            @Override
            public void run() {
                threadPool.getTasks().changeBlock();
            }
        };
    }

    @Test
    public void whenAdd2Threads() {
        threadPool.work(task1);
        threadPool.work(task2);
        threadPool.shutdown();
        assertThat(2, Matchers.is(threadPool.getThreads().size()));
    }
}
