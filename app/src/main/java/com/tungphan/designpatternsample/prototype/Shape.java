package com.tungphan.designpatternsample.prototype;

/**
 * Created by TungPhan on 1/3/18.
 */

public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    public abstract void draw();

    public String getType() {
        return type;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return clone;
    }

}
