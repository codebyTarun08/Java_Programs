class Consumer{
    private String custId;
    private String name;
    private String address;
    private String phno;

    public Consumer(String custId,String name,String address,String phno){
        this.custId=custId;
        this.name=name;
        setAddress(address);
        setPhno(phno);
    }
    public void setAddress(String a){
        address=a;
    }
    public void setPhno(String ph){
        phno=ph;
    }
    public String getCustId(){ return custId;}
    public String getName(){ return name;}
    public String getAddress(){return address;}
    public String getPhno(){return phno;}
}
public class CustomerTest{
    public static void main(String[] args) {
        Consumer cn=new Consumer("A-34","Avx","1826hj","78887810");
           System.out.println("customerId: "+ cn.getCustId());
           System.out.println("Name: "+ cn.getName());
           System.out.println("Address: "+ cn.getAddress());
           System.out.println("phno: "+ cn.getPhno());
    }
}