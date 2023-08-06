package calculator.withTests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller {
    private final ServiceLogic serviceLogic;

    public Controller(ServiceLogic serviceLogic) {
        this.serviceLogic = serviceLogic;
    }

    @GetMapping
    public String wellcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String sum(@RequestParam int num1, @RequestParam int num2) {
        int result = serviceLogic.summ(num1, num2);
        return response(num1, num2, result, '+');
    }

    @GetMapping("/minus")
    public String subtract(@RequestParam int num1, @RequestParam int num2) {
        int result = serviceLogic.subtract(num1, num2);
        return response(num1, num2, result, '-');
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        int result = serviceLogic.multiply(num1, num2);
        return response(num1, num2, result, '*');
    }

    @GetMapping("/devide")
    public String devide(@RequestParam int num1, @RequestParam int num2) {
        int result = serviceLogic.devide(num1, num2);
        return response(num1, num2, result, '/');
    }

    private String response(int num1, int num2, int result, char act) {
        return String.format("%d %c %d = %d", num1, act, num2, result);
    }
}
