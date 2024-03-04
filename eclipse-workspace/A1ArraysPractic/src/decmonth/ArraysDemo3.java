package decmonth;

public class ArraysDemo3 {

	public static void main(String[] args) {
		
		int num = 5;
		long factorial = 1;
		
		for(int i=1;i<=num;i++)
		{
			factorial = factorial*i;
		}
             
		System.out.println("Number of factorial is :" + factorial);
	}

}
