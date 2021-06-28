package repository;

import model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentJparepository extends JpaRepository<Student,Long> {
public Student findByname(String name);
public Student findBydept(String dept);
}
