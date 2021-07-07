package service;

import model.Employee2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.Employee2repository;

import java.util.List;
@Service
public class Employee2serviceImpl implements Employee2service{

    @Autowired
    private Employee2repository employee2repository;

    @Override
    public List<Employee2>getAllEmployees(){
        return employee2repository.findAll();
    }
}
