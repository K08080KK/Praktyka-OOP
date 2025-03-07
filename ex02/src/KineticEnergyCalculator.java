package ex02;

public class KineticEnergyCalculator {
    private KineticEnergy kineticEnergy;

    public KineticEnergyCalculator() {
        this.kineticEnergy = new KineticEnergy();
    }

    public void setParameters(double mass, double velocity) {
        kineticEnergy.setMass(mass);
        kineticEnergy.setVelocity(velocity);
    }

    public KineticEnergy getEnergy() {
        return kineticEnergy;
    }
}
