package gradlespringapp.gradlespringapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/wish")
    public String wish(){
        return "Hello gradle spring project";
    }
}
