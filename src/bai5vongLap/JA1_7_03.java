package bai5vongLap;
import java.util.*;
public class JA1_7_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n;
System.out.println("nhap n");
n=sc.nextInt();
for(int i=2;i<n;i++)
{
	if(ktSoNguenTo(i))
		System.out.println(i+" ");
}
}
public static boolean ktSoNguenTo(int n) {
	if(n<=1)
		return false;
	for(int i=2;i<n/2;i++)
		if(n%i==0)
		{
			return false;
		}
	return true;
}
}