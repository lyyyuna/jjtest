package net.lihulab.mapper;

import net.lihulab.bean.Department;
import org.apache.ibatis.annotations.*;

@Mapper
public interface DepartmentMapper {

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "deptName", column = "dep"),
    })
    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Insert("insert into department (dep) values (#{deptName})")
    public int insertDept(Department department);
}
