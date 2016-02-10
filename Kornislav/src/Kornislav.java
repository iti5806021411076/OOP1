import java.util.Scanner;
public class Kornislav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A , B , C , D , temp;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Value1 : ");
		A=scan.nextInt();
		System.out.print("Enter Value2 : ");
		B=scan.nextInt();
		System.out.print("Enter Value3 : ");
		C=scan.nextInt();
		System.out.print("Enter Value4 : ");
		D=scan.nextInt();
		if(A>B)
		{
			temp=A;
			A=B;
			B=temp;
		}
		if(A>C)
		{
			temp=A;
			A=C;
			C=temp;
		}
		if(A>D)
		{
			temp=A;
			A=D;
			D=temp;
		}
		if(A>C)
		{
			temp=B;
			B=C;
			C=temp;
		}
		if(B>D)
		{
			temp=B;
			B=D;
			D=temp;
		}
		if(C>D)
		{
			temp=C;
			C=D;
			D=temp;
		}
		
		System.out.print("\nRectangle Area = : "+""+C+""+" * "+A+" = "+C*A);
	}

}
