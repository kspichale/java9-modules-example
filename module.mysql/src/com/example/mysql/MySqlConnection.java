package com.example.mysql;

import com.example.api.Connection;

public final class MySqlConnection implements Connection {

	public MySqlConnection(String url) {
		System.out.println("URL for MySqlConnection: " + url);
	}
}
