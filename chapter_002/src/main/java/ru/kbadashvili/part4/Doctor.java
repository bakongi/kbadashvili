package ru.kbadashvili.part4;

/**
 * Класс Doctor.
 * @author Konstantin Badashvili (bakongi@protonmail.com)
 * @version $Id$
 * @since 2017
 */
public class Doctor extends Profession {

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
     * @param patient Patient
     * @return String
     */
    public String examine(Patient patient) {
        return this.getName() + " began to examine " + patient.getName();
    }

    /**
     *
     * @param patient Patient
     * @return String
     */
    public String treat(Patient patient) {
        return this.getName() + " began to treat " + patient.getName();
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
     */
    public void toRest() {
        System.out.print(this.getName() + " began to rest");
    }
}
