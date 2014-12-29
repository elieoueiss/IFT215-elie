package taxescalculation;


public class code {
    private String yearlysalary ;
    private int Nbkids ;
    private boolean married ;
    private String Amount ;
     private int abatement;
    private static final String companyName="LCU taxes calculation";
   
    
     public code (String yearlysalary, int Nbkids, 
            boolean married, String Amount){
        this.yearlysalary=yearlysalary;
        this.Nbkids=Nbkids;
        this.married=married;
        this.Amount=Amount ;
}
    public String getyearlysalary(){
        return yearlysalary;
    }
    
    public void setyearlysalary(String yearlysalary){
        this.yearlysalary=yearlysalary;
    }
   
   
    public int getNbkids(){
        return Nbkids ;
    }
    
    public void setNbkids(int Nbkids){
        this.Nbkids=Nbkids;
    }
    public boolean hasmarried(){
        return married;
    }
    
    public void setmarried(boolean married){
        this.married=married;
    }
   
    
   public int getAmount(){
        int  marriedabatement = 0 , kidsabatement = 0, tax ;
        int initialabatement=7500000;
              
       
        if(married==true){
           marriedabatement=2500000;
                    }
       
        if(Nbkids>=1){
            kidsabatement=500000*Nbkids;            
        }
         abatement= marriedabatement+kidsabatement+initialabatement;
        return 0;

     Amount=yearlysalary-abatement;
    if(Amount>=0){
        tax=2;
    }
    if(Amount>=6000001){
        tax=4;
    }
    if(Amount>=15000001){
        tax=7;
    }
    if(Amount>=30000000){
        tax=11;
    }
    if(Amount>=60000000){
        tax=15;
    }
    if(Amount>=120000000){
        tax=20;
    }
    Amount=((Amount*(tax/100))/12);
        return null;
   }
}

        
       
   

    
    