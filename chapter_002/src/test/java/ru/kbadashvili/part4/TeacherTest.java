package ru.kbadashvili.part4;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by KBadashvili on 031 31.03.17.
 */
public class TeacherTest {

    /**
     *
     */
    @Test
    public void teach() {
        Teacher teacher = new Teacher();
        teacher.setName("Михаил Васильевич Ломоносов");

        Subject subject = new Subject();
        subject.setSubjectName("О превращении твёрдого тела в жидкое, в зависимости от движения предшествующей жидкости");

        Student student = new Student();
        student.setName("Вова");

        assertThat(teacher.teach(student, subject), is(teacher.getName() + " began to teach " + student.getName() + " a subject: " + subject.getSubjectName()));
    }

    /**
     *
     */
    @Test
    public void kick() {
        Teacher teacher = new Teacher();
        teacher.setName("Михаил Васильевич Ломоносов");

        Student student = new Student();
        student.setName("Вова");

        assertThat(teacher.kick(student), is(teacher.getName() + " began to kick " + student.getName()));
    }

    /**
     *
     */
    @Test
    public void wakeUp() {
        Teacher teacher = new Teacher();
        teacher.setName("Михаил Васильевич Ломоносов");

        Student student = new Student();
        student.setName("Вова");

        assertThat(teacher.wakeUp(student), is(teacher.getName() + " began to wakeup " + student.getName()));
    }
}