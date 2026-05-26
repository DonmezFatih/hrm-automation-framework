package com.neotech.api;

import io.restassured.response.Response;

public class EmployeeApi extends ApiClient {

    public Response getEmployeeById(String id) {

        return request()
                .when()
                .get("/api/employees/" + id);
    }
}