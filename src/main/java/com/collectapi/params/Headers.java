package com.collectapi.params;

import java.util.HashMap;

public class Headers {
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String AUTHORIZATION = "authorization";
    public static HashMap<String ,String >getHeaders(){
        HashMap<String,String> headers = new HashMap<>();
        headers.put(CONTENT_TYPE, "application/json");
        headers.put(AUTHORIZATION, "apikey 3kOUS3z1UjXKDsEYelv8DH:5zziLhgrybsWS7OyglFdk3");
        return headers;
    }
}
