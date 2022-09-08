package co.edu.unbosque.controller;

import javax.swing.*;
import java.math.BigInteger;

public class Congruencias {

    public static void main(String[] args) {
            boolean salir = false;
            do{
                try{
                    int menu = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción que desea realizar " +
                            "\n 1. Calcular si dos números son congruentes " +
                            "\n 2. Salir"));
                    switch (menu){
                        case 1:
                            BigInteger numero1 = BigInteger.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero")));
                            if(numero1.compareTo(new BigInteger("0")) < 0){
                                JOptionPane.showMessageDialog(null,"Ingrese un valor positivo");
                                break;
                            }
                            BigInteger numero2 = BigInteger.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero")));
                            if(numero2.compareTo(new BigInteger("0")) < 0){
                                JOptionPane.showMessageDialog(null,"Ingrese un valor positivo");
                                break;
                            }
                            BigInteger modulo = BigInteger.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el modulo")));
                            if(modulo.compareTo(new BigInteger("0")) < 0){
                                JOptionPane.showMessageDialog(null,"Ingrese un valor positivo");
                                break;
                            }

                            BigInteger op = numero1.subtract(numero2);

                            if(esMúltiplo(op, modulo) && numero1.mod(modulo).equals(numero2.mod(modulo))){
                                JOptionPane.showMessageDialog(null,numero1+" y "+numero2+" son congruentes con modulo: "+modulo);
                            } else {
                                JOptionPane.showMessageDialog(null,numero1+" y "+numero2+" NO son congruentes con modulo: "+modulo);                      }
                            break;
                        case 2:
                            salir = true;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Ingrese una opción valida");
                            break;
                    }
                } catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Ingrese una opción valida");
                }
            } while (!salir);
    }
    public static boolean esMúltiplo(BigInteger n1,BigInteger n2){
        if (n1.mod(n2).equals(BigInteger.ZERO))
            return true;
        else
            return false;
    }
}
