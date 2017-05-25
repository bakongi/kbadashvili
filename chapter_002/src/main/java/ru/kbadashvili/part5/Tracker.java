package ru.kbadashvili.part5;

import java.util.Random;

/**
 * Created by KBadashvili on 003 03.04.17.
 */
public class Tracker {

    /**
     *
     */
    private Item[] items = new Item[10];
    /**
     *
     */
    private int position = 0;
    /**
     *
     */
    private static final Random RD = new Random(20);

    /**
     *
     * @param item Заявка.
     * @return Item.
     */
    public Item add(final Item item) {
        item.setId(String.valueOf(System.currentTimeMillis()  + RD.nextInt()));
        this.items[position++] = item;
        return null;
    }

    /**
     *
     * @param item Заявка.
     */
    public void update(Item item) {
        for (int i = 0; i < items.length; i++) {
            if (this.items[i].getId().equals(item.getId())) {
                this.items[i] = item;
                break;
            }
        }
    }

    /**
     *
     * @param item Заявка.
     */
    public void delete(Item item) {
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i].getId().equals(item.getId())) {
                System.arraycopy(this.items, i + 1, this.items, i, this.items.length - 1 - i);
                break;
            }
        }
    }

    /**
     *
     * @return Item[].
     */
    public Item[] findAll() {
        return this.items;
    }

    /**
     *
     * @param key Имя.
     * @return Item.
     */
    public Item findByName(String key) {
        Item result = null;
        for (Item item : this.items) {
            if (item != null && item.getName().equals(key)) {
                result = item;
                break;
            }
        }
        return result;
    }

    /**
     *
     * @param id Идентификатор.
     * @return Item.
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : this.items) {
           if (item != null && item.getId().equals(id)) {
               result = item;
               break;
           }
        }
        return result;
    }
}
