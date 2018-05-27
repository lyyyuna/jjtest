package net.lihulab.controller;

import com.alibaba.fastjson.JSONObject;
import net.lihulab.domain.Book;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/json")
public class BookController {

    private static final Log logger = LogFactory.getLog(BookController.class);

    @RequestMapping(value="/test")
    public void setJson(@RequestBody Book book,
                        HttpServletResponse response) throws Exception{
        logger.info(JSONObject.toJSONString(book));
        book.setAuthor("肖文吉");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println(JSONObject.toJSONString(book));
    }
}
