package com.tungphan.designpatternsample.builder;

/**
 * Created by TungPhan on 1/3/18.
 */

public interface Item {

    String name();

    Packing packing();

    float price();

}
