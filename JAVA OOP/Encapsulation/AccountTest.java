class Account{
    private long acc_no;
    private String name,email;
    private int amount;

    public long getAccount(){
        return acc_no;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public int getAmount(){
        return amount;
    }
    public void setAccount(long a){
        acc_no=a;
    }
    public void setName(String n){
     name=n;
    }
    public void setEmail(String e){
    email=e;
    }
    public void setAmount(int am){
     amount=am;
    }
} 
class AccountTest {
    public static void main(String[] args) {
        Account ac=new Account();
        ac.setAccount(220099666);
        ac.setName("Tarun Kumar");
        ac.setEmail("tk8445@gmail.com");
        ac.setAmount(1450);
        System.out.println("Account: "+ ac.getAccount());
        System.out.println("Name: "+ ac.getName());
        System.out.println("Email: "+ ac.getEmail());
        System.out.println("Amount: "+ ac.getAmount());
    }
}