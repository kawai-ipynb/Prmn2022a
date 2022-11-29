package lecture4;

import java.util.ArrayList;
import java.util.List;

public class ATM {
    List<Account> accountList;
    private Account name;
    private Account number;
    private Account balance;

    ATM(){
        accountList = new ArrayList<>();
    };
    public void registerAccount(String name,String number){
        accountList.add(new Account(name,number));
        System.out.println("名前:" + name + "さんのアカウントを口座番号:" + number + "で登録しました");
    }
    public void print(){
        accountList.get(0).print();
    }
    public boolean existsAccount(String name,String number){
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getName().equals(name)){
                if (accountList.get(i).getNumber().equals(number)){
                    return true;
                }
            }
        }
        return false;
    }
    public void deposit(String number,long money){
        for (int i = 0; i < accountList.size(); i++) {
            if(accountList.get(i).getNumber().equals(number)){
                accountList.get(i).setBalance(money);
                System.out.println("口座番号:" + number + "　に　" + money + "円を入金しました");
            }
        }
    }
    public long withdraw(String number,long money){
        for (int i = 0; i< accountList.size(); i++) {
            if(accountList.get(i).getNumber().equals(number)){
                long balance = accountList.get(i).getBalance();
                if(money > balance){
                    System.out.println("口座番号:" + number + "　から" + money + "円引き出せませんでした");
                    return balance;
                }
                else {
                    balance = balance - money;
                    accountList.get(i).setBalance(balance);
                    System.out.println("口座番号:" + number + "　から" + money + "円引き出しました");
                    return balance;
                }
            }
        }
        System.out.println("口座番号が存在しません");
        return -1;
    }
}
