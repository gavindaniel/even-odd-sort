package model;

public class SortResults {

	private long even_odd_duration;
	private long merge_duration;
	
	public SortResults() {
		even_odd_duration = 0;
		merge_duration = 0;
	}
	
	public long getEvenOddDuration() {	return even_odd_duration;	}
	public void setEvenOddDuration(long d) {	even_odd_duration = d;	}
	public long getMergeDuration()	{	return merge_duration;	}
	public void setMergeDuration(long d) {	merge_duration = d;	}
}
