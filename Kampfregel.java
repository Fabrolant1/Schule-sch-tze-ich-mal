import java.util.Scanner;

public class Kampfregel{
    
    
    
    public static final String Purple= "\u001B[35m";
    public static final String Black= "\u001B[0m";
    public static final String Green= "\u001B[32m";
    public static final String Red = "\u001B[31m";
    public String Monster = Red+"Monster" + Black;
    public String Held = Green+"Held" +Black;
    
    public Kampfregel(){

    }
    
    public void Kampf(Held k1, Monster k2){
        System.out.println();
        int neueLebenspunkte= k2.getLebenspunkte()- k1.getAngriffswert();
        k2.setLebenspunkte(neueLebenspunkte);
        System.out.println();
        System.out.println(Monster +": "+neueLebenspunkte);
        
        
        neueLebenspunkte= k1.getLebenspunkte()- k2.getAngriffswert();
        k1.setLebenspunkte(neueLebenspunkte);
        System.out.println(Held +": "+neueLebenspunkte);
        
        if(k2.getLebenspunkte()<=0){
            System.out.println(Held+ " ist Tod");
        }
        if(k1.getLebenspunkte()<=0){
            System.out.println(k1.getName() + " ist Tod");
        }
        
    }
    
    public void Kampfanfrage(Held k1, Monster k2){
        System.out.println("Das ist dein Gegner: Monster");
        System.out.println("Das ist dein Held: " + k1.getName());
        System.out.println();
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
            if(k1.getLebenspunkte()<=0 || k2.getLebenspunkte()<=0){
                return;
            }
        }

    }



 
}