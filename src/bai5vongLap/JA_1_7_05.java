package bai5vongLap;
import java.util.*;
public class JA_1_7_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=0;
while (n<=0) {
	System.out.println("nhap so duong n");
	n=sc.nextInt();
}
double tong=0;
for(int i=0;i<=n;i++)
{
	tong+=1.0/(i*(i+1));
}
System.out.println("tong ="+tong);
	}

}
