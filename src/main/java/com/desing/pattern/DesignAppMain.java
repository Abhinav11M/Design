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
	}
}
