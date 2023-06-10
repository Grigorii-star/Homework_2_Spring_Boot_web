package pro.sky.skyprohomeworkspring.service;

import org.springframework.stereotype.Service;
import pro.sky.skyprohomeworkspring.api.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String answerCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String plusCalculator(Float userNum1, Float userNum2) {
        if (userNum1 == null || userNum2 == null) {
            return "Необходимо ввести значения";
        } else {
            return userNum1 + " + " + userNum2 + " = " + (userNum1 + userNum2);
        }
    }

    public String minusCalculator(Float userNum1, Float userNum2) {
        if (userNum1 == null || userNum2 == null) {
            return "Необходимо ввести значения";
        } else {
            return userNum1 + " - " + userNum2 + " = " + (userNum1 - userNum2);
        }
    }

    public String multiplyCalculator(Float userNum1, Float userNum2) {
        if (userNum1 == null || userNum2 == null) {
            return "Необходимо ввести значения";
        } else {
            return userNum1 + " * " + userNum2 + " = " + (userNum1 * userNum2);
        }
    }

    public String divideCalculator(Float userNum1, Float userNum2) {
        if (userNum1 == null || userNum2 == null) {
            return "Необходимо ввести значения";
        } else {
            if (userNum2 == 0) {
                return "Делить на 0 нельзя";
            } else {
                return userNum1 + " / " + userNum2 + " = " + (userNum1 / userNum2);
            }
        }
    }
}
