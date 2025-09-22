public class Account {
   
    public int id;
    public int num;
    public String name;
    public long balance;


    public Account(int id, int num, String name, long balance) {
        this.id = id;
        this.num = num;
        this.name = name;
        this.balance = balance;
    }

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }

   
    @Override
    public String toString() {
        return "Account: id=" + id + ", num=" + num + ", name=" + name + ", balance=" + balance + "";
    }

  
    public static void main(String[] args) {
        
        Account a1 = new Account(1, 10, "Alice", 1000);
        Account a2 = new Account(2, 20, "Bob", 100000);
        Account a3 = new Account(3, 30, "Charlie", 1000000000000L);

        Account[] accounts = {a1, a2, a3};

       
        Account maxBalanceAccount = accounts[0];
        for (Account acc : accounts) {
            if (acc.getBalance() > maxBalanceAccount.getBalance()) {
                maxBalanceAccount = acc;
            }
        }

       
        System.out.println("User with maximum balance: " + maxBalanceAccount.getName());
        System.out.println("Details: " + maxBalanceAccount);
    }
}
