
package tasit;

public class Fayton extends MotorsuzKaraTasiti{
    public int kisiS;

    public Fayton(int kisiS, String guc, int tekerlek, String Sname) {
        super(guc, tekerlek, Sname);
        this.kisiS = kisiS;
    }

    @Override
    public void showInfos() {
        super.showInfos();
        System.out.println("Faytonun Kac Kisilik Oldugunu Giriniz: "+this.kisiS);
    
    
    }  
}
