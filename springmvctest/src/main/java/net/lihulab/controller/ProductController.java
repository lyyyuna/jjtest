package net.lihulab.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    public static final Log logger = LogFactory.getLog(ProductController.class);

    @RequestMapping(value="/input-product")
    public String inputProduct() {
        logger.info("inputProduct function called");
        return "ProductForm";
    }

}