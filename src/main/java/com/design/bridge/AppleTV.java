package com.design.bridge;

/**
 * Concrete Implementor class
 * @author aabhi
 *
 */
public class AppleTV implements TV{

	public void turnOn() {
		System.out.println("Apple TV Turned On");
	}

	public void turnOff() {
		System.out.println("Apple TV Turned Off");
	}

	public void setChannel(int channel) {
		System.out.println(String.format("Setting apple channel to %d", channel));
	}
	
}
