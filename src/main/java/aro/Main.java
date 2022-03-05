package aro;

import java.text.DecimalFormat;

/**
 * Pruebas de refactorización en NetBeans con la clase Aro
 * @author Jorge Magariños
 */
public class Main {
    public static void main(String[] args) {
        Aro aro = new Aro(37,43,2.5);
        String saida =
                "A coordenada X é "+aro.obterX()+
                "\nA coordenada Y é "+aro.obterY()+
                "\nO radio é "+aro.obterRadio();
        aro.establecerX(35);
        aro.establecerY(20);
        aro.establecerRadio(4.2);
        DecimalFormat dousDixitos = new DecimalFormat("0.00");
        saida+="\nO diámetro é "+dousDixitos.format(aro.obterDiametro());
        saida+="\nA circunferencia é "+dousDixitos.format(aro.obterCircunferencia());
        saida+="\nA área é "+dousDixitos.format(aro.obterArea());
        System.out.println(saida);
        
        System.out.println(saida);
        System.exit(0);
    }

}