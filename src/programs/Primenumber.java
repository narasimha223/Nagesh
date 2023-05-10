package programs;

public class Primenumber {

	//2 is the lowest prime number
	public static boolean isPrimeNumber(int num) {
		//edge or corner cases:
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i ==0) {
				return false;
			}
		}
		return true;
	}
		public static void getPrimeNumber(int num) {
			for(int i=2;i<=num;i++) {
				if(isPrimeNumber(i))
					System.out.println(i + "");
			}
		}
	
	public static void main(String[] args) {
		System.out.println("2 is prime number: "+ isPrimeNumber(2));
		System.out.println("9 is prime number: "+ isPrimeNumber(9));
		System.out.println("17 is prime number: "+ isPrimeNumber(127));
		getPrimeNumber(200);

	}

}
