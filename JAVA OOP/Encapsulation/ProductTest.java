class Product{
    private String itemno;
    private String name;
    private int price;
    private int qty;

    public Product(String itemNo,String name,int p,int q){
        itemno=itemNo;
        this.name=name;
        setPrice(p);
        setQuantity(q);
    }
    public void setPrice(int pr){
        price=pr;
    }
    public void setQuantity(int qt){
        qty=qt;
    }
    public String getItemNo(){ return itemno;}
    public String getName(){ return name;}
    public int getPrice(){return price;}
    public int getQuantity(){return qty;}
}
public class ProductTest {
    public static void main(String[] args) {
        Product pr=new Product("1C-03","ABC",150,10);
        System.out.println("ItemNummber: "+ pr.getItemNo());
        System.out.println("Name: "+ pr.getName());
        System.out.println("Price: "+ pr.getPrice());
        System.out.println("Quantity: "+ pr.getQuantity());
    }
}
