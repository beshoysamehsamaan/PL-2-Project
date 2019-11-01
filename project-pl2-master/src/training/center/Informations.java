/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.center;

/**
 *
 * @author Andrew
 */
public class Informations {
    protected int Sid,Cid;
    protected String Sname;
    protected String Cname;
    
    public Informations(int Sid,int Cid,String Sname,String Cname){
        this.Sid=Sid;
        this.Cid=Cid;
        this.Sname=Sname;
        this.Cname=Sname;
    }
    public Informations(){
        
    }
    public  void setSid(int Sid){
        this.Sid=Sid;
    }
    public void setCid(int Cid){
        this.Cid=Cid;
    }
    public void setSname(String Sname){
        this.Sname=Sname; 
   }
    public void setCname(String Cname){
        this.Cname=Cname;
    }
    public int getSid(){
        return this.Sid;
    }
    public int getCid(){
        return this.Cid;
    }
    public String getSname(){
        return this.Sname; 
   }
    public String getCname(){
        return this.Cname;
    }
}
