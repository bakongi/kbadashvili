package ru.kbadashvili.part5.strategy;

/**
 * Created by KBadashvili on 001 01.06.17.
 */
public class Square implements Shape {

    /**
     *
     * @return String.
     */
    @Override
    public String pic() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 6; i++){
            sb.append("* * * * * *");
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
