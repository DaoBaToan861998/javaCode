package bai6String;
import java.util.*;
public class JA1_8_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String acc="t861998";
String pass="tokyo2017";
String taiKhoan,matKhau;
boolean check=true;
Scanner sc=new Scanner(System.in);
System.out.println("nhap tai khoan:");
taiKhoan=sc.nextLine();
System.out.println("nhap mat khau:");
matKhau=sc.nextLine();
if(acc.isEmpty() || pass.isEmpty())
{
	check=false;
}else
	{
	if (taiKhoan.equals(acc) && matKhau.equals(pass))
	{
		check=true;
	}else {
		check=false;
	}
	}
if(check==true)
{
	System.out.println("dang nhap thanh cong");
}else
{
	System.out.println("dang nhap that bai");
}
}
}
