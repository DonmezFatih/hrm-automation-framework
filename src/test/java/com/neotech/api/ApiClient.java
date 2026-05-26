package com.neotech.api;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class ApiClient {

    static {
        RestAssured.baseURI = "https://hrm.neotechacademy.com";
    }

    public static RequestSpecification request() {
        return RestAssured
                .given()
                .header("Content-Type", "application/json");
    }
}