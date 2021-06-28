package service;

import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.StudentJparepository;

import java.util.List;

@Service
public class ServiceStudent {
    @Autowired
    StudentJparepository studentJparepository;

    public List<Student> getStudentList(){
        return studentJparepository.findAll();
    }
    public String add_stu(Student student){
        String msg="";
        if (student.getDept().equals("cs")){
            studentJparepository.save(student);
            msg="successfully added to database"
        }
        else
        {
            msg="Student are not belong to other dept";
        }
        return msg;
    }
    public void delete_student(Long id){
        studentJparepository.deleteById(id);
    }


}
