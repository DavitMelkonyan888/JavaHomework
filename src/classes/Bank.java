package classes;

public class Bank {
    String bankName;
    Address address;

    public Bank(String bankName, Address address) {
        this.bankName = bankName;
        this.address = address;
    }

    public static void main(String[] args) {
        Address address1 = new Address("Armenia", "Yerevan", "Yerevan", "Tumanyan", "8888");
        Bank bank1 = new Bank("Ameria Bank", address1);
    }
}
