package ru.kbadashvili.part4;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

/**
 * Created by KBadashvili on 017 17.04.17.
 */
public class TrackerTest {

    /**
     *
     */
    @Test
    public void add() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription");
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void update() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription");
        Item itemTwo = new Item("test2", "testDescription2");
        tracker.add(item);
        tracker.add(itemTwo);
        itemTwo.setId(item.getId());
        tracker.update(itemTwo);
        assertThat(tracker.findAll()[0], is(itemTwo));
    }

    /**
     *
     */
    @Test
    public void delete() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription");
        tracker.add(item);
        tracker.delete(item);
        assertThat(tracker.findAll()[0], not(item));
    }

    /**
     *
     */
    @Test
    public void findAll() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription");
        Item itemTwo = new Item("test2", "testDescription2");
        tracker.add(item);
        tracker.add(itemTwo);
        assertThat(tracker.findAll(), is(tracker.findAll()));
    }

    /**
     *
     */
    @Test
    public void findByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription");
        Item itemTwo = new Item("test2", "testDescription2");
        tracker.add(item);
        tracker.add(itemTwo);
        assertThat(tracker.findByName("test2"), is(itemTwo));
    }

    /**
     *
     */
    @Test
    public void findById() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription");
        Item itemTwo = new Item("test2", "testDescription2");
        tracker.add(item);
        tracker.add(itemTwo);
        String id = item.getId();
        assertThat(tracker.findById(id), is(item));
    }
}