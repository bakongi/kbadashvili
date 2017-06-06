package ru.kbadashvili.part5.strategy;

/**
 * Created by KBadashvili on 001 01.06.17.
 */
public class Triangle implements Shape {

    /**
     *
     * @return String.
     */
    @Override
    public String pic() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++)
            sb.append("    *********".substring(i, 5 + 2 * i)).append(System.lineSeparator());
        return sb.toString();
    }
}

