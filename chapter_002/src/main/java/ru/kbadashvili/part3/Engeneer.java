package ru.kbadashvili.part3;

/**
 * Класс Engeneer.
 * @author Konstantin Badashvili (bakongi@protonmail.com)
 * @version $Id$
 * @since 2017
 */
public class Engeneer extends Profession {

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
     * @param name Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param project Project
     * @return String
     */
    public String design(Project project) {
       return this.name + " began to design a" + project.getProjectName();
    }

    @Override
    /**
     *
     */
    public void training() {
        System.out.print(this.name + " began to train");
    }

    /**
     *
     */
    public void askAllowance() {
        System.out.print(this.name + " began to ask allowance");
    }

}
