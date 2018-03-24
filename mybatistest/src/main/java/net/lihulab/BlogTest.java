package net.lihulab;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BlogTest {
	public static void main(String[] args) {
        String resource = "conf.xml";
        InputStream is = App.class.getClassLoader().getResourceAsStream(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);

        SqlSession session = sessionFactory.openSession();
        
        BlogMapper mapper = session.getMapper(BlogMapper.class);  
        Blog blog = mapper.findById(2); 

        if (blog != null) {
            System.out.println(blog.getTitle());
            System.out.println(blog.getAuthor().getUsername());
        }
        session.close();
	}
}