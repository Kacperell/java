/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizut.tpsi.lab6;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author kacperel
 */
@Controller
public class CalculatorController {
    
    
    
    @RequestMapping("/dodaj")
        public String Dodaj(Model model, Integer a, Integer b) {
                        model.addAttribute("a", a);
                        model.addAttribute("b", b);
                        model.addAttribute("aplusb", a+b);
        
            return "dodane";
        }
        
          
    @RequestMapping("/oblicz")
        public String oblicz(Model model, Integer kwa, Integer kwb,String dzialanie) {
                        model.addAttribute("a", kwa);
                        model.addAttribute("b", kwb);
                        model.addAttribute("dzialanie", dzialanie);
                        System.out.println(dzialanie);
                
                        int wynik=0;
                        
                         if("+".equals(dzialanie)){
                             wynik=kwa+kwb;
                         }
                         else if("-".equals(dzialanie)) {
                                wynik=kwa-kwb;
                         }
                         else if("*".equals(dzialanie)) {
                                  wynik=kwa*kwb;
                         }
                                 
                                 
                        model.addAttribute("wynik", wynik);
                        
        
            return "oblicz";
        }
        
        
        @RequestMapping("/obliczzad3")
        public String obliczzad3(Model model, CalculatorForm liczby) {
                           
                        model.addAttribute("a", liczby.getLiczbaA());
                        model.addAttribute("b", liczby.getliczbaB());
                         model.addAttribute("dzialanie", liczby.getDzialanieZad3());
                    
                     
                        int wynik=0;
                        
                     
                                    if("+".equals(liczby.getDzialanieZad3())){
                                        wynik=liczby.getLiczbaA()+liczby.getliczbaB();
                                            System.out.println("+");
                                    }
                                    else if("-".equals(liczby.getDzialanieZad3())) {
                                           wynik=liczby.getLiczbaA()-liczby.getliczbaB();
                                              System.out.println("-");
                                    }
                                    else if("*".equals(liczby.getDzialanieZad3())) {
                                             wynik=liczby.getLiczbaA()*liczby.getliczbaB();
                                                System.out.println("*");
                                    }
             
                                 
                        model.addAttribute("wynik", wynik);
                        
        
            return "oblicz";
        }
        
        
}
