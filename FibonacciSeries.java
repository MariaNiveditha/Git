package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 10; 
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

	}

}
