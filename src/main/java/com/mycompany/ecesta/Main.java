
package com.mycompany.ecesta;

/**
 *
 * @author lauri
 */
public class Main {
    public static void main(String[] args)
    {
        eCesta cesta = new eCesta("nombre comercio", 100, "usuario", 10);
    try 
    {
        cesta.comprar(50);
    } catch (Exception e) 
    {
        System.out.println("No se puede pagar ");
    }
    try 
    {
        System.out.println("Solicitar actualización de bono");
        cesta.ActualizarBono(100);
    } catch (Exception e) {
        System.out.println("Error al recargar");
    }
    double bonoactual = cesta.bonificacion();
    System.out.println("Su bono actual es " + bonoactual);
        eCesta bolsa = null;
    
    /*Nuevo metodo  llamado NuevoMetodo*/
    NuevoMetodo(bolsa);
}
    public static void NuevoMetodo(eCesta bolsa)
    {
        System.out.println("Comercio actual de la bolsa: " + bolsa.comercio);
    }
 } 