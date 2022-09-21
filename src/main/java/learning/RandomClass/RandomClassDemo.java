package learning.RandomClass;

import java.util.Random;

public class RandomClassDemo {

	public static void main(String[] args) {
		Random random = new Random();
		for(int i=0;i<100;i++) {
			int randomNumber = random.nextInt(10);
			System.out.println(randomNumber);
		}
	}

}
