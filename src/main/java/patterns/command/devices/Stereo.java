package patterns.command.devices;

public class Stereo {
    public void on() {
        System.out.println("Stereo on");
    }

    public void off() {
        System.out.println("Stereo off");
    }

    public void setCD() {
        System.out.println("Stereo set CD");
    }

    public void setVolume(int volume) {
        System.out.println("Stereo set volume: " + volume);
    }
}
