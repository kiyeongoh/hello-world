package org.java.exception;

public class AccountExample {
	public static void main(String[] args){
		Account account = new Account();
		
		account.deposit(10000);
		System.out.println("¿¡±Ý¾× : " + account.getBalance());
		
		try{
			account.withdraw(3000);
		}catch(BalanceInsufficientException e){
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		}
	}

}
