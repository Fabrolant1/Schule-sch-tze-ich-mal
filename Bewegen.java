import java.util.Scanner;

public class Bewegen {

    private String[] Bewegung = {
        "Norden",
        "Osten",
        "Süden",
        "Westen",
        "oben"
    };
    private wuerfel wuerfel6;
    private wuerfel wuerfel10;

    public Bewegen(wuerfel s, wuerfel z){
        wuerfel6  = s;
        wuerfel10 = z;
    }

    public void Schritt_anfrage(){
        System.out.println("Wohin wollen Sie gehen?");
        for (int i=0; i<Bewegung.length; i++){
            System.out.println(i + Bewegung[i]);
        }
        System.out.println("(Nummer eingeben)");
        
    }
    public String Schrittauswahl(){
        Scanner input = new Scanner(System.in);
        int i= input.nextInt();
        if(i<Bewegung.length){
            return Bewegung[i];
        }
        else{
            System.out.println("Das kannst du noch nicht");
            return null;
        } 

    }




}
