
import java.util.ArrayList;


public class Users
{
    private String name;
    private ArrayList<ProductList> productList;
    
    public Users (String name)
    {
        this.name = name;
        productList = new ArrayList<>();
    }
    
    public void urunEkle (String productName, String price)
    {
        productList.add(new ProductList(productName, price));
    }
    
    public void urunCikar (int index)
    {
        productList.remove(index);
    }
    
    public void urunDuzenle (int index, String productName, String price)
    {    
        productList.set(index, new ProductList(productName, price));
    }
    
    public void temizle ()
    {
        productList.clear();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public ArrayList<ProductList> getProductList()
    {
        return productList;
    }

    public void setProductList(ArrayList<ProductList> productList)
    {
        this.productList = productList;
    }
    
    
    
}
