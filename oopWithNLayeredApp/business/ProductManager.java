package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        //response request
        // business rules -iş kuralları
        if (product.getUnitPrice() < 10) {
            throw new Exception("ürün fiyatı 10 dan küçük olamaz");
        }
        productDao.add(product);
        for (Logger logger : loggers) {
            logger.log(product.getName());
        }
    }
}
//bir katman başka bir katmanın classını kullanırken sadece interfaceden erişim kurmalıdır.