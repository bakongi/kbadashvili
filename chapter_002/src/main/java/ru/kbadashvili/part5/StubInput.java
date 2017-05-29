package ru.kbadashvili.part5;

import java.io.IOException;

/**
 * Created by KBadashvili on 026 26.05.17.
 */
public class StubInput implements Input {

    /**
     *
     */
    private String[] answers;
    /**
     *
     */
    private int position = 0;

    /**
     *
     * @param answers Массив ответов.
     */
    public StubInput(String[] answers) {
        this.answers = answers;
    }

    /**
     *
     * @param question String.
     * @return ответ из массива.
     * @throws IOException IO.
     */
    @Override
    public String ask(String question) throws IOException {
        return this.answers[position++];
    }
}
