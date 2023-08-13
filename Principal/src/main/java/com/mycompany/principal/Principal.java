

package com.mycompany.principal;


public class Principal {

    public static void main(String[] args) {
      cuentaBancaria cb = new cuentaBancaria("caro", "s0ws", 200.00, "peso", "digital");
      
      cb.getMoneda();
        System.out.println("Holaa");
}
}