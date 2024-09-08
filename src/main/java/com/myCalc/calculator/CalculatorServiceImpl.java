package com.myCalc.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String plus(String num1, String num2) {
        if (num1 == null || num1.isEmpty() || num2 == null || num2.isEmpty()) {
            return printParamError();
        }
        return num1 + " + " + num2 + " = " + (Double.parseDouble(num1) + Double.parseDouble(num2));
    }

    @Override
    public String minus(String num1, String num2) {
        if (num1.isEmpty() || num2.isEmpty()) {
            return printParamError();
        }
        return num1 + " - " + num2 + " = " + (Double.parseDouble(num1) - Double.parseDouble(num2));
    }

    @Override
    public String multiply(String num1, String num2) {
        if (num1.isEmpty() || num2.isEmpty()) {
            return printParamError();
        }
        return num1 + " * " + num2 + " = " + (Double.parseDouble(num1) * Double.parseDouble(num2));
    }

    @Override
    public String divide(String num1, String num2) {
        if (num1.isEmpty() || num2.isEmpty()) {
            return printParamError();
        }
        if (!num2.equals("0")) {
            return num1 + " / " + num2 + " = " + (Double.parseDouble(num1) / Double.parseDouble(num2));
        }
        return "Деление на 0 запрещено";
    }

    @Override
    public String printParamError() {
        return "<b>Ошибка подачи параметров.</b> Калькулятор работает только с двумя числами!";
    }
}
