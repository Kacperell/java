
package wizut.tpsi.lab6;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author kacperel
 */
@Controller
public class HomeController {

@RequestMapping("/")
public String home() {
//    model.addAttribute("imie", "Kacper");
    return "home";
}
//

   @RequestMapping("/hello")
        public String hello(Model model, String imie, Integer wiek) {
            model.addAttribute("imie", imie);
            model.addAttribute("wiek", wiek);

            return "hello";
        }

}