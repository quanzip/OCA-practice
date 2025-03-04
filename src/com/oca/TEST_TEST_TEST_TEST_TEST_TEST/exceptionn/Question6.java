package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.exceptionn;

public class Question6 {
    class LowBalanceException extends WithdrawalException{ //1
        public LowBalanceException(String msg){ super(msg);    }
    }

    class WithdrawalException extends RuntimeException{ //2
        public WithdrawalException(String msg){ super(msg);    }
    }

    double balance;
    public void withdraw(double amount) {
        try{
            throw new LowBalanceException("Not Implemented");
        }catch(WithdrawalException e){
            throw new RuntimeException(e.getMessage());
        }
    }
    public static void main(String[] args) {
        try{
            Question6 a = new Question6();
            a.withdraw(100.0);
        }catch(WithdrawalException e){
            //  Nếu  WithdrawalException ko phải là runtime Ex thì sẽ không được khai báo ở đây
            // vì method withdaw không có ex nào ở signature, nên không được khai báo ex nào cho nó như này

            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
