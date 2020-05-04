
public class TV_Control implements TV {
	private boolean power = false;
	private int channel = 0;
	private int channel_max = 100;
	public void channelUp() {
		this.channel += 1;
	}
	public void channelDown() {
		if(channel - 1 < 0) {
			this.channel = 100;
		}
		else {
			this.channel--;
		}
	}
	public void powerOnOff() {
		if(this.power == false) {this.power = true;}
		else {this.power = false;}
	}
	public int getCurrentChannel() {
		return this.channel;
	}
	public void goToChannel(int ch) {
		this.channel = ch;
	}
	public int getChannel() {
		return this.channel;
	}
}
