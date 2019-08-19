/** BankCredit.java
 * Adam Kolodko
 * 10/30/2017
 * */

public class BankCredit implements Runnable {
	private int balance;
	
	public BankCredit(int balance) {
		this.balance = balance;
	}
	public void run() {
		Thread activeThread = Thread.currentThread();
		System.out.println(activeTread.getName() + " wants access.");
		for(int i = 0; i < 2; i++) {
			credtAccount(10);
		}
		System.out.println(activeTread.getName() + " is done.");
	}
	public void creditAccount(int credit) {
		Thread activeThread = Thread.currentThread();
		
		System.out.println(activeThread.getName() + " opening creditAccount().");
		syncronized (this) {
			int temp = balance;
			System.out.println(activeThread.getName() + " about to deposit" + credit);
			balance = temp + credit;
		}
		System.out.println("Account balance is now: " + balance);
	}
    public static void main(String[] args) {

        // Create a Runnable object
        BankCredit tbc = new BankCredit(0);

        // Create two threads which share the same bank credit
        Thread th1 = new Thread(tbc, "John ");
        Thread th2 = new Thread(tbc, "Chan ");

        // Power up the threads via the start() method
        th1.start();
        th2.start();
    }
}