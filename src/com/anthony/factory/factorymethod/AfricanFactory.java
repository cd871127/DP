package com.anthony.factory.factorymethod;

import com.anthony.factory.product.African;
import com.anthony.factory.product.People;

/**
 * Created by CHENDONG239 on 2017-01-16.
 */
public class AfricanFactory implements PeopleFactoryInterface{

    @Override
    public People createPeople() {
        return new African();
    }
}
