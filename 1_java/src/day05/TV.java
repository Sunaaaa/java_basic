package day05;

public class TV {

	private int channel = 0;
//	private String color;
	 String color;
	private int size = 0;
	private boolean power=false;
	
	public TV() {
		
	}

	public TV(String color, int channel, boolean power) {
		this.channel = channel;
		this.color = color;
		this.power = power;
	}
	
	public void power() {
		this.power = !power;
	}
	public void channelUp() {
		this.channel++;
	}
	public void channelDown() {
		this.channel--;
	}
	public void print(){
		System.out.printf("TV [ 전원 상태 :  %b, 현재 채널 : %d, 색상 정보 : %s ] %n", this.power, this.channel, this.color);
	}

}
