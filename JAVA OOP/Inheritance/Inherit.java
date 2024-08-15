import java.util.*;

class Account {
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;

    public Account(String acc, String n, String addr, String phno, String dob) {
        accNo = acc;
        name = n;
        address = addr;
        this.phno = phno;
        this.dob = dob;
        balance = 0;
    }

    public String getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhno() {
        return phno;
    }

    public long getBalance() {
        return balance;
    }

    public void setAdress(String addr) {
        address = addr;
    }

    public void setPhno(String p) {
        phno = p;
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String acc, String n, String addr, String phno, String dob) {
        super(acc, n, addr, phno, dob);
    }

    public void deposit(long amt) {
        balance += amt;
    }

    public void withdraw(long amt) {
        balance -= amt;
    }
}

class LoanAccount extends Account {

    public LoanAccount(String acc, String n, String addr, String phno, String dob) {
        super(acc, n, addr, phno, dob);
    }

    public void payEMI(long amt) {
        balance -= amt;
    }

    public void rePay(long amt) {
        if (balance == amt) {
            balance = 0;
        }
    }
}

public class Inherit {
    private static final String LoanAccount = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("   Choose the operation   ");
        System.out.println("1.Choose Savings Account   ");
        System.out.println("2.Choose Loan Account   ");

        int n;
        n = sc.nextInt();
        switch (n) {
            case 1:
                SavingsAccount s = new SavingsAccount("10001345683009", "Tarun", "Ambedkarnagar", "5462897",
                        "5-5-2005");
                System.out.println("Your Savings Account is Opened.");
                System.out.println("   Choose the operation   ");
                System.out.println("1.Show the Details of Customer");               
                System.out.println("2.Deposit amount in savings account:");
                System.out.println("3.Withdraw the amount from Savings Acount.:");
                int s1;
                s1 = sc.nextInt();
                switch (s1) {
                    case 1:
                        System.out.println("ACCount no. : " + s.getAccNo() + "ADDRESS: " + s.getAddress() + "BALANCE: "
                                + s.getBalance() + "Name: " + s.getName() + "Phone no. : " + s.getPhno());
                        break;
                    case 2:
                        int rs;
                        System.out.println("Enter amount :");
                        rs = sc.nextInt();
                        s.deposit(rs);
                        break;
                    case 3:
                        System.out.println("Your Balance: " + s.getBalance());
                        int wd;
                        System.out.println("Enter Withdrawal:");
                        wd = sc.nextInt();
                        s.deposit(wd);
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        break;
                }
                break;
            case 2:
                LoanAccount l = new LoanAccount("10001345683009", "Tarun", "Ambedkarnagar", "5462897", "5-5-2005");
                System.out.println("Your Loan Account is Opened.");
                int s2;
                s2 = sc.nextInt();
                System.out.println("   Choose the operation   ");
                System.out.println("1.Show the Details of Customer");
                switch (s2) {
                    case 1:
                        System.out.println("ACCount no. : " + l.getAccNo() + "ADDRESS: " + l.getAddress() + "BALANCE: "
                                + l.getBalance() + "Name: " + l.getName() + "Phone no. : " + l.getPhno());
                        break;

                    default:
                        System.out.println("Invalid Choice");
                        break;
                }
                break;

            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}
