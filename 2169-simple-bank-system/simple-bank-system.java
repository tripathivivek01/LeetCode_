class Bank {
    private final long[] bal;
    private final int n;
    public Bank(long[] balance) {
        this.bal=balance;
        this.n=bal.length;
    }
    boolean isValid(int account) {
        return account>0 && account<=n;
    }
    public boolean transfer(int account1, int account2, long money) {
        if(!isValid(account1)|| !isValid(account2)||bal[account1-1]<money) return false;
        bal[account1-1]-=money;
        bal[account2-1]+=money;
        return true;
    }
    
    public boolean deposit(int account, long money) {
        if(!isValid(account)) return false;
        bal[account-1]+=money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if(!isValid(account) || bal[account-1]<money) return false;
        bal[account-1]-=money;
        return true;
    }
}
