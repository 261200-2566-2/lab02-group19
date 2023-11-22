// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Constructor Test");
        AirPurifier f1 = new AirPurifier("Pro","001","White");
        AirPurifier.GiveInfo(f1);
        AirPurifier f2 = new AirPurifier("002");
        AirPurifier.GiveInfo(f2);
        AirPurifier f3 = new AirPurifier("003");
        AirPurifier.GetNumOfPurifier();
        AirPurifier f4 = new AirPurifier("004");
        AirPurifier f5 = new AirPurifier("Pro","005","Black");
        AirPurifier.GiveInfo(f3);
        AirPurifier.GiveInfo(f4);
        AirPurifier.GiveInfo(f5);
        AirPurifier.GetNumOfPurifier();

        System.out.println("\nCase 1 : Button Off");
        AirPurifier.GiveStatus(f1);
        f1.SetFanSpeed(999);
        f1.SetFanSpeed(-2);

        System.out.println("\nCase 2 : Set Fan Speed");
        f1.TurnSwitch();
        AirPurifier.GiveStatus(f1);
        f1.SetFanSpeed(999);
        f1.SetFanSpeed(-2);
        f1.SetFanSpeed(46);
        AirPurifier.GiveStatus(f1);
        f1.SetFanSpeed(100);
        AirPurifier.GiveStatus(f1);

        System.out.println("\nCase 3 : Relax Mode");
        f1.SetRelaxMode();
        AirPurifier.GiveStatus(f1);

        System.out.println("\nCase 4 : Button Off & Relax Mode");
        f1.TurnSwitch();
        AirPurifier.GiveStatus(f1);
        f1.SetRelaxMode();
    }
}