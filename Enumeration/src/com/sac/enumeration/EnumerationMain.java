package com.sac.enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationMain {

	public static void main(String[] args) {
		
		Enumeration<String> enumeration;
		
		Vector<String> namesOfDays = new Vector<>();
		namesOfDays.addElement("Sunday");
		namesOfDays.addElement("Monday");
		System.out.println(namesOfDays.add("Tuesday"));
		namesOfDays.addElement("Wednesday");
		
		enumeration = namesOfDays.elements();
		
		while(enumeration.hasMoreElements()){
			System.out.println(enumeration.nextElement());
		}

	}

}
