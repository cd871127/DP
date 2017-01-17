package com.anthony.factory.factorymethod;

import com.anthony.factory.product.Asian;
import com.anthony.factory.product.People;

/**
 * Created by CHENDONG239 on 2017-01-16.
 */
public class AsianFactory implements PeopleFactoryInterface {
    @Override
    public People createPeople() {
        return new Asian();
    }
}
