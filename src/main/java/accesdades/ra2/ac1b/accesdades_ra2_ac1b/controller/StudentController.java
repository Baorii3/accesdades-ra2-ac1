package accesdades.ra2.ac1b.accesdades_ra2_ac1b.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import accesdades.ra2.ac1b.accesdades_ra2_ac1b.model.Student;
import accesdades.ra2.ac1b.accesdades_ra2_ac1b.repository.StudentRepository;

@RestController
@RequestMapping("/api")
public class StudentController {
    
    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/student")
    public List<Student> getStudent() {
        
        return studentRepository.findAll();
    }

    @PostMapping("/student/batch")
    public String addStudent(){
        int numReg = studentRepository.save();
        return String.format("Has afegit %d registre", numReg);
    }

}