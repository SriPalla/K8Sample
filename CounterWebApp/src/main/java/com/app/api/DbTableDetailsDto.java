package com.app.api;

import java.util.ArrayList;
import java.util.List;

public class DbTableDetailsDto {
	private List<String> tableName;

	public List<String> getTableName() {
		return tableName == null ? new ArrayList<String>() : tableName;
	}

	public void setTableName(List<String> tableName) {
		this.tableName = tableName;
	}
}
