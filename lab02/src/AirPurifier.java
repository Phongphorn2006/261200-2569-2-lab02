public class AirPurifier {
    //instance variable
    String model;
    String serialNo;
    boolean power;
    int airQuality;
    int fanSpeed;
    int temperature;
    int humid;

    //constructor
    AirPurifier(
            String model,
            String serialNo,
            int airQuality,
            int fanSpeed,
            int temperature,
            int humid
    ){
        this.model = model;
        this.serialNo = serialNo;
        this.airQuality = airQuality;
        this.fanSpeed = fanSpeed;
        this.temperature = temperature;
        this.humid = humid;
        this.power = false;
        modelCount++;
    }

    //instance methods
    void turnOn() { power = true; }
    void turnOff() { power = false; }

    String getModel() { return this.model;}

    boolean getPower(){
        return this.power;
    }
    String getSerialNo(){
        return this.serialNo;
    }
    String getAirQuality(){
        String airQuality;
        if (this.airQuality > 50){
            airQuality = "(good)";
        }else airQuality = "(bad)";
        return this.airQuality + airQuality;
    }
    int getFanSpeed() {
        return this.fanSpeed;
    }

    int getHumid() {
        return this.humid;
    }

    void getStatus(){
        IO.println( "model : " + getModel() +
                ", getSerialNo : " + getSerialNo() +
                ", power : " + getPower() +
                ", fan speed : " + getFanSpeed() +
                ", airQuality : " + getAirQuality() +
                ", temperature : " + getTemperature() +
                ", humid : " + getHumid());
    }
    int getTemperature(){
        return this.temperature;
    }

    void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    void setAirQuality(int airQuality) {
        this.airQuality = airQuality;
    }
    void setHumid(int humid) {
        this.humid = humid;
    }
    void setFanSpeed(int fanSpeed) {
        this.fanSpeed = fanSpeed;
    }

    //class variables
    static int modelCount = 0;
    static AirPurifier popModel;

    //class methods
    static void SetMostPopularModel(AirPurifier model){
        popModel = model;
        IO.println("set the most popular model : " + model.model);
    }
    static void getMostPopularModel(){
        IO.println("most popular model : " + popModel.model);
    }

    static void getModelCount(){
        IO.println("model count : " + modelCount);
    }


}
