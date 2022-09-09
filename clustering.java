import java.util.Random;

public class clustering {

    public static void main(String[] args) {
    
    int Numdata=50;
    int Numcluster=3;
    
    Random rnd = new Random();
    
   
   double Datax[] = new double [Numdata];
   double Datay[] = new double [Numdata];
   double xc[] = new double [Numcluster];
   double yc[] = new double [Numcluster];
   double ind[] = new double [Numdata];
   int d[][]= new int [Numdata][Numcluster];
   
   
   
   for (int i=0 ; i < Numdata; i++){
       Datax[i]= 100+ rnd.nextInt(500);
       Datay[i]= 100+ rnd.nextInt(300);
     
   } 
   
   for (int i=0 ; i < Numcluster; i++){
       int ii = rnd.nextInt(Numdata+1);
       xc[i]= Datax[ii];
       yc[i]= Datay[ii];
   }
   
   
   for(int t=0; t <=20; t++ ){
   
   
   
    
   for (int i=0; i < Numdata; i++){
       for ( int j=0; j < Numcluster; j++){
           d[i][j]= (int) Math.sqrt((int)(Datax[i]-xc[j])*(Datax[i]-xc[j])+ (Datay[i]-yc[j])*(Datay[i]-yc[j])); 
       }
   }
       
     
     
     int k=0;
     
     for (int i=0; i < Numdata; i++){
         double ddd=1000000000;
         for (int j=0; j < Numcluster; j++){
             if (ddd > d[i][j]){
                 ddd= d[i][j];
                k = j;
             }
         }
             ind[i]=k;
         }
     
     double sumc=0;
     double sumy=0;
     for (int j=0; j < Numcluster; j++){
        sumc=0;
        sumy=0;
        k=0; 
        for (int i=0; i < Numdata; i++){
             if (ind[i]==j) {
                 sumc= sumc + Datax[i];
                 sumy= sumy + Datay[i];
                 k++;
             }
            
        } 
     xc[j]= sumc/ k;
     yc[j]= sumy/ k;
     System.out.println(xc[j]);
     System.out.println(yc[j]);
     
     }   
     System.out.println("_______________");
                
        
    
     
     
     }
     for (int i=0; i < Numdata; i++){
         System.out.println(ind[i]);
         
     }
     
     
     
   }
   
}
    
    

