package com.tecsup.lab;

public class StudentModel {
    private String name;
    private String lastName;
    private String code;

    public StudentModel(String name, String lastName, String code) {
        this.name = name;
        this.lastName = lastName;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void displayStudentInfo() {
        System.out.println("Nombre: " + name + " " + lastName);
        System.out.println("Código: " + code);
    }
}