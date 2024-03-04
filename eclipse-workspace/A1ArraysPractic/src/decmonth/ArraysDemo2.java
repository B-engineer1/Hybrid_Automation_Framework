package decmonth;

public class ArraysDemo2 {

	public static void main(String[] args) {
		
		char grade[]= new char[5];
		
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='F';
		
		System.out.println(grade[0]);
		
		System.out.println("============");
		
		int RollNum[] = new int[5];
		
		RollNum[0]=10;
		RollNum[1]=13;
		RollNum[2]=45;
		RollNum[3]=54;
		RollNum[4]=80;
		
		System.out.println(RollNum[2]);
		
		System.out.println("============");
		
		for(int i =0;i<=4;i++)
		{
			System.out.println(RollNum[i]);
		}
		

	}

}
