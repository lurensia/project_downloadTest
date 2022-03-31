package site.metacoding.project1.map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapController {

    @GetMapping("/")
    public String test() {
        return "/mapTest";
    }
}
