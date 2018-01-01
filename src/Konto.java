/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bialas
 */
public class Konto 
{
protected String imie;
protected String nazwisko;
protected boolean czyAdmin;
protected String adresDostawy;
protected String adresZamieszkania;
protected int numerTelefonu;
protected String mail;
protected String haslo;

protected String miasto;
protected String ulica;
protected String nrDomu;
protected String nrMieszkania;
protected String kodPocztowy;

protected int id;
//konstr
public Konto(String imie,String nazwisko,int numerTelefonu, String miasto, String ulica, String nrDomu, String nrMieszkania, String kodPocztowy
		,boolean czyAdmin, String mail, String haslo)
{
	this.imie=imie;
	this.nazwisko=nazwisko;
	this.adresZamieszkania=adresZamieszkania;
	this.numerTelefonu=numerTelefonu;
	this.czyAdmin=czyAdmin;
	this.mail=mail;
	this.haslo=haslo;
	this.miasto=miasto;
	this.ulica=ulica;
	this.nrDomu=nrDomu;
	this.nrMieszkania=nrMieszkania;
	this.kodPocztowy=kodPocztowy;
}

public String getMiasto()
{return miasto;}

public String getUlica()
{return ulica;}

public String getNrDomu()
{return nrDomu;}

public String getNrMieszkania()
{return nrMieszkania;}

public String getKodPocztowy()
{return kodPocztowy;}

public String getImie()
{return imie;}

public String getNazwisko()
{return nazwisko;}

public int getNumerTelefonu()
{return numerTelefonu;}

public boolean getCzyAdmin()
{return czyAdmin;}

public String getMail()
{return mail;}

public String getHaslo()
{return haslo;}


/////////////////////////////////////////
/////////useless shit///////////////////

public void setImie(String imie)
{}
public void setNazwisko(String nazwisko)
{}
public String getAdresZamieszkania()
{return adresZamieszkania;}
public void setAdresZamieszkania(String adresZamieszkania)
{}
public String getAdresDostawy()
{return adresDostawy;}
public void setAdresDostawy(String adresDostawy)
{}
public void setNumerTelefonu(int numerTelefonu)
{}
public void setCzyAdmin(boolean czyAdmin)
{}
public void setMail(String mail)
{}
public void setHaslo()
{}
public int getId()
{return 0;}
public void setId(int id)
{}
@Override
public String toString()
{return null;}



}
