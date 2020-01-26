package com.design.proxy;

import java.net.URI;

public class ProxyImage implements Image {

	public ProxyImage(URI uri) {
		this.uri = uri;
	}
	
	public void showImage() {
		System.out.println("Loading image while showing");
		RealImage real = new RealImage(uri);
		real.showImage();
	}

	private URI uri;
}
