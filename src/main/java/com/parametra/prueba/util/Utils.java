package com.parametra.prueba.util;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Utils {
	
	
	public static LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
		
	    return dateToConvert.toInstant()
	      .atZone(ZoneId.systemDefault())
	      .toLocalDate();
	}
	
	public static String  getTimeCalculation(LocalDate date) {
		
		  LocalDate now = LocalDate.now(); 
		  Period diff = Period.between(date, now);		  
		  return diff.getYears() + " Años " + diff.getMonths() + " Meses " + diff.getDays() + " dias " ;
	}
	
	public static int  getAge(LocalDate date) {
		
		  LocalDate now = LocalDate.now(); 
		  Period diff = Period.between(date, now);		  
		  return diff.getYears();
	}
	
}
