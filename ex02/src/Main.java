package ex02;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        KineticEnergyCalculator calculator = new KineticEnergyCalculator();
        calculator.setParameters(10.0, 5.0); // Масса 10 кг, швидкість 5 м/с

        // Серіалізація
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("energy.ser"))) {
            oos.writeObject(calculator.getEnergy());
            System.out.println("Об'єкт збережено.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Десеріалізація
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("energy.ser"))) {
            KineticEnergy restoredEnergy = (KineticEnergy) ois.readObject();
            System.out.println("Об'єкт відновлено: " + restoredEnergy);
            System.out.println("Двійкове представлення енергії: " + restoredEnergy.getBinaryEnergy());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
