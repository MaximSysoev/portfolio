package ru.sysoevm.iteratorforevennumbersTest;

import org.junit.Before;
import org.junit.Test;
import ru.sysoevm.iteratorforevennumbers.IteratorForEvenNumbers;

import java.util.Iterator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class IteratorForEvenNumbersTest {
    private Iterator<Integer> it;

    @Before
    public void setUp(){
        it = new IteratorForEvenNumbers(new int[]{1, 2, 3, 4, 5, 6, 7});
    }

    @Test
    public void shouldReturnEvenNumbersSequentially () {
        assertThat(it.hasNext(), is(true));
        assertThat(it.next(), is(2));
        assertThat(it.hasNext(), is(true));
        assertThat(it.next(), is(4));
        assertThat(it.hasNext(), is(true));
        assertThat(it.next(), is(6));
        assertThat(it.hasNext(), is(false));
    }

    @Test
    public void sequentialHasNextInvocationDoesntAffectRetrievalOrder () {
        assertThat(it.hasNext(), is(true));
        assertThat(it.hasNext(), is(true));
        assertThat(it.next(), is(2));
        assertThat(it.next(), is(4));
        assertThat(it.next(), is(6));
    }

    @Test
    public void  shouldReturnFalseIfNoAnyEvenNumbers(){
        it = new IteratorForEvenNumbers(new int[]{1});
        assertThat(it.hasNext(), is(false));
    }

}
