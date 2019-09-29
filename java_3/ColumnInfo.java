package com.one;

public class ColumnInfo {
	private String columnName;
	private Class<?>type;
	private boolean isID=false;
	private boolean nullable=true;
	private int length = 32;
	private boolean needPersist=false;
}
