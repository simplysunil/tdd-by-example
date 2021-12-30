package guru.springframework;

import java.util.Objects;

public class Doller {
	private int amount;
	
    public Doller(int amount) {
        this.amount = amount;
    }
    
    Doller times(int multiple) {
        //amount = amount*multiple;
    	return new Doller(amount*multiple);
    	
    }

	@Override
	public int hashCode() {
		return Objects.hash(amount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doller other = (Doller) obj;
		return amount == other.amount;
	}

	/*
	public boolean equals(Object obj) {
		//return true;
		Doller doller = (Doller) obj;
		return amount == doller.amount;
	}
	*/
    
    
    
}
