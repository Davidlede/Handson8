
package simulacio8;
public class Belta1{
    public double Bet0(int n, int x[], int y[], double b0,double b1){
        double beta0 = 0;
        double beta = 0; double div = 0;
        for(int i=0;i < n; i++){
            beta0 +=(y[i]-(b0+(b1*x[i])));
          
        }
        beta0=-2*(beta0/n);
        return beta0;
        }
    public double Bet1(int n, int x[], int y[], double b0,double b1){
        double beta1 = 0;
        double bet1 = 0; 
        for(int i=0;i < n; i++){
            bet1 +=(x[i]-(b0+(b1*x[i])));
          
        }
        bet1=-2*(bet1/n);
        return bet1;
        }
}
