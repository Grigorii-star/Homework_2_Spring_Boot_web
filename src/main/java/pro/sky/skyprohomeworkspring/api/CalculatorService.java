package pro.sky.skyprohomeworkspring.api;

public interface CalculatorService {
    String answerCalculator();
    String plusCalculator(Float userNum1, Float userNum2);
    String minusCalculator(Float userNum1, Float userNum2);
    String multiplyCalculator(Float userNum1, Float userNum2);
    String divideCalculator(Float userNum1, Float userNum2);
}
