
package tasit;

public class HavaTasiti extends Tasit{
    String Pname;
    public HavaTasiti(int tekerlek) {
        super(tekerlek);
        this.Pname=Pname;
    }

    @Override
    public void showInfos() {
        super.showInfos();
        System.out.println("Pilotun Ismi: "+this.Pname);
    }
    
    
    
    
}
