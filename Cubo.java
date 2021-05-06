

import javax.swing.JOptionPane;


public class Cubo {
    public static void main(String[] args)
    {
        int direccion=0;
        Piezas cubo = new Piezas();
        cubo.iniciaPiezas();
        cubo.imprimePiezas();
        String[] boton = {"1","0"};
        int inicio = JOptionPane.showOptionDialog(null, "Nrubik, quieres continuar?", "Bienvenida", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,boton,boton[0]);
        do{
        String[] botones = {"1", "2", "3", "4","5","6","7"};
        
        int ventana = JOptionPane.showOptionDialog(null,"Escoje una direccion:","Cubito",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null,botones, botones[0]);			
            
        if(ventana == 0) {
            direccion=0;
        } 			
               
            else if(ventana == 1) {
                direccion=1;
            }			
               
                else if(ventana == 2) {
                    direccion=2;
                }			
               
                else if(ventana == 3) {
                    direccion=3;
                }
                
                else if(ventana == 4) {
                    direccion=4;
                }
                
                else if(ventana == 5) {
                    direccion=5;
                }
                
                else if(ventana == 6) {
                    direccion=6;
                }
                
                else if(ventana == 7) {
                    direccion=7;
                }
                
        
                    cubo.movHorizontal('U',direccion);
                        cubo.movHorizontal('D',direccion);
                             cubo.imprimePiezas();
                
                
        }while (inicio == 0); {
            System.exit(0);
        }
        
        
        
    }
}
