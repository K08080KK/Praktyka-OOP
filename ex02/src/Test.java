package ex02.src;

import java.io.*;

public class Test {
    public void testEnergyCalculation() {
        KineticEnergy energy = new KineticEnergy(10.0, 5.0);
        assertEquals(125.0, energy.getEnergy(), 0.001); 
            }
        
            private void assertEquals(double d, double energy, double e) {
                throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
            }
        
            @Test
    public void testSerialization() {
        KineticEnergy energy = new KineticEnergy(10.0, 5.0);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.ser"))) {
            oos.writeObject(energy);
        } catch (IOException e) {
            fail("Помилка серіалізації: " + e.getMessage());
                    }
            
                    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.ser"))) {
                        KineticEnergy restoredEnergy = (KineticEnergy) ois.readObject();
                        assertEquals(energy.getMass(), restoredEnergy.getMass(), 0.001);
                        assertEquals(energy.getVelocity(), restoredEnergy.getVelocity(), 0.001);
                        assertEquals(0.0, restoredEnergy.getEnergy(), 0.001); 
                    } catch (IOException | ClassNotFoundException e) {
                        fail("Помилка десеріалізації: " + e.getMessage());
                    }
                }
            
                        private void fail(String string) {
                            throw new UnsupportedOperationException("Unimplemented method 'fail'");
                        }
}
