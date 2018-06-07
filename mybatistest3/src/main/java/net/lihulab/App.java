package net.lihulab;


import net.lihulab.domain.Order;
import net.lihulab.domain.User;
import net.lihulab.mapper.OrderMapper;
import net.lihulab.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        String resource = "conf.xml";
        InputStream is = App.class.getClassLoader().getResourceAsStream(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);

        SqlSession session = sessionFactory.openSession();

        UserMapper um = session.getMapper(UserMapper.class);

        User user = um.selectUserById(1);

        OrderMapper om = session.getMapper(OrderMapper.class);
        Order order = om.selectById(1);
    }
}
