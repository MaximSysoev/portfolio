package ru.sysoevm.casqueueTest;

import org.junit.Before;
import org.junit.Test;
import ru.sysoevm.casqueue.CasQueue;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CasQueueTest {

    private CasQueue<Integer> stack;

    @Before
    public void setUp() {
        stack = new CasQueue();
    }

    @Test
    public void when3PushThen3Poll() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertThat(3, is(stack.poll()));
        assertThat(2, is(stack.poll()));
        assertThat(1, is(stack.poll()));
    }

    @Test
    public void when1PushThen1Poll() {
        stack.push(1);
        assertThat(stack.poll(), is(1));
    }

    @Test
    public void when2PushThen2Poll() {
        stack.push(1);
        stack.push(2);
        assertThat(stack.poll(), is(2));
        assertThat(stack.poll(), is(1));
    }
}
