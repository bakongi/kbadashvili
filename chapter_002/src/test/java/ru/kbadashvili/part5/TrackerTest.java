package ru.kbadashvili.part5;

import org.junit.Test;
import ru.kbadashvili.part4.Item;
import ru.kbadashvili.part4.Tracker;

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
        ru.kbadashvili.part4.Tracker tracker = new ru.kbadashvili.part4.Tracker();
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
        ru.kbadashvili.part4.Tracker tracker = new ru.kbadashvili.part4.Tracker();
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
        ru.kbadashvili.part4.Tracker tracker = new ru.kbadashvili.part4.Tracker();
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
        ru.kbadashvili.part4.Tracker tracker = new ru.kbadashvili.part4.Tracker();
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
        ru.kbadashvili.part4.Tracker tracker = new ru.kbadashvili.part4.Tracker();
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
        ru.kbadashvili.part4.Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription");
        Item itemTwo = new Item("test2", "testDescription2");
        tracker.add(item);
        tracker.add(itemTwo);
        String id = item.getId();
        assertThat(tracker.findById(id), is(item));
    }
}