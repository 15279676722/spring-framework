package com.example.yq.ioc.conversionservice;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.stereotype.Component;

/**
 *
 * @author yangqiang
 * @create 2022-06-30 16:46
 */
@Component("conversionService")
public class MyConversionService extends DefaultConversionService {
	public MyConversionService() {
		addConverter(new MyConverter());
	}
}
