package net.lihulab.controller;

import net.lihulab.bean.Department;
import net.lihulab.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

    @Autowired
    DepartmentMapper departmentMapper;

    @RequestMapping("/dept/{id}")
    public Department getDeptById(@PathVariable("id")Integer id) {
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/dep")
    public Department insertDept(Department dep) {
        departmentMapper.insertDept(dep);
        return dep;
    }
}
