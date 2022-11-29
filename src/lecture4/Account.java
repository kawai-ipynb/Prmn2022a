package lecture4;

public class Account {
    private String name;
    private String number;
    private long balance;

    public Account(String name,String number){
        this.name = name;
        this.number = number;
        this.balance = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getNumber(){
        return this.number;
    }

    public long getBalance(){
        return this.balance;
    }

    public void setBalance(long money) {
        this.balance = money;
    }

    public void print(){
        System.out.println("名前:" + name + " 口座番号:" + number + " 残高:" + balance + "円");
    }
}
