package pro.sky.skyprohomeworkspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprohomeworkspring.service.CalculatorServiceImpl;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorServiceImpl calculatorService;
    public CalculatorController(CalculatorServiceImpl calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String answerCalculator() {
        return calculatorService.answerCalculator();
    }

    @GetMapping("/plus")
    public String plusCalculator(@RequestParam(required = false, name = "num1") Float userNum1, @RequestParam(required = false, name = "num2") Float userNum2) {
        return calculatorService.plusCalculator(userNum1, userNum2);
    }

    @GetMapping("/minus")
    public String minusCalculator(@RequestParam(required = false, name = "num1") Float userNum1, @RequestParam(required = false, name = "num2") Float userNum2) {
        return calculatorService.minusCalculator(userNum1, userNum2);
    }

    @GetMapping("/multiply")
    public String multiplyCalculator(@RequestParam(required = false, name = "num1") Float userNum1, @RequestParam(required = false, name = "num2") Float userNum2) {
        return calculatorService.multiplyCalculator(userNum1, userNum2);
    }

    @GetMapping("/divide")
    public String divideCalculator(@RequestParam(required = false, name = "num1") Float userNum1, @RequestParam(required = false, name = "num2") Float userNum2) {
        return calculatorService.divideCalculator(userNum1, userNum2);
    }
}
