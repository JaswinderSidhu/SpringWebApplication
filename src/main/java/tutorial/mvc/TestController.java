package tutorial.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jsidhu on 17/04/16.
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "view";
    }
}
