package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public interface ProductDao {
    //jdbc ve hibernate bağımlı olmamak için arayüz kullanarak gerekli veri erişimini kullan
    //interface ler sadece metot imzasını barındırabilri.
    void add(Product product);
}
