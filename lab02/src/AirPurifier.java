public class AirPurifier {
    String model;
    String serialNo;
    boolean power;

    void turnOn() { power = true; }
    void turnOff() { power = false; }


    AirPurifier(String _model,String _serialNo) {
        model = _model; serialNo = _serialNo;
    }
    static int modelCount;

}
