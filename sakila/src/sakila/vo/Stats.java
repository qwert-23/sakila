package sakila.vo;

public class Stats {
	private	String day; 
	private long cnt;
	
	
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public long getCnt() {
		return cnt;
	}
	public void setCnt(long cnt) {
		this.cnt = cnt;
	}
	@Override
	public String toString() {
		return "stats [day=" + day + ", cnt=" + cnt + "]";
	}
	
}
