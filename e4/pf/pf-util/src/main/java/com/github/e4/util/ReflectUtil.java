package com.github.e4.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class ReflectUtil {

	public static Type[] getGenericTypes(Class clazz){
		ParameterizedType type = (ParameterizedType)clazz.getGenericSuperclass();
		if(type == null){
			return null;
		}
		return type.getActualTypeArguments();
	}
}
