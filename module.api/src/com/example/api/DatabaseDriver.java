package com.example.api;

public interface DatabaseDriver {
    Connection connect(String url);
}
