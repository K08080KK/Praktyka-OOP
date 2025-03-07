package ex03;

import ex02.KineticEnergy;
import ex03.TextResultDisplay;
public class KineticEnergyCalculatorFactory extends KineticEnergyFactory {
    @Override
    public KineticEnergy createKineticEnergy(double mass, double velocity) {
        return new KineticEnergy(mass, velocity);
    }

    @Override
    public ResultDisplay createResultDisplay() {
        return new TextResultDisplay();
    }
}
