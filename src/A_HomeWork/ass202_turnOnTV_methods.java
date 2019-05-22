package A_HomeWork;

public class ass202_turnOnTV_methods {
	public class TV {
		int channel = 1;
		int volumeLevel = 1;
		boolean on;
		String brand = "undefined";

		public TV() {
			System.out.println("Creating TV object using no Args- constructor");
		}

		public TV(String brand) {
			System.out.println("Creating TV object using 1 arg- constructor");
			this.brand = brand;
		}

		public int getChannel() {
			return channel;
		}

		public void setChannel(int channel) {
			if (channel >= 1 && channel <= 120) {
				this.channel = channel;
			} else {
				System.out.println("ERROR: TV is either OFF or invalid Channel");
			}
		}

		public int getVolumeLevel() {
			return volumeLevel;
		}

		public void setVolumeLevel(int volumeLevel) {
			if (volumeLevel > 0 && volumeLevel < 8) {
				this.volumeLevel = volumeLevel;
			} else {
				System.out.println("ERROR: TV is either OFF or invalid Volume level");
			}
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public int channelUp() {
			return channel += 1;
		}

		public int channelDown() {
			return channel -= 1;
		}

		public int volumeUp() {
			return volumeLevel += 1;
		}

		public int volumeDown() {
			return volumeLevel -= 1;
		}

		public boolean isOn() {
			if (on == true) {
				return true;
			}
			return false;
		}

		public boolean turnOn() {
			if (on == false) {
				return on == true;
			} else {
				System.out.println("TV is already ON");
				return false;
			}
		}

		public boolean turnOff() {
			if (on == true) {
				return on == true;
			} else {
				System.out.println("TV is already OFF");
				return false;
			}
		}

	}
}
