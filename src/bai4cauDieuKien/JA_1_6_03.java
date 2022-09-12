package bai4cauDieuKien;
import java.util.*;
public class JA_1_6_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("moi ban nhap thang");
int thang=sc.nextInt();
switch (thang) {
case 1,3,5,7,8,10,12:
	System.out.println("co 31 ngay");
	break;
case 4,6,9,11:
	System.out.println("co 31 ngay");
	break;
case 2:
	System.out.println("moi ban nhap nam");
	int nam=sc.nextInt();
	if(nam %4==0 && nam%100!=0 || (nam%400==0))
	{
		System.out.println("co 28 ngay ");
	}else
	{
		System.out.println("co 29 ngay");
	}
	break;
default:
	System.out.println("khong hop le");
	break;
}
	}

}
