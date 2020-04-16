package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import services.FakeService;
import services.Service;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class HelloController {

    /*@Autowired*/
    public Service service = new FakeService();

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "hello";
    }

    @RequestMapping(value = "cars", method = RequestMethod.GET)
    public String printCar(ModelMap model, @ModelAttribute("locale") String locale) {
        List<String> messages = new ArrayList<>();
        if (locale.equals("ru")) {
            messages.add("МАШИНЫ");
        } else {
            messages.add("CARS");
        }
		model.addAttribute("messages", messages);
        model.addAttribute("cars", service.listCars());
        return "cars";
    }
}