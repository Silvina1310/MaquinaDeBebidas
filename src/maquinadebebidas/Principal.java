
package maquinadebebidas;

/**
 *
 * @author Silvina Páez
 */

import maquinaCafe.Ristretto;
import maquinaTe.Verde;
import java.util.Scanner;
import maquinaCafe.Expreso;
import maquinaCafe.Normal;
import maquinaTe.Negro;
import maquinaTe.Rojo;

public class Principal {

    public static void main(String[] args) {
        Bebida[] pedido = new Bebida[200];
        boolean otroPedido = true;
        int otro = 0;

        while (otroPedido) {
            System.out.println("¿Qué bebida solicita?\n"
                    + "1)Café\n"
                    + "2)Té\n");
            Scanner entrada = new Scanner(System.in);
            int clase = entrada.nextInt();
            if (clase == 1) {
                System.out.println(""+ "1-Expresso\n"+ "2-Ristretto\n"+ "3-Normal\n");
                Scanner entradacafe = new Scanner(System.in);
                int tipoCafe = entradacafe.nextInt();         
                switch (tipoCafe) {
                    case 1:
                        pedido[otro] = new Expreso();
                        break;
                    case 2:
                        pedido[otro] = new Ristretto();
                        break;
                    case 3:
                        pedido[otro] = new Normal();
                        break;
                }
                
                System.out.println("¿Cuánto de azúcar?0-3");
                Scanner entradaazucar = new Scanner(System.in);
                int azucar = entradaazucar.nextInt();
                pedido[otro].setAzucar(azucar);

                System.out.println("¿Cuánto de leche?0-3");
                Scanner entradaleche = new Scanner(System.in);
                int leche = entradaleche.nextInt();
                pedido[otro].setLeche(leche);
            }

            if (clase == 2) {
                System.out.println(""+ "1-Negro\n"+ "2-Rojo\n"+ "3-Verde\n");
                Scanner entradate = new Scanner(System.in);
                int tipoTe = entradate.nextInt();          
                switch (tipoTe) {
                    case 1:
                        pedido[otro] = new Negro();
                        break;
                    case 2:
                        pedido[otro] = new Rojo();
                        break;
                    case 3:
                        pedido[otro] = new Verde();
                        break;
                }

                System.out.println("¿Cuánto de azúcar?0-3");
                Scanner cuantoDeAzucar = new Scanner(System.in);
                int azucar = cuantoDeAzucar.nextInt();
                pedido[otro].setAzucar(azucar);

                System.out.println("¿Cuanta leche?0-3");
                Scanner cuantoDeLeche = new Scanner(System.in);
                int leche = cuantoDeLeche.nextInt();
                pedido[otro].setLeche(leche);
            }

            System.out.println("¿Quisiera pedir algo más?\n"
                    + "1-Sí\n"
                    + "2-No\n");
            Scanner entradaOtroPedido = new Scanner(System.in);
            int nuevo = entradaOtroPedido.nextInt();
            if (nuevo == 1) {
                otro++;
            } else {
                otroPedido = false;
            }
        }

        double subtotal = 0, total = 0;

        for (int i = 0; i < pedido.length; i++) {
            if (pedido[i] != null) {
                System.out.println(pedido[i]);
                subtotal = subtotal + pedido[i].getPrecio()
                        + pedido[i].getAzucar() * 5
                        + pedido[i].getLeche() * 5;    
            }
        }
        total = subtotal * 1.20;
        System.out.println("Subtotal:" + subtotal);
        System.out.println("Total:" + total);
    }
}

