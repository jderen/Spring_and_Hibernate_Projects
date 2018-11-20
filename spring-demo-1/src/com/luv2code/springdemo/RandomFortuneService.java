package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String[] fortunesArray= {"It's your lucky day","It's your happy day","It's your best day"};
	private Random myRandom=new Random();
	
	@Override
	public String getFortune() {
		int index=myRandom.nextInt(fortunesArray.length);
		String fortune=fortunesArray[index];
		return fortune;
	}

}
