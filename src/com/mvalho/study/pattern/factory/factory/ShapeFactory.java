package com.mvalho.study.pattern.factory.factory;

import com.mvalho.study.pattern.factory.model.Circle;
import com.mvalho.study.pattern.factory.model.Rectangle;
import com.mvalho.study.pattern.factory.model.Shape;
import com.mvalho.study.pattern.factory.model.ShapeType;
import com.mvalho.study.pattern.factory.model.Square;

public class ShapeFactory {
	public Shape getShape(ShapeType shapeType) {
		if(shapeType == null) {
			return null;
		}
		
		if(shapeType.equals(ShapeType.CIRCLE)) {
			return new Circle();
		} else if(shapeType.equals(ShapeType.RECTANGLE)) {
			return new Rectangle();
		} else if(shapeType.equals(ShapeType.SQUARE)) {
			return new Square();
		}
		
		return null;
	}
}
