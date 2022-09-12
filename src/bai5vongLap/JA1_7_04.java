package bai5vongLap;
import java.util.*;
public class JA1_7_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("moi ban nhap 1 so");
int so=0;
while (so<=0) {
	System.out.println("nhap 1 so duong,sai nhap lai");
	so=sc.nextInt();
}
int tong=0;
int du=0;
//for(int i=so;i>0;i/=10)
//{
//	du=i%10;
//	tong+=du;
//}
while(so>0)
{
	du=so%10;
	tong+=du;
	so/=10;
}
System.out.println(tong);
	}

}
