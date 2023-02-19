package com.mycompany.ecesta;

public class eCesta {
    /*Propiedades de la Clase eCesta*/
   String comercio;
    private double bono;
    private String usuario;

    
    /* Constructor sin argumentos */
    public eCesta()
    {
    }

    
    /*nuevo parametro*/
    public eCesta(String c, double b, String u, double extra) 
    {
        comercio = c;
        bono = b + extra;
        usuario = u;
    }

    
    /*Constructor con parámetros*/
    public eCesta(String c, double b, String u) 
    {
        comercio = c;
        bono = b + 10;
        usuario = u;
    }

    
    /*Método para fijar el comercio*/
    public void AsignarComercio(String nombre)
    {
        comercio = nombre;
    }

    
    /* Método que indica el usuario de la cesta electrónica */
    public String Titular() 
    {
        return usuario;
    }

    
    /*Método de consulta de bonificación*/
    public double bonificacion() 
    {
        return bono;
    }

    
    /* Método para actualizar el bono */
    public void ActualizarBono(double n) throws Exception 
    {
        if (n < 0)
            throw new Exception("El valor de actualización del bono no puede ser negativo");
        bono = bono + n;
    }

    
    /* Método para comprar */
    public void comprar(double total) throws Exception 
    {
        if (total <= 0)
            throw new Exception("Imposible la compra");

        if (bonificacion() < total)
            throw new Exception("Su bono es insuficiente para la compra");
        bono = bono - total;
    }

    
    /*Método que me devuelve el usuario de la cesta*/
    public String identificacionUsuario() 
    {
        return usuario;
    }
}