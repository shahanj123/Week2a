class BankEx{
	    String bank_id, bank_branch;
	    int bal;
	    BankEx(String i, String b){
	        bank_id =i;
	        bank_branch = b;
	    }
	    BankEx(String i, String b, int n){
	        bank_id = i;
	        bank_branch = b;
	        bal = n;
	    }
	    void show(){
	        System.out.println(bank_id+" "+bank_branch+" "+bal);
	    }
	    public static void main(String[] args) {
	        BankEx ob1 = new BankEx("Bill12", "First Bank");
	        BankEx ob2 = new BankEx("Steve13", "Second Bank", 300);
	        ob1.show();
	        ob2.show();
	    }
	}


