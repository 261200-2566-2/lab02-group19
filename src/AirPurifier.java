/*This AirPurifier class contains:
1. Instance variables: model, serialNo. and color (String), fanspeed (int), button (boolean)
2. Instance methods: TurnSwitch, SetFanSpeed, SetRelaxMode (void)
3. Class variables: counter (int)
4. Class Methods: GiveInfo,GiveStatus, GetNumOfPurifier (void)

In each of method, we plan like this...

Instance Methods:
-TurnSwitch: void method, use to turn on-off the button of purifier. If the button is false, it doesn't work.
If it's true, start fan speed with 10.
-SetFanSpeed: void method, put input as int between 0-100. use to change fan speed. remember, you should turn on
your purifier first.
-SetRelaxMode: void method, set fan speed to 20 automatically

Class Methods:
-GiveInfo: void method, put input as AirPurifier object, use to show information about it.(model,serialNo,color)
-GiveStatus: void method, put input as AirPurifier object, use to show status of its work.(button, fanspeed)
-GetNumOfPurifier: void method, use to show numbers of the purifiers which was declared
*/
public class AirPurifier {
    String model;
    String serialNo;
    String color;
    int fanspeed = 0;
    boolean button = false;
    static int counter = 0;

    AirPurifier(String model, String serialNo, String color){
        this.model = model;
        this.serialNo = serialNo;
        this.color = color;
        counter++;
    }

    AirPurifier(String serialNo){
        this("Pro CPE Edition", serialNo, "Turquoise");
    }

    public void TurnSwitch(){
        button = !button;
        if(button) {
            fanspeed = 10;
            System.out.println("Purifier turn on");
        }
        else {
            fanspeed = 0;
            System.out.println("Purifier turn off");
        }
    }

    public void SetFanSpeed(int i){
        if(!button) System.out.println("Turn on the purifier first!!!");
        else if(i<0 || i>100) {
            System.out.println("The speed can only be between 0 and 100, try again!");
        }else{
            fanspeed = i;
            System.out.println("Set fan speed to " + fanspeed);
        }
    }
    public void SetRelaxMode(){
        this.SetFanSpeed(20);
        if(fanspeed == 20) System.out.println("Set to Relax Mode");
    }

    public static void GiveInfo(AirPurifier f){
        System.out.println("********************");
        System.out.println("Model: " + f.model);
        System.out.println("SerialNo.: " + f.serialNo);
        System.out.println("Color: " + f.color);
        System.out.println("********************");
    }

    public static void GiveStatus(AirPurifier f){
        System.out.println("********************");
        System.out.println("The status of this purifier");
        System.out.println("Button: " + f.button + "\nFanspeed: " + f.fanspeed);
        System.out.println("********************");
    }

    public static void GetNumOfPurifier(){
        System.out.println("\nNow we have " + counter + " purifiers which had been manufactured.\n");
    }

}
