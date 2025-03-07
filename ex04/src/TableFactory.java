package ex04;
import ex03.KineticEnergyFactory;
import ex03.ResultDisplay;
import ex04.Table;
import ex02.KineticEnergy;


public class TableFactory extends KineticEnergyFactory {  
    private String tableHeader;
    private String rowFormat;

    public TableFactory(String tableHeader, String rowFormat) {
        this.tableHeader = tableHeader;
        this.rowFormat = rowFormat;
    }

    @Override
    public ResultDisplay createResultDisplay() {  
        return new Table(tableHeader, rowFormat);
    }

    @Override
    public KineticEnergy createKineticEnergy(double mass, double velocity) {
        return new KineticEnergy(mass, velocity);  // Потрібно реалізувати створення KineticEnergy
    }
}
