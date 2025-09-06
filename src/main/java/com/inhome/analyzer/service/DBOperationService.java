package com.inhome.analyzer.service;

import org.springframework.stereotype.Service;

@Service
public class DBOperationService {
    public String performDBOperation() {
        // Simulate a database operation
        return "Database operation performed successfully";
    }

    public String fetchDataFromDB() {
        // Simulate fetching data from a database
        return "Data fetched from database";
    }
}
