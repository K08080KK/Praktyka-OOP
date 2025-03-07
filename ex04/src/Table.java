package ex04;

import ex02.KineticEnergy;
import ex03.ResultDisplay;
import java.util.List;

public class Table implements ResultDisplay {
    private String tableHeader;
    private String rowFormat;

    public Table(String tableHeader, String rowFormat) {
        this.tableHeader = tableHeader;
        this.rowFormat = rowFormat;
    }

    @Override
    public void displayResult(KineticEnergy energy) {
        // Виведення результату в таблицю для одного елементу
        String binaryEnergy = String.format("%s", Integer.toBinaryString((int) energy.getEnergy())); // Перетворюємо в двійковий формат
        System.out.printf(rowFormat, energy.getMass(), energy.getVelocity(), energy.getEnergy(), binaryEnergy);  // Виведення всіх значень
        System.out.println();
    }

    @Override
    public void display(List<KineticEnergy> results) {
        System.out.println(tableHeader);
        System.out.println("_______________________");

        // Форматуємо кожен рядок результатів у форматі таблиці
        for (KineticEnergy data : results) {
            displayResult(data);  // Викликаємо displayResult для кожного елементу
        }

        System.out.println("_______________________");
    }
}
