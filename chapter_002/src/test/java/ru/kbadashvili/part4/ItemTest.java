package ru.kbadashvili.part4;

import org.junit.Test;

import java.util.Date;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by KBadashvili on 017 17.04.17.
 */
public class ItemTest {
    /**
     *
     */
    @Test
    public void getId() {
        Item item = new Item("test1", "testDescription");
        String id = item.getId();
        assertThat(item.getId(), is(id));
    }

    /**
     *
     */
    @Test
    public void getName() {
        Item item = new Item("test1", "testDescription");
        assertThat(item.getName(), is("test1"));
    }

    /**
     *
     */
    @Test
    public void getDescription() {
        Item item = new Item("test1", "testDescription");
        assertThat(item.getDescription(), is("testDescription"));
    }

    /**
     *
     */
    @Test
    public void getCreate() {
        Item item = new Item("test1", "testDescription");
        long create = new Date().getTime();
        assertThat(item.getCreate(), is(create));
    }

    /**
     *
     */
    @Test
    public void setId() {
        Item item = new Item("test1", "testDescription");
//        assertThat(item.setId("123"), is(item.getId());
    }

}