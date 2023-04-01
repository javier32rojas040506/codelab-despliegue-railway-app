package codelab.deploy.apprailway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class MyName {
    @GetMapping("my-name")
    public String getMyName(){
        return "Francisco Javier Rojas M.";
    }
}
