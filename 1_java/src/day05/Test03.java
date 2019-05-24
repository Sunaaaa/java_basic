package day05;

public class Test03 {
	public static void main(String[] args) {
		Time t1 = new Time();
		t1.setHour(20);
		t1.setSecond(35);
		t1.print();
	}
}

class Time {
	private int hour;
	private int second;
	private boolean am;

	public boolean isAm() {
		return hour < 12 ;
	}

	public void setAm(boolean am) {
		this.am = am;
	}

	public void setHour(int h) {
		if ((h >= 0 && h <= 23)) {
			this.hour = h;
		}
	}

	public void setSecond(int s) {
		if ((s >= 0 && s <= 59)) {
			this.second = s;
		}
	}

	public int getHour() {
		return this.hour;
	}

	public int getSecond() {
		return this.second;
	}

	public void print() {
		System.out.printf("%2d시 %2d분", hour, second);
	}
}
