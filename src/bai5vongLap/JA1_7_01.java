package bai5vongLap;
import java.util.*;
public class JA1_7_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n;
do {
	System.out.println("moi ban nhap 1 so n bat ky");
	n=sc.nextInt();
}while(n<=0);
int tich=1;
for(int i=1;i<=n;i++)
{
	if(n%i==0)
	{
		System.out.println("cac uoc cua n la :"+i);
		tich*=i;
	}
}
System.out.println("tich cua cac uoc do la :"+tich);
	}

}
