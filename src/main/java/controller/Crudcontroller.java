package controller;

import model.Employeemodel;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

public class Crudcontroller {
    /*c-create:adding resource
      r-read:get resource
      u-update:update resource
      d-delete:remove resource
     */
    List<Employeemodel>employeeList=new ArrayList<>();

    //create Endpoint
    @RequestMapping("/add_emp")
    public String add(@RequestBody Employeemodel employee){
        employeeList.add(employee);
        return employee.getName()+"Added Successfully";
    }
    //get
    @RequestMapping("/get_all_emp")
    public List<Employeemodel>getEmployeeList(){
        return employeeList;
    }
    //Update
    @RequestMapping("/update_emp")
    public String Update(){
        employeeList.get(0).setName("java");
        return "name updated succefully to java";
    }
    //delete
    @RequestMapping("/remove_emp")
    public String remove(){
        employeeList.remove(0);
        return "employee deleted successfully...";
    }

}
