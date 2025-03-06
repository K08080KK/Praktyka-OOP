package ex02.src;

import java.io.Serializable;

public class KineticEnergyCalculator implements Serializable {
    private double mass;
    private double velocity;
    private transient double energy;

    public KineticEnergyCalculator() {
        this.mass = 0.0;
        this.velocity = 0.0;
        this.energy = 0.0;
    }

    public KineticEnergyCalculator(double mass, double velocity) {
        this.mass = mass;
        this.velocity = velocity;
        this.energy = calculateEnergy();
    }

    private double calculateEnergy() {
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
        return Integer.toBinaryString((int) energy);
    }

    @Override
    public String toString() {
        return "KineticEnergy [mass=" + mass + ", velocity=" + velocity + ", energy=" + energy + "]";
    }

    public void setParameters(double d, double e) {
        throw new UnsupportedOperationException("Unimplemented method 'setParameters'");
    }
}