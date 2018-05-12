package com.example.mysql;

import com.example.api.Connection;
import com.example.api.DatabaseDriver;
import com.example.api.annotation.DatabaseDriverType;

@DatabaseDriverType("mysql")
public final class MySqlDatabaseDriver implements DatabaseDriver {

    public Connection connect(String url) {
        return new MySqlConnection(url);
    }
}
