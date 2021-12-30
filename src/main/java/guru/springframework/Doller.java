package guru.springframework;

public class Doller {
	int amount;
	
    public Doller(int amount) {
        this.amount = amount;
    }

    
    
    void times(int multiple) {
        amount = multiple*2;
    }

    
    
}
