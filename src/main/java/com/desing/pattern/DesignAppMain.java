package com.desing.pattern;

import java.net.URI;

import com.design.bridge.AppleTV;
import com.design.bridge.ConcreteTVRemoteControl;
import com.design.bridge.TV;
import com.design.composite.Directory;
import com.design.composite.LeafFile;
import com.design.decorator.ColorDecorator;
import com.design.decorator.House;
import com.design.decorator.SimpleHouse;
import com.design.flyweight.MyShape;
import com.design.flyweight.ShapeFactory;
import com.design.proxy.Image;
import com.design.proxy.ProxyImage;
import com.design.proxy.RealImage;

public class DesignAppMain {
	public static void main(String[] args) {
		// ===== Bridge =====
		TV appleTV = new AppleTV();
		ConcreteTVRemoteControl remControl = new ConcreteTVRemoteControl(appleTV);
		remControl.turnOn();
		remControl.nextChannel();
		remControl.prevChannel();
		remControl.setChannel(123);
		remControl.turnOff();
		// ===== Bridge =====
		
		// ===== Composite =====
		Directory f = new Directory("Dir1");
		f.addFile(new LeafFile("File1.txt"));
		f.addFile(new LeafFile("File2.txt"));
		f.addFile(new LeafFile("File3.txt"));
		
		f.printFileName();
		// ===== Composite =====
		
		// =====Decorator =====
		House h1 = new ColorDecorator(new SimpleHouse());
		System.out.println(h1.makeHouse());
		House h2 = new ColorDecorator(new SimpleHouse());
		System.out.println(h2.makeHouse());
		// =====Decorator =====
		
		
		// ===== Proxy =====
		Image image = new RealImage(URI.create(""));
		image.showImage();
		
		Image imageProxy = new ProxyImage(URI.create(""));
		imageProxy.showImage();
		// ===== Proxy =====
		
		
		// ===== FlyWeight =====
		ShapeFactory shapeFactory = new ShapeFactory();
		MyShape rectangle1 = shapeFactory.getShape("Rectangle");
		rectangle1.draw("MyFont1", "MyColor1", "12");
		MyShape rectangle2 = shapeFactory.getShape("Rectangle");
		rectangle2.draw("MyFont2", "MyColor2", "14");
		MyShape oval1 = shapeFactory.getShape("Oval");
		oval1.draw("MyFont1", "MyColor2", "13");
		MyShape oval2 = shapeFactory.getShape("Oval");
		oval2.draw("MyFont2", "MyColor1", "14");
		
		// ===== FlyWeight =====
		
	}
}
