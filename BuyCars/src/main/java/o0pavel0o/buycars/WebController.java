package o0pavel0o.buycars;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController{


	@GetMapping("/login")
    public String login() {
    	return "login";
    }
    
    @GetMapping("/loginerror")
    public String loginerror() {
    	return "loginerror";
    }

    @GetMapping("/home")
    public String home() {
    	return "home";
    }
    
}
