package bai6String;
import java.util.*;

import javax.swing.plaf.synth.SynthStyleFactory;
public class JA1_8_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Hello HvitClan";
StringBuilder str2 = new StringBuilder(str);
str2 = str2.reverse();
boolean b = str.equals(str2.toString());
if(b) {
	System.out.println(str);
}else {
	System.out.println(str+str2);
}
	}

}
