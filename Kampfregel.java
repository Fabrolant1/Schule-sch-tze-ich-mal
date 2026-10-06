import java.util.Scanner;

public class Kampfregel extends Rollenspiel {
    
    
    private wuerfel wuerfel6;
    private wuerfel wuerfel10;
    public static final String purple= "\003[35m";
    public static final String Black= "\003[0m";
    
    
    public Kampfregel(wuerfel s, wuerfel z){
        wuerfel6  = s;
        wuerfel10 = z;
    }
    
    public void Kampf(Held k1, Monster k2){
        
        int neueLebenspunkte= k2.getLebenspunkte()- k1.getAngriffswert();
        k2.setLebenspunkte(neueLebenspunkte);
        
        
        
        neueLebenspunkte= k1.getLebenspunkte()- k2.getAngriffswert();
        k1.setLebenspunkte(neueLebenspunkte);
        
        
        
    }
    
    public void Kampfanfrage(Held k1, Monster k2){
        System.out.println("Das ist dein Gegner:");
        System.out.println("Das ist dein Held:");
        Scanner input = new Scanner(System.in);
        System.out.println("Wollen Sie gegen ihn kämpfen?");
        System.out.println("(0 für nein, 1 für ja)");
        int i= input.nextInt();
        if(i==1){
            fortlaufenderKampf(k1, k2);
        }else{
            System.out.println("okay, dann nicht");
        }
    }
    public void fortlaufenderKampf(Held k1, Monster k2){
        for(int i=k1.getLebenspunkte()+k2.getLebenspunkte(); i>0; i--){
            Kampf(k1, k2);
            if(k1.getLebenspunkte()<0 || k2.getLebenspunkte()<0){
                return;
            }
        }

    }




}