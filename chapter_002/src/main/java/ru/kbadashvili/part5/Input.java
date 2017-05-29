package ru.kbadashvili.part5;

import java.io.IOException;

/**
 * Created by KBadashvili on 023 23.05.17.
 */
public interface Input {

    /**
     *
     * @param question String.
     * @return String.
     * @throws IOException Exception.
     */
    String ask(String question) throws IOException;
}
