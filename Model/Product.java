
import java.util.*;

/**
 * 
 */
public abstract class Product {

    /**
     * Default constructor
     */
    public Product() {
    }

    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Double price;

    /**
     * @return
     */
    public abstract double calculateFinalPrice();

    /**
     * @return
     */
    public String getId() {
        // TODO implement here
        return id;
    }

    /**
     * @param id 
     * @return
     */
    public void setId(String id) {
        // TODO implement here
    	this.id=id;
    }

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return name;
    }

    /**
     * @param name 
     * @return
     */
    public void setName(String name) {
        // TODO implement here
        this.name=name;
    }

    /**
     * @return
     */
    public Double getPrice() {
        // TODO implement here
        return price;
    }

    /**
     * @param price 
     * @return
     */
    public void setPrice(Double price) {
        // TODO implement here
        this.price=price;
    }

    /**
     * @param id 
     * @param name 
     * @param price
     */
    public Product(String id, String name, Double price) {
        // TODO implement here
    	this.id=id;
    	this.name=name;
    	this.price=price;
    }
    

}