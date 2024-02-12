package ru.diana.calc.main;

import ru.diana.calc.service.ResultWriterService;
import ru.diana.calc.util.Calculator;

public class Main {
    public static void main (String[] args) {
        int result1 = Calculator.getSum(6, 5);
        ResultWriterService.getResult("сложение", 6, 5, result1);
        int result2 = Calculator.getDifference(10, 2);
        ResultWriterService.getResult("вычитание", 10, 2, result2);
        int result3 = Calculator.getProduct(3, 4);
        ResultWriterService.getResult("умножение", 3, 4, result3);
    }
}
