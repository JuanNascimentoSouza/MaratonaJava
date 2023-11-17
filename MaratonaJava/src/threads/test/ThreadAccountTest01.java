package threads.test;

import threads.dominio.Account;

public final class ThreadAccountTest01 implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01 , "Hestia");
        Thread t2 = new Thread(threadAccountTest01 , "Juan");

        t1.start();
        t2.start();
    }


    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
         withdrawal(10);
         if (account.getBalance() < 0){
             System.out.println("Deu ruim");
         }
        }
    }


    private Account account = new Account();


    private  void withdrawal(int amount) {
        System.out.println(getThreadName() + " #### fora do synchronized ");
        synchronized(account) {
            System.out.println(getThreadName() + " **** dentro do synchronized");
        }
        if(account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " **** está indo sacar o dinheiro ");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " Completou o saque, valor atual da conta " + account.getBalance());
        }else{
            System.out.println("Sem dinheiro para " + Thread.currentThread().getName()+ " efetuar o saque " + account.getBalance());
        }
    }
    private String getThreadName() {
        return Thread.currentThread().getName();
    }

}

