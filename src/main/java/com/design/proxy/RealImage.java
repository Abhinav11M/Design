package com.design.proxy;

import java.net.URI;

public class RealImage implements Image {

	public RealImage(URI uri) {
		loadImage(uri);
	}

	public void showImage() {
		System.out.println("Showing already loaded image");
	}

	private void loadImage(URI uri) {
		System.out.println("Doing complex operations to load the image");
	}

}
