package wizut.tpsi.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalculatorController {
     @Autowired
    private CalculatorService calculatorService;
    
    
         @GetMapping("/add")
    public String addForm(CalculatorForm form) {
        return "add";
    }
         @GetMapping("/multiply")
    public String multiplyForm(CalculatorForm form) {
        return "multiply";
    }
     
         @GetMapping("/calculate")
    public String calculateForm(CalculatorForm form) {
        return "calculate";
    }
     
    @RequestMapping("/")
    public String home() {
        return "index";
    }
    
    
    @RequestMapping("/add")
  public String addNumbers(Model model, CalculatorForm form, BindingResult binding) {
        if(binding.hasErrors()) {
        return "add"; 
        }
             
//       int result = form.getX() + form.getY();
        int result = calculatorService.add(form.getX(), form.getY());
        form.setOperation("+");
        model.addAttribute("result", result);
        return "result";
    }
    
 

  

    @RequestMapping("/multiply")
 public String multiplyNumbers(Model model, CalculatorForm form, BindingResult binding) {
         if(binding.hasErrors()) {
        return "multiply"; 
        }
//        int result = form.getX() * form.getY();
          int result = calculatorService.multiply(form.getX(), form.getY());
        form.setOperation("*");
        model.addAttribute("result", result);
        return "result";
    }

    @RequestMapping("/calculate")
   public String doCalculations(Model model, CalculatorForm form, BindingResult binding) {
         if(binding.hasErrors()) {
        return "calculate"; 
        }   
         int result = calculatorService.calculate(form.getX(), form.getY(), form.getOperation());      
        model.addAttribute("result", result); 
        return "result";
    }
}
