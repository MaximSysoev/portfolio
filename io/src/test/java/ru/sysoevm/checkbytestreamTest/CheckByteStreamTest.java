package ru.sysoevm.checkbytestreamTest;

import org.junit.Test;
import ru.sysoevm.checkbytestream.CheckByteStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckByteStreamTest {
    @Test
    public void whenEvenNumber() throws IOException {
        System.setIn(new ByteArrayInputStream("100".getBytes()));
        assertThat(new CheckByteStream().isNumber(System.in), is(true));
    }

    @Test
    public void whenOddNumber() throws IOException {
        System.setIn(new ByteArrayInputStream("777".getBytes()));
        assertThat(new CheckByteStream().isNumber(System.in), is(false));
    }
}
