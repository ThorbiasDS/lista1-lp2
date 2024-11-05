public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount){
        this.balance = this.balance + amount;
        return this.balance;
    }

    public int debit(int amount){
        if(amount <= this.balance) {
            this.balance = this.balance - amount;
            return this.balance;
        }else{
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    public int transferTo(Account another, int amount){
        if(amount <= this.balance){
            another.balance = amount;
        }else{
            System.out.println("Amount exceeded balance");
        }
        this.balance = this.balance - amount;
        return this.balance;
    }

    @Override
    public String toString() {
        return "Account[id="+this.id+",name="+this.name+",balance="+this.balance+"]";
    }
}