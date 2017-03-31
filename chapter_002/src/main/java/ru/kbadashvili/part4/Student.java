package ru.kbadashvili.part4;

/**
 * Created by KBadashvili on 027 27.03.17.
 */
public class Student {

    /**
     *
     */
    private String name = "Студент без имени";
    /**
     *
     */
    private boolean isSleep = false;

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return boolean
     */
    public boolean isSleep() {
        return isSleep;
    }

    /**
     *
     * @param sleep boolean
     */
    public void setSleep(boolean sleep) {
        isSleep = sleep;
    }
}
