

import java.util.Scanner;


public class Held {
    
    private String name;
    private int staerke;
    private int angriffswert;
    private int lebenspunkte;
    private Waffe [] Waffenlager;

    
    public Held(String n, int s, int aw, int lp){
        name=n;
        staerke=s;
        angriffswert=aw;
        lebenspunkte=lp;
    }
    
    public void ersteWaffe(Waffe neueWaffe){
        Waffe [] Waffenlagerkopie  =  new Waffe [1] ;
        for (int i = 0; i< 1; i++){
            Waffenlagerkopie [i] = Waffenlager [i];
        }
        Waffenlagerkopie [1] = neueWaffe;
        Waffenlager = Waffenlagerkopie;
    }

    public void neueWaffe(Waffe neueWaffe){
        int Länge = Waffenlager.length;
        Waffe [] Waffenlagerkopie  =  new Waffe [Länge+1] ;
        for (int i = 0; i< Länge; i++){
            Waffenlagerkopie [i] = Waffenlager [i];
        }
        Waffenlagerkopie [Länge] = neueWaffe;
        Waffenlager = Waffenlagerkopie;
    }
    
    public void Waffenlager(){
        int Länge = Waffenlager.length;
        for (int i = 0; i< Länge; i++){
             System.out.println(i + ": " + Waffenlager [i].getName()+ ", " + Waffenlager [i].getMaterial() + ", " + Waffenlager [i].getMagie());
        }
    }
    
    
    public Waffe Waffenauswahl(){
        Scanner input = new Scanner(System.in);
        Waffenlager();
        System.out.println("WELCHE WAFFE WOLLEN SIE GNÄDIGER HERR HABEN?");
        System.out.println("(Nummer eingeben)");
        int i= input.nextInt();
        return Waffenlager[i];
    }
    
    
    public int getAngriffswert() {
        Waffe ausgerüsteteWaffe = Waffenauswahl();
        int angriffswert2 = angriffswert + ausgerüsteteWaffe.getMagie();
        return angriffswert2;
    }

   
    public void setAngriffswert(int angriffswert) {
        this.angriffswert = angriffswert;
    }

   
    public int getLebenspunkte() {
        return lebenspunkte;
    }

    
    public void setLebenspunkte(int lebenspunkte) {
        this.lebenspunkte = lebenspunkte;
    }
    
    
    
}