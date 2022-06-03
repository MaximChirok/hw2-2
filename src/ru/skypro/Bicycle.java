package ru.skypro;

public class Bicycle extends WheelableTransport implements Service{

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Menyaem pokryshku");
    }

    @Override
    public void check() {
        System.out.println("Obslujivaem " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}
