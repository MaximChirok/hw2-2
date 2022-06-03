package ru.skypro;

public class Truck extends WheelableTransport implements Service {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Menyaem pokryshku");
    }

    public void checkEngine() {
        System.out.println("Proveryaem dvigatel");
    }

    public void checkTrailer() {
        System.out.println("Proveryaem pricep");
    }

    @Override
    public void check() {
        System.out.println("Obslujivaem " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }
    }
}
