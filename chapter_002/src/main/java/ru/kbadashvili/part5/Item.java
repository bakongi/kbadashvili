package ru.kbadashvili.part5;

import java.util.Date;

/**
 * Created by KBadashvili on 017 17.04.17.
 */
public class Item {

    /**
     *
     */
    private String id;
    /**
     *
     */
    private String name;
    /**
     *
     */
    private String description;
    /**
     *
     */
    private long create;

    /**
     *
     * @param name name.
     * @param description description.
     */
    public Item(String name, String description) {
        this.name = name;
        this.description = description;
        this.create = new Date().getTime();
    }

    /**
     *
     * @return id.
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @return id.
     */
    public String getName() {
        return name != null ? name : "";
    }

    /**
     *
     * @return description.
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @return create date.
     */
    public long getCreate() {
        return create;
    }

    /**
     *
     * @param id Id.
     */
    public void setId(String id) {
        this.id = id;
    }
}
