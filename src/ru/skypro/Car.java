package ru.skypro;

public class Car extends WheelableTransport implements Service {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Menyaem pokryshku");
    }

    public void checkEngine() {
        System.out.println("Proveryaem dvigatel");
    }

    @Override
    public void check() {
        System.out.println("Obslujivaem " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }
}
