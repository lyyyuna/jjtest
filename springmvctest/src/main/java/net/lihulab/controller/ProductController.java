package net.lihulab.controller;

import net.lihulab.domain.Product;
import net.lihulab.form.ProductForm;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;

@Controller
public class ProductController {

    public static final Log logger = LogFactory.getLog(ProductController.class);

    @RequestMapping(value="/input-product")
    public String inputProduct() {
        logger.info("inputProduct function called");
        return "ProductForm";
    }

    @RequestMapping(value="/save-product")
    public String saveProduct(ProductForm productForm, Model model) {
        logger.info("saveProduct function called");

        Product product = new Product();
        product.setName(productForm.getName());
        product.setDescription(productForm.getDescription());
        try {
            product.setPrice(new BigDecimal(productForm.getPrice()));
        } catch (NumberFormatException e) {
        }

        // add product

        model.addAttribute("product", product);
        return "ProductDetails";
    }

}