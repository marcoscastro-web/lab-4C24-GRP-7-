package com.tecsup.lab;

public class StudentView {
    public void showStudentDetails(String studentName, String studentLastName, String studentCode) {
        System.out.println("=== DATOS DEL ESTUDIANTE ===");
        System.out.println("Nombre: " + studentName);
        System.out.println("Apellido: " + studentLastName);
        System.out.println("Código: " + studentCode);
        System.out.println("=============================");
    }

    public void showMessage(String message) {
        System.out.println("Mensaje: " + message);
    }
}