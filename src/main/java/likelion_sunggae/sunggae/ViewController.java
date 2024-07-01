package likelion_sunggae.sunggae;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller

public class ViewController {
    @GetMapping("sunggae")
    public String View(Model model){
        model.addAttribute("sunggae","sunggae");
        return "sunggae";
    }
}
