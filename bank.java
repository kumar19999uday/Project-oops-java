package BankIng;

class Account {
    private String Number;
    private double Balance;
    private String Name;
    private String Email;
    private String MobNumber;

    // i created a constructor
    Account(String Number, double Balance, String Name, String Email, String MobNumber) {
        this.Number = Number;
        this.Balance = Balance;
        this.Name = Name;
        this.Email = Email;
        this.MobNumber = MobNumber;

    }

    // we creating a method for depositing money in balance and print how much
    // deposited then after print how much account balance
    public void DepositeMoney(double DepositeMoney) {
        this.Balance += DepositeMoney;
        System.out.println("Deposited money Succesful" + " " + DepositeMoney);
        System.out.println("Updated money - " + this.Balance);
    }

    // we creating a method for withdrow money in balance and print how much
    // withdrow money then after ans net amount balance
    public void WithdrowMoney(double WithdrowMoney) {
        if (this.Balance - WithdrowMoney < 0) {
            System.out.println("Insufficient balance" + " " + this.Balance + " "
                    + "net amount are currently present in your account .plase try again ...");
        } else {
            this.Balance -= WithdrowMoney;
            System.out.println("withdrowl money Succesful" + WithdrowMoney);
            System.out.println("Updated money - " + this.Balance);
        }
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public double getBalance() {
        return Balance;
    }

    public void setNumber(double balance) {
        Balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMobNumber() {
        return MobNumber;
    }

    public void setPhoneNumber(String mobNumber) {
        MobNumber = mobNumber;
    }
}

public class bank {
    public static void main(String[] args) {
        Account udayAccount = new Account("12345", 0.0, "uday", "kumar19999uday@gmail.com", "8709029815");
        udayAccount.DepositeMoney(10000);
        udayAccount.WithdrowMoney(20000);
    }
}
