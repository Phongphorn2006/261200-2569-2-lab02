import java.util.*;

public class Main {
    void main(){
        AirPurifier AirX1 = new AirPurifier(
                "AirX1",
                "0000",
                0,
                0,
                0,
                0
        );


        AirPurifier ap1 = new AirPurifier(
                "Air01",
                "0001",
                10,
                30,
                27,
                72
        );

        AirPurifier ap2 = new AirPurifier(
                "Air02",
                "0002",
                80,
                50,
                32,
                50
        );


        IO.println("--- Air purifier 1 ---");
        ap1.getStatus();
        IO.println("setting...");
        ap1.setFanSpeed(100);
        ap1.setAirQuality(70);
        ap1.setHumid(25);
        ap1.setTemperature(23);
        ap1.turnOn();
        ap1.getStatus();
        IO.println();

        IO.println("--- Air purifier 2 ---");
        ap2.getStatus();
        IO.println();

        IO.println("--- Air purifier INFO ---");
        AirPurifier.SetMostPopularModel(AirX1);
        AirPurifier.getMostPopularModel();
        AirPurifier.getModelCount();
    }
}
