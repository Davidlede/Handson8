
package simulacio8;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import java.util.Scanner;
public class simulacio8 extends Agent{
    
@Override
    public void setup()
    {
    System.out.println("Agente "+getLocalName()+" iniciado");
        int x[] ={23,26,30,34,43,48,52,57,58};
        int y[] = {651,762,856,1063,1190,1298,1421,1440,1518};
        int n=9;
        double b0=0;
        double b1=0;
        double alfa =0.003;
        double faik = 0;
        double aux0 = 0;
        double aux1;
        
        
         Belta1 belta1 = new Belta1();
        Operacion  operacion = new Operacion ();
        faik = operacion.Faik(n,  x, y,  b0, b1);
        
        while(faik>0){
        aux0 = b0;
        aux1 =b1;
       System.out.print(faik+"error inicial:  \n");
        b0 = b0 - (alfa *(belta1.Bet0(n,x,y,b0,b1)));
        b1 = b1 - (alfa *(belta1.Bet1(n,x,y,b0,b1)));
        faik = operacion.Faik(n,  x, y,  b0, b1);
        System.out.print(" \n"+faik);
        System.out.print("error despues:  \n"+faik);
         }
        System.out.print("B0:  "+b0);
        System.out.print("\n");
        System.out.print("B1:  "+b1);
        addBehaviour(new MyOneShotBehaviour());
        }
    private class MyOneShotBehaviour extends OneShotBehaviour{
        @Override
    public void action(){// invocar el agente 
    System.out.println("Agent's action method executed"+"\n");
}
    @Override
    public int onEnd(){// es para eliminar agente
        myAgent.doDelete();
        return super.onEnd();
    }
}
    }
         
