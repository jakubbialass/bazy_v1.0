/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bialas
 */
public class Sprzet 
{
    protected String nazwa;
    protected String producent;
    protected float cena;
    protected int id;
    protected int ilosc;
    //konstr
    public Sprzet(String nazwa, String producent)
    {
    	this.nazwa=nazwa;
    	this.producent=producent;
    }
    //funkcje
    
    public String getProducent()
    {return producent;}
    
    public String getNazwa()
    {return nazwa;}
    
    
    
  /////////////////////////////////////////////////////
  //////////useless shit///////////////////////////////
    public int getId()
    {return 0;}
    public void setId(int id)
    {}
    public float getCena()
    {return 0;}
    public void setCena(float cena)
    {}
    public int getIlosc()
    {return 0;}
    public void setIlosc(int ilosc)
    {}
    
    @Override
    public String toString()
    {return null;}
    
    
}
