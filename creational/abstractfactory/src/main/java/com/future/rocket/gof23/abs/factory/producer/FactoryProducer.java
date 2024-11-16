package com.future.rocket.gof23.abs.factory.producer;

import com.future.rocket.gof23.abs.factory.build.AbstractFactory;
import com.future.rocket.gof23.abs.factory.build.RoundedShapeFactory;
import com.future.rocket.gof23.abs.factory.build.ShapeFactory;
import com.future.rocket.gof23.abs.factory.enums.FactoryTypeEnum;

public class FactoryProducer {

    public AbstractFactory getFactory(FactoryTypeEnum factoryTypeEnum) {
        if(FactoryTypeEnum.Shape == factoryTypeEnum) {
            return new ShapeFactory();
        } else if (FactoryTypeEnum.RoundedShape == factoryTypeEnum) {
            return new RoundedShapeFactory();
        }
        return null;
    }
}
