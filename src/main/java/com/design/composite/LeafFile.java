package com.design.composite;

public class LeafFile implements FileComponent {
	public LeafFile(String fileName) {
		super();
		this.fileName = fileName;
	}
	
	public void printFileName() {
		System.out.println("Filename : " + fileName);
	}

	String fileName;
}
