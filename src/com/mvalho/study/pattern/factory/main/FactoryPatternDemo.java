package com.mvalho.study.pattern.factory.main;

import com.mvalho.study.pattern.factory.factory.ShapeFactory;
import com.mvalho.study.pattern.factory.model.Shape;
import com.mvalho.study.pattern.factory.model.ShapeType;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 = shapeFactory.getShape(ShapeType.CIRCLE);
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape(ShapeType.RECTANGLE);
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape(ShapeType.SQUARE);
		shape3.draw();
	}

}
