package ex04;

import ex02.KineticEnergy;
import ex03.ResultDisplay;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Крок 1: Створення об'єкта фабрики для таблиці
        String tableHeader = "Mass | Velocity | Energy | Binary Energy";
        String rowFormat = "%-10.2f %-10.2f %-10.2f %-10s"; // Формат рядка таблиці
        TableFactory factory = new TableFactory(tableHeader, rowFormat);

        // Крок 2: Створення об'єкта для відображення результатів
        ResultDisplay resultDisplay = factory.createResultDisplay();

        // Крок 3: Створення та додавання кількох об'єктів кінетичної енергії
        KineticEnergy energy1 = new KineticEnergy(10.0, 5.0);
        KineticEnergy energy2 = new KineticEnergy(20.0, 3.0);
        KineticEnergy energy3 = new KineticEnergy(15.0, 7.0);

        List<KineticEnergy> energies = new ArrayList<>();
        energies.add(energy1);
        energies.add(energy2);
        energies.add(energy3);

        // Крок 4: Виведення результатів за допомогою фабрики та відображення в таблиці
        resultDisplay.display(energies);

        // Додатково, можна протестувати метод для виведення одного об'єкта
        System.out.println("\nDisplaying single result:");
        resultDisplay.displayResult(energy1);  // Виведення одного об'єкта кінетичної енергії
    }
}
