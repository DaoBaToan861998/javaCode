package bai5vongLap;
import java.security.PublicKey;
import java.util.*;
public class JA1_7_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("moi ban nhap gia tri cua a");
int a=sc.nextInt();
System.out.println("moi ban nhap gia tri cua b");
int b=sc.nextInt();
System.out.println("UCLN cua"+a+"va"+b+"la"+ UCLN(a,b));
System.out.println("BCLN cua"+a+"va"+b+"la"+ BCNN(a,b));

	}
	public static int UCLN(int a,int b) {
		while(a!=b)
		{
			if(a>b)
			{
				a-=b;
			}else
			{
				b-=a;
			}
		}
		return a;
	}
	public static int BCNN(int a,int b) {
		return (a*b)/UCLN(a,b);
	}
}
