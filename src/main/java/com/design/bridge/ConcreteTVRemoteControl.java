package com.design.bridge;
/**
 * This is an extended remote control class to give us more features.
 * @author aabhi
 *
 */
public class ConcreteTVRemoteControl extends TVRemoteControl {

	private int currentChannel;
	
	public ConcreteTVRemoteControl(TV implementor) {
		super(implementor);
		currentChannel = 1; // Defaulted to 1
		setChannel(currentChannel);
	}
	
	public void nextChannel() {
		++currentChannel;
		setChannel(currentChannel);
	}

	public void prevChannel() {
		--currentChannel;
		setChannel(currentChannel);
	}
}
