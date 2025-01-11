package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class Files {
	
	
	public void createOptions(String fileName) throws IOException {
		File options = new File(fileName + ".txt");
		options.createNewFile();
	}
	
	public void createWorld(String worldName) throws IOException {
		File folder = new File(worldName);
		boolean bool = folder.mkdir();
		
		File entities = new File(worldName + "/" + "entities.txt");
		File caves = new File(worldName + "/" + "caves.txt");
		File inventory = new File(worldName + "/" + "inventory.txt");
		
		entities.createNewFile();
		caves.createNewFile();
		inventory.createNewFile();
	}
	
	
	
	public void writeFile(String fileName, String text) throws IOException{
		PrintWriter writer = new PrintWriter(fileName);
		writer.println(text);
		writer.close();
	}
	
	
	
	public String readFile(String fileName, int  lineNumber) throws IOException {
		
		String output = null;
		
		BufferedReader r = new BufferedReader(new FileReader(fileName));
		for(int i = 0; i < lineNumber + 1; i++)
		{
			output = r.readLine();
			
		}

		return output;
		}
}
