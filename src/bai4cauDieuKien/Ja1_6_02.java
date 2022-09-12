package bai4cauDieuKien;
import java.util.*;
public class Ja1_6_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("moi ban nhap diem TOAN");
double TOAN=sc.nextInt();
System.out.println("moi ban nhap diem VAN");
double VAN=sc.nextInt();
System.out.println("moi ban nhap diem ANH");
double ANH=sc.nextInt();
double diem=(TOAN+VAN+ANH)/3;
if(diem<=4 && diem>=0)
{
	System.out.println("hoc luc yeu");
}else if(diem>4 && diem <=6.5 )
{
	System.out.println("hoc luc trung binh");
}else if(diem>6.5 && diem<=8)
{
	System.out.println("hoc luc kha");
}else if(diem>8 && diem<=9)
{
	System.out.println("hoc luc gioi");
}else if(diem>9 && diem<=10)
{
	System.out.println("hoc luc xuat sac");
}else {
	System.out.println("ban nhap sai");
}
	}

}
