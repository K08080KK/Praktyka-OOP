package ex03;

import ex02.KineticEnergy;

public class TextResultDisplay implements ResultDisplay {
    @Override
    public void displayResult(KineticEnergy energy) {
        System.out.println("Mass: " + energy.getMass() + " kg");
        System.out.println("Velocity: " + energy.getVelocity() + " m/s");
        System.out.println("Energy: " + energy.getEnergy() + " J");
        System.out.println("Binary Energy: " + energy.getBinaryEnergy());
    }
}
