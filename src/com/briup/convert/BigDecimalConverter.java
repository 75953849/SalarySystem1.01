package com.briup.convert;

import java.math.BigDecimal;

import org.springframework.core.convert.converter.Converter;

public class BigDecimalConverter implements Converter<String, BigDecimal> {

	@Override
	public BigDecimal convert(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("BigDecimal");
		BigDecimal val = BigDecimal.valueOf(Integer.parseInt(arg0));
		return val;
	}
	
}
