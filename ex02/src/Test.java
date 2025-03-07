package ex02;

public class Test {

    public static void main(String[] args) {
        // Тест 1: Перевірка розрахунку кінетичної енергії|| java -cp out ex02.Test 
        KineticEnergy energy = new KineticEnergy(10.0, 5.0); // маса 10 кг, швидкість 5 м/с
        double expectedEnergy = 0.5 * 10 * 5 * 5; // Очікувана енергія
        assert Math.abs(energy.getEnergy() - expectedEnergy) < 1e-6 : "Test failed!";
        
        System.out.println("Test passed!");
    }
}
