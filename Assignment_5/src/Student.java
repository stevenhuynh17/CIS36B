
public class Student {
	private int SID;
	private int scores[] = new int[5];
	
	//write public get and set methods for SID and scores
	public int getSID() {
		return SID;
	}
	public void setSID(int sID) {
		SID = sID;
	}
	public int[] getScores() {
		return scores;
	}
	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	//add methods to print values of instance variables
}
