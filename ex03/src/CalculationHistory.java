package ex03;

import ex02.KineticEnergy;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CalculationHistory {
    private List<KineticEnergy> history;

    public CalculationHistory() {
        history = new ArrayList<>();
    }

    public void addCalculation(KineticEnergy energy) {
        history.add(energy);
    }

    public List<KineticEnergy> getHistory() {
        return history;
    }

    public void saveHistory() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("history.ser"))) {
            oos.writeObject(history);
            System.out.println("History saved!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadHistory() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("history.ser"))) {
            history = (List<KineticEnergy>) ois.readObject();
            // Перевіряємо, чи потрібно перерахувати енергію для відновлених об'єктів
            for (KineticEnergy energy : history) {
                energy.calculateEnergy();
            }
            System.out.println("History loaded!");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
