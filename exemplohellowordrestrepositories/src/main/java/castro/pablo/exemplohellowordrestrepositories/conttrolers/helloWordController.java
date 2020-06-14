package castro.pablo.exemplohellowordrestrepositories.conttrolers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ author Pablo Castro
 * @ since 10/06/2020 15:01
 * @ version 1.0
 */
@RestController
public class helloWordController {
    @GetMapping("/")
    public String index(){
        return "ola hello word com rest";

    }
}
