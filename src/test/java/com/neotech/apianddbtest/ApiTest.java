package com.neotech.apianddbtest;

import com.neotech.api.EmployeeApi;

import io.restassured.response.Response;

public class ApiTest {

    public static void main(String[] args) {

        EmployeeApi api = new EmployeeApi();

        Response response = api.getEmployeeById("182");

        System.out.println(response.statusCode());
        System.out.println(response.prettyPrint());
    }
}