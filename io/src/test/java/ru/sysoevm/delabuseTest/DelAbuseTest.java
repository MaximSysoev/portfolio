package ru.sysoevm.delabuseTest;

import org.junit.Test;
import ru.sysoevm.delabuse.DelAbuse;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertFalse;

public class DelAbuseTest {


    DelAbuse delAbuse = new DelAbuse();
    InputStream is = getClass().getClassLoader().getResourceAsStream("input.txt");
    String[] ab = new String[] {"1111", "22", "33", "текст1"};
    InputStream is2 = getClass().getClassLoader().getResourceAsStream("input.txt");


    @Test
    public void whenContainsAbuse() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        delAbuse.dropAbuses(is2, bos, ab);
        String s = bos.toString();
        System.out.println(s);
        boolean contains = false;
        for (String abuse : ab) {
            if (s.contains(abuse)) {
                contains = true;
                break;
            }
        }
        assertFalse(contains);
    }

}
