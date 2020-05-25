package ru.sysoevm.menuTest;

import org.junit.Before;
import org.junit.Test;
import ru.sysoevm.menu.CreateMenu;
import ru.sysoevm.menu.Node;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MenuTest {

    CreateMenu createMenu = new CreateMenu();

    @Before
    public void setUp() {
        createMenu.load();
    }

    @Test
    public void whenSelectFirstLevelItem() {
        List<Node> lst = createMenu.head.getList();
        assertThat(lst.get(0).getValue(), is("Задача 1."));
    }
}
