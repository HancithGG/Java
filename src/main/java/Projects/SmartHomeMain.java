package Projects;
import java.util.*;
public class SmartHomeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        ControlLight oControlLight = new ControlLight();
        ControlFan oControlFan = new ControlFan();
        ControlAC oControlAC = new ControlAC();
        ControlCamera oControlCamera = new ControlCamera();

        ControlDevice oControlDevice = null;

        
        while (true) {
            System.out.println("\nSmart Home automation stimulator");
            System.out.println("-----------------------------------------------\n");
            System.out.println("Menu Selection: ");
            System.out.println("1. Control Light");
            System.out.println("2. Control Fan");
            System.out.println("3. Control AC");
            System.out.println("4. Control Camera");
            System.out.println("5. View Device Status");
            System.out.println("6. Exit\n");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if(choice == 6){
                break;
            }

            switch (choice) {
                case 1:{
                    
                    oControlLight.controlDevice("Light");
                    
                }

                    
                    break;
                case 2:{
                    
                    oControlFan.controlDevice("Fan");
                }
                break;
                
                case 3:{
                    oControlAC.controlDevice("AC");
                }
                break;
                case 4:{
                    oControlCamera.controlDevice("Camera");
                }
                break;
                case 5:{
                    System.out.println("\n-------------device Status-------------------\n");
                   oControlLight.getStatus("Light");
                   oControlFan.getStatus("Fan");
                   oControlAC.getStatus("AC");
                   oControlCamera.getStatus("Camera");
                   
                }
                break;
            
                default:{
                    System.out.println("error enter right choice");
                }
                    break;
            }
        }
    }
    
}


class ControlDevice{
    Scanner sc = new Scanner(System.in);

     String deviceName;
      boolean isOn ;   

     

    void controlDevice(String deviceName){
        this.deviceName = deviceName;
        while(true){

        System.out.println("\n-------------");
        System.out.println("1. Turn On");
        System.out.println("2. Turn Off");
        System.out.println("3. exit");
        System.out.print("\nselect an action: ");
        int choice = sc.nextInt();

        if(choice == 1 ){
            turnOn();
            break;
            
        }
        else if (choice == 2) {
            turnOff();
            break;
            
        }
        else if(choice == 3){
            
            break;
        }
        else{
            System.out.println("error enter right choice ");
            
        }

     }

    }

    void turnOn(){
        if(isOn != true){
            isOn = true;
            System.out.println("\nDevice is now On");
        }
        else{
            System.out.println("\ndevice has already been turned ON");
        }
    }
    void turnOff(){
        if(isOn != false){
            isOn = false;
            System.out.println("\nDevice is now Off");
        }
        else{
            System.out.println("\ndevice has already been turned off");
        }
    }
    void getStatus(String deviceName){
        this.deviceName = deviceName;
       String status;

        if(isOn == true){
            status = "On";
        }
        else{
            status = "Off";
        }
        
        System.out.println("Device name: "+deviceName+"\t"+"Status: "+status);
        
    }
}

class ControlLight extends ControlDevice{
     
        
     

    void turnOn(){
        if(isOn != true){
            isOn = true;
            System.out.println("\nLight is now On");
        }
        else{
            System.out.println("\nLight has already been turned ON");
        }
    }
    void turnOff(){
        if(isOn != false){
            isOn = false;
            System.out.println("\nLight is now Off");
        }
        else{
            System.out.println("\nLight has already been turned off");
        }
    }
    
}
class ControlFan extends ControlDevice{
    int fanspeed;
    void controlDevice(String deviceName){
        this.deviceName = deviceName;
        while(true){

        System.out.println("\n-------------");
        System.out.println("1. Turn On");
        System.out.println("2. Turn Off");
        System.out.println("3. Set speed");
        System.out.println("4. exit");
        System.out.print("\nselect an action: ");
        int choice = sc.nextInt();

        if(choice == 1 ){
            turnOn();
           break;
            
        }
        else if (choice == 2) {
            turnOff();
            break;
            
        }
        else if(choice == 3){
            setspeed();
           break;
        }
        else if(choice == 4){
            
            break;
        }
        else{
            System.out.println("error enter right choice ");
            
        }

     }

    }

    void turnOn(){
        if(isOn != true){
            isOn = true;
            System.out.println("\nFan is now On");
            fanspeed = 3; //default speed when started
        }
        else{
            System.out.println("\nFan has already been turned ON");
        }
    }
    void turnOff(){
        if(isOn != false){
            isOn = false;
            System.out.println("\nFan is now Off");
        }
        else{
            System.out.println("\nFan has already been turned off");
        }
    }
    void setspeed(){
        
        
        if(isOn == false){
            System.out.println("Fan is Off unable to set speed");
        }
        else{
            System.out.println(" 5-4-3-2-1 ");
            System.out.print("'press enter to increase speed' ");
            sc.nextLine();
            fanspeed = sc.nextInt();

            if(fanspeed == 1){
                System.out.println("\nfan speed : 1");
            }
            else if(fanspeed == 2){
                System.out.println("\nfan speed : 2");
            }
            else if(fanspeed == 3){
                System.out.println("\nfan speed : 3");
            }
            else if(fanspeed == 4){
                System.out.println("\nfan speed : 4");
            }
            else if(fanspeed == 5){
                System.out.println("\nfan speed : 5");
            }
            else{
                System.out.println("\nerror try again");
            }
        }
    }
    void getStatus(String deviceName){
        this.deviceName = deviceName;
       String status;

        if(isOn == true){
            status = "On";
            System.out.println("Device name: "+deviceName+"\t"+"Status: "+status+"\tSpeed: "+fanspeed);
        }
        else{
            status = "Off";
            System.out.println("Device name: "+deviceName+"\t"+"Status: "+status);
        }
        
        
        
    }
   
}
class ControlAC extends ControlDevice{
    int aCtemperature;
    void controlDevice(String deviceName){
        this.deviceName = deviceName;
        while(true){

        System.out.println("\n-------------");
        System.out.println("1. Turn On");
        System.out.println("2. Turn Off");
        System.out.println("3. Set Temperature");
        System.out.println("4. exit");
        System.out.print("\nselect an action: ");
        int choice = sc.nextInt();

        if(choice == 1 ){
            turnOn();
            break;
            
        }
        else if (choice == 2) {
            turnOff();
            break;
            
        }
        else if(choice == 3){
            setTemperature();
            break;
        }
        else if(choice == 4){
            
            break;
        }
        else{
            System.out.println("error enter right choice ");
            
        }

     }

    }

    void turnOn(){
        if(isOn != true){
            isOn = true;
            System.out.println("\nAC is now On");
            aCtemperature = 25; //default temperature when turned on
        }
        else{
            System.out.println("\nAC has already been turned ON");
        }
    }
    void turnOff(){
        if(isOn != false){
            isOn = false;
            System.out.println("\nAC is now Off");
        }
        else{
            System.out.println("\nAC has already been turned off");
        }
}
    void setTemperature(){
        if(isOn == false){
            System.out.println("\nAC is off unable to change temperature");
        }
        else{
            System.out.print("\nenter temperature in celsius in between (16-35): ");
            sc.nextLine();
            aCtemperature = sc.nextInt();
            if(aCtemperature <= 35 && aCtemperature >= 16){
                System.out.println("\n temperature setted to :"+aCtemperature);
            }
            else{
                System.out.println("can only set temperature in between 16 to 35 degrees celsius");
            }
        }
    }
     void getStatus(String deviceName){
        this.deviceName = deviceName;
       String status;

        if(isOn == true){
            status = "On";
            System.out.println("Device name: "+deviceName+"\t\t"+"Status: "+status+"\tTemperature: "+aCtemperature);
        }
        else{
            status = "Off";
            System.out.println("Device name: "+deviceName+"\t\t"+"Status: "+status);
        }
        
        
        
    }
   
}
class ControlCamera extends ControlDevice{

    void controlDevice(String deviceName){
        this.deviceName = deviceName;
        while(true){

        System.out.println("\n-------------");
        System.out.println("1. Turn On");
        System.out.println("2. Turn Off");
        System.out.println("3. Start Recording");
        System.out.println("4. Stop Recording");
        System.out.println("5. exit");
        System.out.print("\nselect an action: ");
        int choice = sc.nextInt();

        if(choice == 1 ){
            turnOn();
            break;
            
        }
        else if (choice == 2) {
            turnOff();
            break;
            
        }
        else if(choice == 3){
            startRecording();
            break;
        }
        else if(choice == 4){
            stopRecording();
            break;
        }
        else if(choice == 5){
            break;
        }
        else{
            System.out.println("error enter right choice ");
            
        }

     }

    }

    void turnOn(){
        if(isOn != true){
            isOn = true;
            System.out.println("\nCamera  is now On");
            
        }
        else{
            System.out.println("\nCamera has already been turned ON");
        }
    }
    void turnOff(){
        if(isOn != false){
            isOn = false;
            camRecording = false;
            System.out.println("\nCamera is now Off");
            System.out.println("Recording has  Stopped");

        }
        else{
            System.out.println("\nCamera has already been turned off");
        }
}
    boolean camRecording;
    void startRecording(){
        if(isOn == true && camRecording == false){
            camRecording = true;
            System.out.println("\nrecording has  started");
        }
        else if(isOn == true && camRecording == true){
            System.out.println("\nrecording is started already");
            
        }
        else{
            System.out.println("\nCamera is Off unable to perform any action");
        }
    }
    void stopRecording(){
        if(camRecording == false && isOn == false){
            System.out.println("\nCamera is Off unable to perform any action");
        }
        else if(camRecording == true && isOn == true){
            camRecording = false;
            System.out.println("\nrecoding has stopped");
        }
        else{
            System.out.println("\nrecoding had stopped already");
        }
    }

    void getStatus(String deviceName){
        this.deviceName = deviceName;
       String status;

        if(isOn == true){
            status = "On";
            System.out.println("Device name: "+deviceName+"\t"+"Status: "+status+"\tRecording : "+camRecording);
        }
        else{
            status = "Off";
            System.out.println("Device name: "+deviceName+"\t"+"Status: "+status);
        }
        
        
        
    }
 
}