package ru.kbadashvili.part3;

/**
 * Класс Teacher.
 * @author Konstantin Badashvili (bakongi@protonmail.com)
 * @version $Id$
 * @since 2017
 */
public class Teacher extends Profession {

    /**
     *
     */
    private String name;

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name Name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param student Student.
     * @param subject Subject.
     * @return String.
     */
    public String teach(Student student, Subject subject) {
        return this.getName() + " began to teach " + student.getName() + " a subject: " + subject.getSubjectName();
    }

    @Override
    /**
     *
     */
    void training() {
        System.out.print(this.getName() + " began to train");
    }

    /**
     *
     * @param student Sttudent
     * @return String
     */
    public String kick(Student student) {
        return this.getName() + " began to kick " + student.getName();
    }

    /**
     *
     * @param student Student
     * @return String
     */
    public String wakeUp(Student student) {
        return this.getName() + " began to wakeup " + student.getName();
    }

}
