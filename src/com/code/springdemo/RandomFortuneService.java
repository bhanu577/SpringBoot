package com.code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	//create an array
			private String[] dataForest = {"Hi good Morning","Hi good afternoon","Hi good evening"};
			
			private Random random = new Random();
	@Override
	public String getFortuneService() {
		int index = random.nextInt(dataForest.length);
		String radFor = dataForest[index];
		return radFor;
	}

}
