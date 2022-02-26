package com.wipro.strings;

public class first {

	public static void main(String[] args) {
//		String str= "abcd";
//		String a = new String("Inter");
//		System.out.println(System.identityHashCode(str));
//		str = "amazon";
//		System.out.println(System.identityHashCode(str));
//		System.out.println(str + a);
//		System.out.println(System.identityHashCode(str));
		
		StringBuffer ptr = new StringBuffer("Akshay");
		System.out.println(System.identityHashCode(ptr));
		ptr = new StringBuffer("Patidar");
		System.out.println(ptr);
		System.out.println(System.identityHashCode(ptr));
		System.out.println(ptr.length());
		System.out.println(ptr.substring(1,7));
		String s = "patidar good is a good boy";
		String t = "Patidar";
		System.out.println(t.compareTo(s));
		System.out.println(s.equals(t));
		String change = s.toUpperCase();
		System.out.println(change);
		
		StringBuffer ss = new StringBuffer("");
		for(int i=0;i<s.length();i++)
		{
			ss.append( s.charAt(i));
		}
		System.out.println(ss);
		
		System.out.println(s.indexOf("good"));
		System.out.println(s.lastIndexOf("good"));
	}

}
