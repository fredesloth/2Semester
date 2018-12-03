package opgave1;

public class Indgang {
	
	volatile public int count = 0;
	volatile public int queueLast = 0; 

	
	public int drawCount() {
		queueLast++; 
		return queueLast; 
	}
	
	public void count() {
		count++; 
		System.out.println("Der er nu : " + count + " i køen");
	}
}
