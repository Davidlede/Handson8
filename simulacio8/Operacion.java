
package simulacio8;
public class Operacion {
        public  double Faik(int n, int x[], int y[], double b0,double b1){
        double faik=0;
        for(int i=0;i<n;i++){
            faik+= Math.pow((y[i]-(b0+(b1*x[i]))),2);
            faik=faik/n;
        }
        return faik;
}
}
