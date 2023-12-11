
package tasit;


public class DenizTasiti extends Tasit{
    String Kname;
    public DenizTasiti(int tekerlek,String Kname) {
        super(tekerlek);
        this.Kname=Kname;
    }

    @Override
    public void showInfos() {
        super.showInfos(); 
        System.out.println("Kaptanin Ismi: "+this.Kname);
    }
    
    
    
    
    
}
