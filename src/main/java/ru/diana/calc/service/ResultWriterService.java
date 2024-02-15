package ru.diana.calc.service;

public class ResultWriterService {
    public static void getResult (String operation, int num1, int num2, int result) {
        System.out.println("Операция: " + operation + " - число 1: " + num1 + ", число 2: " + num2 + ", результат: " + result);
    }
}
