package ru.kbadashvili.part4;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by KBadashvili on 031 31.03.17.
 */
public class EngeneerTest {
    /**
     *
     * @throws Exception e
     */
    @Test
    public void training() throws Exception {

    }

    /**
     *
     */
    @Test
    public void setName() {
        Engeneer engeneer = new Engeneer();
        engeneer.setName("Альберт Кавос");

        assertThat(engeneer.getName(), is("Альберт Кавос"));
    }

    /**
     *
     */
    @Test
    public void getName() {
        Engeneer engeneer = new Engeneer();
        engeneer.setName("Альберт Кавос");

        assertThat(engeneer.getName(), is("Альберт Кавос"));
    }

    /**
     *
     */
    @Test
    public void design() {
        Engeneer engeneer = new Engeneer();
        engeneer.setName("Альберт Кавос");

        Project project = new Project();
        project.setProjectName("Мариинский театр");

        assertThat(engeneer.design(project), is(engeneer.getName() + " began to design a" + project.getProjectName()));
    }

    /**
     *
     * @throws Exception e
     */
    @Test
    public void askAllowance() throws Exception {

    }

}