package entites;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
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

    @Override
    public String getName(){
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public Double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(Double price) {
        super.setPrice(price);
    }

    @Override
    public String tagPrice(){
       return getName()
                        + "(used) $ "
                        +String.format("%.2f",getPrice())
                        +"(Manufacture date: "
                        +sdf.format(manufactureDate)
                        +")";
    }
}
