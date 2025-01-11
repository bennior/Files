package main;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		String options = "options";
		String world = "New World";
		
		Files files = new Files();
		files.createOptions(options);
		files.createWorld(world);
	}

}
