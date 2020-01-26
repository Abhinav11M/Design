package com.design.bridge;

/**
 * Abstraction class. All the TV methods will be delegated here
 * @author aabhi
 *
 */
public class TVRemoteControl {
	private TV implementor;

	public TVRemoteControl(TV implementor) {
		this.implementor = implementor;
	}
	
	public void turnOn() {
		implementor.turnOn();
	}
	
	public void turnOff() {
		implementor.turnOff();
	}
	
	public void setChannel(int channel) {
		implementor.setChannel(channel);
	}
}
