package ex03;

import ex02.KineticEnergy;

public class Test {
    public static void main(String[] args) {
        // Крок 1: Створення об'єкта фабрики
        KineticEnergyFactory factory = new KineticEnergyCalculatorFactory();

        // Крок 2: Створення кінетичної енергії через фабрику
        double mass = 10.0;
        double velocity = 5.0;
        KineticEnergy energy = factory.createKineticEnergy(mass, velocity);

        // Крок 3: Створення об'єкта для відображення результатів
        ResultDisplay resultDisplay = factory.createResultDisplay();

        // Крок 4: Виведення результатів
        resultDisplay.displayResult(energy);

        // Крок 5: Створення і використання об'єкта для збереження історії обчислень
        CalculationHistory history = new CalculationHistory();
        history.addCalculation(energy);

        // Збереження історії
        history.saveHistory();

        // Відновлення історії
        CalculationHistory restoredHistory = new CalculationHistory();
        restoredHistory.loadHistory();

        // Виведення відновленої історії
        System.out.println("Restored History:");
        for (KineticEnergy restoredEnergy : restoredHistory.getHistory()) {
            resultDisplay.displayResult(restoredEnergy);
        }
    }
}
