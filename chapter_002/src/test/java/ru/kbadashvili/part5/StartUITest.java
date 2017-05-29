package ru.kbadashvili.part5;

import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

/**
 * Created by KBadashvili on 029 29.05.17.
 */
public class StartUITest {

    /**
     *
     * @throws IOException IO.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() throws IOException {
        Tracker tracker = new Tracker();     // создаём Tracker
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker.findAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }

    /**
     *
     * @throws IOException IO/
     */
    @Test
    public void whenUserEditItemTrackerHasChangedItem() throws IOException {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        input = new StubInput(new String[]{"2", tracker.findAll()[0].getId(), "another test name", "another desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("another test name"));
    }

    /**
     *
     * @throws IOException IO.
     */
    @Test
    public void whenUserDeleteItemTrackerHasDeletedItem() throws IOException {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        input = new StubInput(new String[]{"3", tracker.findAll()[0].getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0], is(nullValue()));
    }

    /**
     *
     * @throws IOException IO.
     */
    @Test
    public void whenUserSearchItemByIDTrackerHasReturnedItem() throws IOException {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        input = new StubInput(new String[]{"4", tracker.findAll()[0].getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0], is(tracker.findById(tracker.findAll()[0].getId())));
    }

}