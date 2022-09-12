package bai6String;
import java.util.*;
public class JA1__8_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String nhap="    Dao      Ba ToAN ";
nhap=nhap.trim();
//xoa 2 khong trong o 2 dau
nhap=nhap.replace(" ","");
//thay doi khoang trang thanh khong co khong trang
nhap=nhap.toLowerCase();
//viet thuong toan bo chuoi
String nhap2="@gmail.com";
String nhap3=nhap.concat(nhap2);
System.out.println(nhap3);
	}

}
