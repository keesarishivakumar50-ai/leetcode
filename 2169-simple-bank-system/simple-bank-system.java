class Bank {
    private long[] balance;
    private int n;

    public Bank(long[] balance) {
        this.balance=balance;
        this.n=balance.length;        
    }
    
    public boolean transfer(int account1, int account2, long money) {
        account1--;account2--;
        if(0<=account1 && account1<n && 0<=account2 && account2<n){
            if(balance[account1]<money) return false;
            balance[account1] -=money;
            balance[account2] +=money;
            return true;
        }
        else return false;
    }
    
    public boolean deposit(int account, long money) {
        account--;
        if(account<n && 0<=account){
            balance[account] +=money;
            return true;
        }
        else return false;
    }
    
    public boolean withdraw(int account, long money) {
        account--;
        if(account<n && 0<=account){
            if(balance[account]<money) return false;
            balance[account] -=money;
            return true;
        }
        else return false;
    }
}

