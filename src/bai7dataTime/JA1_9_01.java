package bai7dataTime;
import java.util.*;
public class JA1_9_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calendar ngayThang=new GregorianCalendar(1998,6,8);
System.out.println("ngay thang nam sinh cua toi la:"+ngayThang.getTime());
System.out.println("lay nam:"+ngayThang.get(Calendar.YEAR));
System.out.println("lay thang:"+ngayThang.get(Calendar.MONTH));
System.out.println("lay ngay:"+ngayThang.get(Calendar.DAY_OF_MONTH));
	}

}
