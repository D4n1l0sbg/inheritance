package entites;

import java.util.Date;

public class UsedProduct extends Product{
    private Date manufactureDate;

    public UsedProduct(Date manufactoreDate) {
        this.manufactureDate = manufactoreDate;
    }

    public UsedProduct(String name, Double price, Date manufactoreDate) {
        super(name, price);
        this.manufactureDate = manufactoreDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactoreDate) {
        this.manufactureDate = manufactoreDate;
    }



}
