package chaptersCodes.chapterNine;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class synchronizationWithMoney {
    private static Account account = new Account();
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        // Create and launch a 100 threads
        for (int i = 0 ;i < 100 ; i++)
        {
            executor.execute(new addPennyToAccount());
        }
        executor.shutdown();
        // waits until the task finished
        while (!executor.isTerminated()) {
        }
        System.out.println("What is Balance ? " + account.getBalance());
    }
    // thread for adding a penny to the account
    private static class addPennyToAccount implements Runnable{
        public void run(){
            account.deposit(1);
        }
    }
    // iner class for account
    private static class Account{
        private int balance = 0;
        public int getBalance(){
            return balance;
        }
        public void deposit(int amount){
            int newBalance = balance  = amount;
            // this delay is delibaritely
            try{
                Thread.sleep(5);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance = newBalance;
        }
    }
}
