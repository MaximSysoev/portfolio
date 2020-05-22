package ru.sysoevm.binarynodeTest;

import org.junit.Before;
import org.junit.Test;
import ru.sysoevm.binarynode.BinaryNode;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BinaryNodeTest {
    BinaryNode<Integer> node;

    @Before
    public void setUp() {
        node = new BinaryNode<>();
        node.add(1);
        node.add(2);
        node.add(3);
    }

    @Test
    public void WhenGetNextValue(){
        assertThat(1, is(node.iterator().next()));
    }

    @Test
    public void WhenGetHasNext() {
        assertThat(true, is(node.iterator().hasNext()));
    }
}
