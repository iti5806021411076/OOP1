import java.util.Scanner;
public class Trik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int LL=1,CC=0,RR=0,tmp;
		Scanner scan = new Scanner(System.in);
		String word;
		do{
		System.out.print("Enter swarp : ");
		word = scan.nextLine();
		}while(word.length() < 1 || word.length()>50 || word.length()==0 || (word.charAt(0)!='A'&&
		word.charAt(0)!='B'&&
		word.charAt(0)!='C'&&
		word.charAt(0)!='a'&&
		word.charAt(0)!='b'&&
		word.charAt(0)!='c'));
		for(int i=0;i<word.length();i++){
		if(word.charAt(i)=='A'||word.charAt(i)=='a'){
		tmp=LL;
		LL=CC;
		CC=tmp;
		}else if(word.charAt(i)=='B'||word.charAt(i)=='b'){
		tmp=CC;
		CC=RR;
		RR=tmp;
		}else{
		tmp=LL;
		LL=RR;
		RR=tmp;
		}
		}
		System.out.println("L = "+LL);
		System.out.println("C = "+CC);
		System.out.println("R = "+RR);
		}
	}


