package ru.kbadashvili.part5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by KBadashvili on 016 16.05.17.
 */
public class ConsoleInput implements Input {

    /**
     *
     */
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /**
     *
     * @param question String.
     * @return String.
     * @throws IOException Exception.
     */
    public String ask(String question) throws IOException {
        System.out.print(question);
        return br.readLine();
    }
}
