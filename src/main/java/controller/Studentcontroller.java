package controller;

import model.Studentmodel;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Studentcontroller {
    List<Studentmodel>studentList=new ArrayList<>();

    @RequestMapping("/add_stu")
    public String add(@RequestBody Studentmodel student){
        studentList.add(student);
        return student.getName()+"added successfully..";
    }
    @RequestMapping("/get_stu")
    public List<Studentmodel>getStudentList(){
        return studentList;
    }
    @RequestMapping("/update_stu")
    public String update(){
        studentList.get(0).setName("vicky");
        return "name updated successfully to vicky..";
    }
    @RequestMapping("/remove_stu")
    public String remove(){
        studentList.remove(0);
        return "Student deleted file....";
    }
}
