package bai6String;
import java.util.*;
public class JA1_8_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder str=new StringBuilder("hello world,hi java");
int index=str.indexOf("hello");
int index2=str.lastIndexOf("hi");
str.delete(index, index2);
System.out.println(str);
	}
}
