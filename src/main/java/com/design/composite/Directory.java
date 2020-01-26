package com.design.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileComponent {

	public Directory(String directoryName) {
		super();
		this.directoryName = directoryName;
		files = new ArrayList<FileComponent>();
	}

	public void printFileName() {
		System.out.println("Directory name : " + directoryName);
		
		for(FileComponent file : files) {
			file.printFileName();
		}
	}

	public void addFile(LeafFile f) {
		files.add(f);
	}
	
	private String directoryName;
	private List<FileComponent> files;
}
