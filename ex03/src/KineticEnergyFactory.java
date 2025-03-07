package ex03;

import ex02.KineticEnergy;

public abstract class KineticEnergyFactory {
    public abstract KineticEnergy createKineticEnergy(double mass, double velocity);
    public abstract ResultDisplay createResultDisplay();
}
