package lecture4;
public class Exercise42 {
    public static void main(String[] args) {
        ATM atm = new ATM();

        String name = "藤井";
        String number = "12345";
        if (atm.existsAccount(name,number)) {
            System.out.println("名前:" + name + " 口座番号" + number + "は存在します");
        }
        else {
            System.out.println("名前:" + name + " 口座番号" + number + "は存在しません");
        }
        atm.registerAccount(name,number);
        if (atm.existsAccount(name,number)) {
            System.out.println("名前:" + name + " 口座番号" + number + "は存在します");
        }
        else {
            System.out.println("名前:" + name + " 口座番号" + number + "は存在しません");
        }
        String num1 = "12345";
        long mon1 = 1000;
        atm.deposit(num1,mon1);

        String num2 = "12345";
        long mon2 = 2000;
        long z = atm.withdraw(num2,mon2);
        if(z >= 0) {
            System.out.println("残高:" + z + "円です");
        }


        String num3 = "12345";
        long mon3 = 500;
        z = atm.withdraw(num3,mon3);
        if(z >= 0){
            System.out.println("残高:" + z + "円です");
        }
    }
}
