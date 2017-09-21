package com.z.convert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class MyDateConvert implements Converter<String, Date>{

	@Override
	public Date convert(String arg0) {
		
		Date date=null;
		try {
			SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
			
			System.out.println("MyDateConvert-===---------==");
			date = dateFormat.parse(arg0);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return date;
	}

}
