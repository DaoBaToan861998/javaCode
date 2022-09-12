package bai6String;
import java.util.*;
public class JA1_8_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= "School is the bored place. So you should go to the game centre. It is funny and very good for relaxing." ;
int demChuT=0;
int demChuS=0;
for(int i=0;i<str.length();i++)
{
	if(str.charAt(i)=='t' || str.charAt(i)=='T')
	{
		demChuT++;
	}else if(str.charAt(i)=='s' || str.charAt(i)=='S')
	{
		demChuS++;
	}
}
if(demChuS>=demChuT)
{
	System.out.println("tieng AA");
}else
{
	System.out.println("tieng AM");
}
	}

}
