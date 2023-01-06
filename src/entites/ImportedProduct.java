package entites;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(){

    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String getName() {
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

    public Double totalPrice(){
        return getPrice() + customsFee;
    }

    @Override
    public String tagPrice(){
        return getName()
                        + " $ "
                        +String.format("%.2f", totalPrice())
                        +" (Customs fee: $ "
                        +String.format("%.2f",customsFee)
                        +")";
    }
}
