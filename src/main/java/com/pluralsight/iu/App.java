package com.pluralsight.iu;

import org.apache.commons.dbcp2.BasicDataSource;

public class App {
    public static void main(String[] args) {
        String url = args[0];
        String username = args[1];
        String password = args[2];

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
    }
}
