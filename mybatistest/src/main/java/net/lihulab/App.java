package net.lihulab;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

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

        Student student = new Student("tula","It", 44, 1111803322, "tula@gmail.com");
        try {
            session.insert("Studentss.insert", student);
            System.out.println("Insert one student.");
        } finally {
            session.commit();
            session.close();
        }
    }
}
