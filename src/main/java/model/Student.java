package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Student_table_23")
public class Student {
    public Student(){
    }
    @Id
    @GeneratedValue

    Long id;
    @Column(name = "Student_name")
    String name;
    @Column(name = "Student_id")
    int Student_id;
    @Column(name = "Student_dept")
    String dept;

    public Student(Long id, String name, int student_id, String dept) {
        this.id = id;
        this.name = name;
        Student_id = student_id;
        this.dept = dept;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudent_id() {
        return Student_id;
    }

    public void setStudent_id(int student_id) {
        Student_id = student_id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
