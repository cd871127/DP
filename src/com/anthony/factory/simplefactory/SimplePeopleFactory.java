package com.anthony.factory.simplefactory;

import com.anthony.factory.product.African;
import com.anthony.factory.product.Asian;
import com.anthony.factory.product.European;
import com.anthony.factory.product.People;

/**
 * Created by CHENDONG239 on 2017-01-16.
 */
public class SimplePeopleFactory {
    public static final String ASIAN = "Asian";
    public static final String EUROPEAN = "European";
    public static final String AFRICAN = "African";

    public People createPeople(String type) {
        switch (type) {
            case ASIAN:
                return new Asian();
            case EUROPEAN:
                return new European();
            case AFRICAN:
                return new African();
            default:
                return null;
        }
    }
}
