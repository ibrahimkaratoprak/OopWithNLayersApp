package oopWithNLayeredApp.entities;

/* parametresiz yapıcı blok
parametreli yapıcı blok
getter and setter
 */
public class Product {
    private int id;
    private String name;
    private double unitPrice;

    public Product() {
        super();
        //yapıcı blok
    }

    public Product(int id, String name, double unitPrice) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        //parametreli constructor
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
