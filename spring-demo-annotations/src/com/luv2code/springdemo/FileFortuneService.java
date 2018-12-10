package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component
public class FileFortuneService implements FortuneService {

// filename with fortunes
private String fileName="C:/Users/Kuba/eclipse-workspace/spring-demo-annotations/src/fortune.txt";
// list for our fortunes
private List<String> theFortunes;
// generate random fortune
Random myRandom=new Random();

public FileFortuneService() {
	
	File theFile=new File(fileName);
	System.out.println("Reading fortunes from file: " + theFile);
	System.out.println("File exists: " + theFile.exists());
	
	//initialize new array list
	theFortunes=new ArrayList<String>();
	
	// read fortunes from file
	try(BufferedReader br=new BufferedReader(new FileReader(theFile))){
		
		String tempLine;
		
		while((tempLine=br.readLine())!=null){
			theFortunes.add(tempLine);
		}
	}catch(IOException e) {
		e.printStackTrace();
	}
	
	
}

	@Override
	public String getFortune() {
		
		// pick a random string from the array
		int index=myRandom.nextInt(theFortunes.size());
		
		String tempFortune=theFortunes.get(index);
		
		return tempFortune;
		
	}


}
