package ex03;

import java.util.List;

import ex02.KineticEnergy;

public interface ResultDisplay {
    void display(List<KineticEnergy> results);
    void displayResult(KineticEnergy energy);
}