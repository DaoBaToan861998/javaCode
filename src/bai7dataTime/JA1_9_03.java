package bai7dataTime;

import java.util.Calendar;
import java.util.TimeZone;

public class JA1_9_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calendar cal=Calendar.getInstance();
cal.setTimeZone(TimeZone.getTimeZone("GMT+9"));
System.out.println("giờ hiện tại của NHẬT BẢN là:"+cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
	}

}
