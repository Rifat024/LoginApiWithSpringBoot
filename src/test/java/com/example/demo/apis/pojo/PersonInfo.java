package com.example.demo.apis.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class PersonInfo {
    @JsonProperty("id")
    private UUID id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("password")
    private String password;

    public PersonInfo() {
    }

    public PersonInfo(UUID id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public PersonInfo(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
