package com.briup.convert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String, Date> {

	private String datePattern = "yyyy-MM-dd";
	@Override
	public Date convert(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("日期转换器运行");
		SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
		try {
			return sdf.parse(arg0);
		} catch (ParseException e) {
			throw new IllegalArgumentException("无效的日期格式，请使用这种格式："+datePattern);
		}
	}

	

}
