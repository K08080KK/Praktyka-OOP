package ex02;

import java.io.Serializable;

public class KineticEnergy implements Serializable {
    private static final long serialVersionUID = 1L;
    private double mass;        // маса
    private double velocity;     // швидкість
    private double energy;  // кінетична енергія (не буде пропущена під час серіалізації)

    public KineticEnergy() {
        this.mass = 0.0;
        this.velocity = 0.0;
        this.energy = 0.0;
    }

    public KineticEnergy(double mass, double velocity) {
        this.mass = mass;
        this.velocity = velocity;
        this.energy = calculateEnergy();
    }

    public double calculateEnergy() {
        return 0.5 * mass * velocity * velocity;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
        this.energy = calculateEnergy();
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
        this.energy = calculateEnergy();
    }

    public double getEnergy() {
        return energy;
    }

    public String getBinaryEnergy() {
        return Integer.toBinaryString((int) energy); // двійкове представлення енергії
    }

    @Override
    public String toString() {
        return "KineticEnergy [mass=" + mass + ", velocity=" + velocity + ", energy=" + energy + "]";
    }
}
