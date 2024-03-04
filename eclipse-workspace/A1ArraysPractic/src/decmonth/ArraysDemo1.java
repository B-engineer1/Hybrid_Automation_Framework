package decmonth;

public class ArraysDemo1 {

	public static void main(String[] args) {
	   
		String ar []= new String[4];
	    
		ar[0]= "Abhishek";
		ar[1]= "Archana";
		ar[2]= "Pooja";
		ar[3]= "Ghanshyam";
	//	ar[4]= "Prasad"; ArrayIndexOutOfBoundsException: this is 5th element
		
		System.out.println(ar.length);// Length of an array
		System.out.println(ar[0]);// Get single element from an array
		System.out.println("===================================");
		
		for(int i=0;i<=3;i++) // print 0 to 3 in ascending order
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("===================================");
		
		for(int i=3;i>=0;i--)  // print 3 to 0 in descending order
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("===================================");
		
		for(int i=ar.length-1;i>=0;i--)// print 3 to 0 in descending order
		{
			System.out.println(ar[i]);
		}
	}

}
