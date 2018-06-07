package net.lihulab.mapper;

import com.sun.tools.corba.se.idl.InterfaceGen;
import net.lihulab.domain.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select * from tb_user where id = #{id}")
    User selectUserById(Integer i);
}
