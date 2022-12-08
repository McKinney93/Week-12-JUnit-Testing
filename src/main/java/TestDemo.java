import java.util.Random;

public class TestDemo {

	
	public int addPositive(int a, int b) {
		int sum = a + b;
		if(a <= 0 || b <= 0) {
			throw new IllegalArgumentException ("Both parameters must be positive!");
		}
		System.out.println();
		return sum;
	}
	
	public int randomNumberSquared() {
		int randomNumber = getRandomInt();
		int randomNumSquared = randomNumber * randomNumber;
		return randomNumSquared;
	}

	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}

	
}

