public class wuerfel {
    
    
    private int anzahlSeiten;
    
    
    public wuerfel(int aS){
        anzahlSeiten = aS;
    }
    
    public int wuerfeln(){
        int Ergebnis = (int) (Math.random()*anzahlSeiten+1);
        
        
        return Ergebnis;
    }
    
    
}
