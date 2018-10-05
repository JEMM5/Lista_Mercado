package com.listamercado.interfazgrafica;

public class Producto {
   private int id;
   private String nombre;
   private float precio;
   private String addFecha;
   private byte[] imagen;
   
   public Producto(int pId, String pNombre, float pPrecio, String pAddFecha, byte[] pImagen){
       this.id = pId;
       this.nombre = pNombre;
       this.precio = pPrecio;
       this.addFecha = pAddFecha;
       this.imagen = pImagen;
   }
   
   public int getId(){
       return id;
   }
   
   public String getNombre(){
       return nombre;
   }
   
   public float getPrecio(){
       return precio;
   }
   
   public String getAddFecha(){
       return addFecha;
   }
   
   public byte[] getImagen(){
       return imagen;
   }

}
