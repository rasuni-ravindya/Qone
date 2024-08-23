package Lights;

public interface Light {
    void on();
    void off();
    void dim(int level);

    int getBrightness();
}
