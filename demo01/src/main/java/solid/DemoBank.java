package solid;

public class DemoBank {
    public static void main(String[] args) {
        TransferMoneyProcess localBankAccount = new LocalBankAccount();
        localBankAccount.transferMoney(1000);

        TransferMoneyProcess internalBankAccount = new InternalBankAccount();
        internalBankAccount.transferMoney(1000);
    }
}

interface TransferMoneyProcess {
    void transferMoney(int amount);
}

class LocalBankAccount implements  TransferMoneyProcess{
    public void transferMoney(int amount) {
        System.out.println("Transfer money in Thailand only");
        // TODO
    }
}

class InternalBankAccount implements TransferMoneyProcess {
    public void transferMoney(int amount) {
        System.out.println("Transfer money (International)");
        // TODO
    }
}