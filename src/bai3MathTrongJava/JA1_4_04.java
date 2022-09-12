package bai3MathTrongJava;
import java.util.*;
public class JA1_4_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("y=");
int y=sc.nextInt();
System.out.println("x=");
int x=sc.nextInt();
System.out.println("a=");
int a=sc.nextInt();
System.out.println("b=");
int b=sc.nextInt();
System.out.println("c=");
int c=sc.nextInt();
int ketqua=Math.abs(a*x+b*y+c)/(a*a+b*b);
System.out.println("khoang cac tu diem do la"+ketqua);
	}

}
