package com.example.client;

import com.example.api.annotation.DatabaseDriverType;
import com.example.api.DatabaseDriver;

import java.util.ServiceLoader;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        ServiceLoader<DatabaseDriver> loader = ServiceLoader.load(DatabaseDriver.class);

        loader.stream()
                .filter(service -> {
                    Class<? extends DatabaseDriver> driverType = service.type();

                    if (driverType.isAnnotationPresent(DatabaseDriverType.class)) {
                        String value = driverType.getAnnotation(DatabaseDriverType.class).value();
                        return value.equals("mysql");
                    }
                    return false;
                })
                .map(ServiceLoader.Provider::get)
                .findFirst()
                .get().connect(args[0]);
    }
}
