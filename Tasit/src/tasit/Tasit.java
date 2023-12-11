
package tasit;

public class Tasit {
    public int tekerlek;
        
    public static void main(String[] args) {
        
        Otomobil o1 = new Otomobil(4,4,4,"Huseyin");
        o1.showInfos();
  
        
    }
    
    
    public Tasit(int tekerlek) {
        this.tekerlek = tekerlek;
    }
    
    public void showInfos(){
        System.out.println("Tekerlek Sayisi: "+this.tekerlek);
    }
    
    
}
