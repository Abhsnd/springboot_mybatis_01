package com.kaung.controller;

import com.kaung.pojo.Department;
import com.kaung.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @GetMapping("/department")
    public List<Department> getdepartmentList() {
        List<Department> departmentList = departmentService.getDepartmentList();
        return departmentList;
    }

    @GetMapping("/department/{id}")
    public Department getdepartmentById(@PathVariable("id") Integer id) {
        Department department = departmentService.getDepartmentById(id);
        return department;
    }
}
