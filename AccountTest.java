public class AccountTest {
    
    public static void main(String[] args) {
        Account Acc = new Account();
        Acc.add(1000);
        Acc.debit(500);
        Acc.currBalance();     // 500
        Acc.debit(501);   
        Acc.debit(500);   
    }

    public static class Account {
        private int balance;

        public Account() {
            balance = 0;
        }

        public void debit(int amount) {
            if (balance < amount)
                System.out.println("Debit Amount Exceeded the Balance");
            else {
                balance -= amount;
                System.out.println(amount + " is successfully debited");
            }
        }

        public void add(int amount) {
            balance += amount;
        }

        public int currBalance() {
            return balance;
        }
    }
}