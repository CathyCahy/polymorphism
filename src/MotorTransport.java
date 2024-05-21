public abstract class MotorTransport extends Transport{
    public MotorTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkTransport() {
        super.checkTransport();
        checkEngine();
    }
}
