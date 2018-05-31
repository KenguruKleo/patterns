package patterns.command.devices;

public class Light {
    String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("Light on in " + name);
    }

    public void off() {
        System.out.println("Light off in " + name);
    }
}
