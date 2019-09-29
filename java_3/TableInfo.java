package com.one;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class TableInfo {
	private static String tableName;
	private Class<?>clazz;
	private static boolean needPersist=false;
	private static Map<String,ColumnInfo>columns=new HashMap<String,ColumnInfo>();
	public static  TableInfo parse(Class<?>clazz) {
		clazz=clazz;
		tableName=clazz.getSimpleName();
		Annotation[] annotations=clazz.getAnnotations();
		for(Annotation annotation:annotations) {
			if(annotation.annotationType().equals(Entity.class)) {
				needPersist=true;
				Entity entity=(Entity)annotation;
				if(!entity.value().equals("")) {
					tableName=entity.value();
				}
				break;
			}
		}
		if(needPersist) {
			Field[] fields=clazz.getDeclaredFields();
			for(Field filed:fields) {
				ColumnInfo column=new ColumnInfo();
				column=column.parse(field);
				if(column !=null) {
					columns.put(field.getName(),column);
				}
			}
		
		}
		else
		{
			return null;
		}
	}
}
