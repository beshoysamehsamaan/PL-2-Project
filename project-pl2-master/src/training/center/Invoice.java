
package training.center;
import java.io.Serializable;
import java.util.ArrayList;

public class Invoice extends Informations implements Serializable {
    private float price;
    private boolean isPayed;
    final String InvoiceFileName = "Invoices.bin";
    public static ArrayList<Invoice> Invoices = new ArrayList<Invoice>();
    FileManagerBinary FManager =new FileManagerBinary();

    public Invoice(){}
    public Invoice(int Sid,int cid,String Sname,String Cname,float price)
    {
       super( Sid, cid, Sname, Cname);
        this.price = price; 
    }
    
    public void setPrice( float price){
        this.price=price;
    }
    public void setIsPayed( boolean isPayed){
         this.isPayed=  isPayed;
    }
    
    public float getPrice( float price){
        return this.price;
    }
    public boolean getIsPayed( boolean isPayed){
        return this.isPayed;
    }
   
    
    
    public boolean commitToFile(){
          return FManager.Write(InvoiceFileName,Invoices);
    }
    
    public void loadFromFile(){
          Invoices =(ArrayList<Invoice>)FManager.Read(InvoiceFileName);
    }
    
    public boolean AddInvoice(){
          loadFromFile();
          Invoices.add(this);
          return commitToFile();
    }
    
    public ArrayList<Invoice> List() {
            loadFromFile();
            return Invoices;
    }
    
   public int getindexInvoice(int sid, int cid){
       loadFromFile();
       for(int i=0; i<Invoices.size(); i++)
       {
            if (Invoices.get(i).getSid()== sid && Invoices.get(i).getCid()==cid) 
            { return i ;  }
       }
       return -1;
    }
    
    public  boolean Update() {
        loadFromFile();
        int index = getindexInvoice(this.getSid(),this.getCid());
        
        if (index != -1) {
            Invoices.set(index, this);

            return commitToFile();
        }

        return false;
    }     
    
    public boolean Delete(int sid,int cid) {
        loadFromFile();
        int index = getindexInvoice(sid,cid);

        if (index != -1) {
             Invoices.remove(index);
            return commitToFile();
        }
        return false;
    }
   
   public Invoice Search (int sid,int cid)
    {
        Invoice temp = new Invoice();
        loadFromFile();
        int index = getindexInvoice(sid,cid);
        if (index != -1) {
            return Invoices.get(index);
        } else {
            return temp;
        }
    }
   
   public ArrayList<Invoice> ShowStudent (int sid){
        loadFromFile();
        ArrayList<Invoice> returned = new ArrayList<Invoice>();
        for(int i=0; i<Invoices.size();i++){
            if (Invoices.get(i).getSid()== sid)
            {
                returned.add(Invoices.get(i));
            }
        }
        return returned;
        
    }
    
    
     
    
}
