public interface Urafucasukaniki {
    void sound();

    
}

class Lion implements Urafucasukaniki {
   public void sound(){
        System.out.println("Garjana");
    }
}

public class Interfacing {
    public static void main(String[] args) {
        Lion obj = new Lion();
        obj.sound();
    }
}
