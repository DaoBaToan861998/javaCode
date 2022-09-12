package bai7dataTime;
import java.text.SimpleDateFormat;
import java.util.*;
public class JA1_9_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calendar cal=Calendar.getInstance();
System.out.println(cal.getTime());
SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss");
System.out.println(dateformat.format(cal.getTime()));
	}

}
