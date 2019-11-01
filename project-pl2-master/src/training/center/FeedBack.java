
package training.center;

import java.io.Serializable;
import java.util.ArrayList;


public class FeedBack extends Informations implements Serializable{
    private String Feed;
    final private String FeedBackFileName ="FeedBacks.bin";
    public static ArrayList<FeedBack> FeedBacks=new ArrayList<FeedBack>();
    FileManagerBinary FManager=new FileManagerBinary();
    
  public FeedBack(){}
    public FeedBack(int Sid,int cid,String Sname,String Cname,String feed)
    {
         super( Sid, cid, Sname, Cname);
        this.Feed = feed; 
    }
    
    public void setFeed(String feed){
        this.Feed = feed ;
    }
    
     public String getFedd(){
         return this.Feed;
     }
     
      
    public boolean commitToFile(){
          return FManager.Write(FeedBackFileName,FeedBacks);
    }
    
    public void loadFromFile(){
          FeedBacks =(ArrayList<FeedBack>)FManager.Read(FeedBackFileName);
    }
    
    public boolean AddFeedBack(){
          loadFromFile();
          FeedBacks.add(this);
          return commitToFile();
    }
    
    public ArrayList<FeedBack> List() {
            loadFromFile();
            return FeedBacks;
    }
    
   public int getindexFeedBack(int sid, int cid){
       loadFromFile();
       for(int i=0; i<FeedBacks.size(); i++)
       {
            if (FeedBacks.get(i).getSid()== sid && FeedBacks.get(i).getCid()==cid) 
            { return i ;  }
       }
       return -1;
    }
    
    public  boolean Update() {
        loadFromFile();
        int index = getindexFeedBack(this.getSid(),this.getCid());
        
        if (index != -1) {
            FeedBacks.set(index, this);

            return commitToFile();
        }

        return false;
    }     
    
    public boolean Delete(int sid,int cid) {
        loadFromFile();
        int index = getindexFeedBack(sid,cid);

        if (index != -1) {
             FeedBacks.remove(index);
            return commitToFile();
        }
        return false;
    }
   
   public FeedBack Search (int sid,int cid)
    {
        FeedBack temp = new FeedBack();
        loadFromFile();
        int index = getindexFeedBack(sid,cid);
        if (index != -1) {
            return FeedBacks.get(index);
        } else {
            return temp;
        }
    }
   public ArrayList<FeedBack> ShowTutor (int cid){
        loadFromFile();
        ArrayList<FeedBack> returned = new ArrayList<FeedBack>();
        for(int i=0; i<FeedBacks.size();i++){
            if (
                    FeedBacks.get(i).getCid()== cid)
            {
                returned.add(FeedBacks.get(i));
            }
        }
        return returned;   
    }
   
     
     
     
     
     
}