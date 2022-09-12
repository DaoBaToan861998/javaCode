package bai6String;
import java.util.*;
public class JA1_8_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Baby, I don't feel so good 6";
int demChuCai=0;
int demChuSo=0;
int demKyTu=0;
for(int i=0;i<str.length();i++)
{
	if(Character.isLetter(str.charAt(i)))
	{
		demChuCai++;
	}else if(Character.isDigit(str.charAt(i)))
	{
		demChuSo++;
	}else
	{
		demKyTu++;
	}
}
System.out.println("chu cai:"+demChuCai+" "+"chu so:"+demChuSo+" "+"kytu :"+demKyTu);
	}

}
