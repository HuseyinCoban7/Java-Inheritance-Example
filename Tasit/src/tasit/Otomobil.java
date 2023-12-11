
package tasit;


public class Otomobil extends MotorluKaraTasiti{
    
    public int door;

    public Otomobil(int door, int silindir, int tekerlek, String Sname) {
        super(silindir, tekerlek, Sname);
        this.door = door;
    }

    @Override
    public void showInfos() {
        super.showInfos();
        System.out.println("Kapi Sayisini Giriniz: "+this.door);
    }
    
    
    
    
    
    
}
