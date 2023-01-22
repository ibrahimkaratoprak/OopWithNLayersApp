package oopWithNLayeredApp.dataAccess;
import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
    //veri erişimi katmanı
    public void add(Product product) {
        //sadece db erişim kodları buraya yazılır
        System.out.println("JDBC ile veritabanına eklendi.");
    }

}
