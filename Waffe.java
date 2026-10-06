public class Waffe {
    
    private String name;
    private String material;
    private int magie;
    
    public Waffe(String n, String m, int M){
        name=n;
        material = m;
        magie = M;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getMaterial() {
        return material;
    }


    public void setMaterial(String material) {
        this.material = material;
    }


    public int getMagie() {
        return magie;
    }


    public void setMagie(int magie) {
        this.magie = magie;
    }
    
    
}