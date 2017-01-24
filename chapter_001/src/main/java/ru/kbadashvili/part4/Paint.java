package ru.kbadashvlili.part4;

 /**
 * Построить пирамиду в псевдографике.
 * @author Konstantin Badashvili (bakongi@protonmail.com)
 * @version $Id$
 * @since 2017
 */
 public class Paint {
 	 /**
     * @param h - высота треугольника.
     * @return bigresult - факториал.
     */
    public String piramid(int h) {
        StringBuilder tr = new StringBuilder();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h - i; j++) {
                tr.append(" ");
            }
            for (int k = 0; k <= i; k++) {
                tr.append("^ ");
            }
            tr.append("\n");
        }
        return tr.toString();
    }
 }