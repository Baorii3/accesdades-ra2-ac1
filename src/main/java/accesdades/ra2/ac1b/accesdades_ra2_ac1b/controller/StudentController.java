package accesdades.ra2.ac1b.accesdades_ra2_ac1b.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {
    
    @GetMapping("/student")
    public String getStudent() {
        return "Get Student";
    }

    @PostMapping("/student/batch")
    public String postStudent(){
        return "Post Student";
    }

}