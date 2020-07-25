
public class ProductList
{
    private String productName;
    private String date;
    private String price;        
    
    public ProductList(String productName, String price)
    {
        this.productName = productName;
        this.price = price;
        this.date = java.time.LocalDate.now().toString();
    }

    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String getPrice()
    {
        return price;
    }

    public void setPrice(String price)
    {
        this.price = price;
    }
    
    
}
