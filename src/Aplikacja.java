/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JTextField;
/**
 *
 * @author Bialas
 */
public class Aplikacja extends StartScreen
{
	Connection myConn;
    private List<Sprzet> Produkty = new ArrayList<>();
    private List<Rachunek> Rachunki = new ArrayList<>();
    private Konto currentAccount;
    private int id_konta;
    
    public Aplikacja()
    {
    	try{
			// 1. Get a connection to database
			myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/shop2", "root", "root");
			// 2. Create a statement
			Statement myState= myConn.createStatement();
			// 3. Execute sql query
			ResultSet myResult= myState.executeQuery("select* from konto");
			// 4. Process the result set
			while (myResult.next())
			{
				//System.out.println(myResult.getString("haslo"));
			}
		} catch (Exception exc){
			exc.printStackTrace();
		}
    }
    //funkcje
    public String zaloguj(String mail, String password){
    	String nazwaKonta="dupa";
		try{
			Statement myState= myConn.createStatement();
			// 3. Execute sql query
			ResultSet myResult= myState.executeQuery("select* from konto");
			// 4. Process the result set
			while (myResult.next())
			{
				
				if(myResult.getString("mail").equals(mail) && myResult.getString("haslo").equals(password) && myResult.getInt("czyAdmin")==0)
				{
					System.out.println("czy admin? - "+ myResult.getInt("czyAdmin"));
					nazwaKonta= "uzytkownik";
					try{
						Statement myState2= myConn.createStatement();
						ResultSet myResult2= myState2.executeQuery("select* from konto where mail='"+mail+"'");
	
						while (myResult2.next())
						{
							id_konta=myResult2.getInt("ID_KONTA");
							
						}
					} catch (Exception exc){
						exc.printStackTrace();
					}

					aktualizujKonto(id_konta);
					System.out.println("lol");
				}
				else if(myResult.getString("mail").equals(mail) && myResult.getString("haslo").equals(password) && myResult.getInt("czyAdmin")==1)
				{
					
					
					nazwaKonta= "admin";
					try{
						Statement myState2= myConn.createStatement();
						ResultSet myResult2= myState2.executeQuery("select* from konto where mail='"+mail+"'");
						
						while (myResult2.next())
						{
							id_konta=myResult2.getInt("ID_KONTA");
						}
					} catch (Exception exc){
						exc.printStackTrace();
					}
					System.out.println(id_konta);
					
				}
				
			}
		} catch (Exception exc){
			exc.printStackTrace();
		}
		
		
		
		System.out.println("co zwroce? - "+nazwaKonta);
		
		return nazwaKonta;
    }
    
    
    public Konto zarejestruj(String mail, String password, String password2){
    	boolean czyWolneKonto=true;
    	Konto konto = null;
    	try{
    		//sprawdzamy czy konto o podanym mailu ju¿ istnieje czy nie
			Statement myState= myConn.createStatement();
			ResultSet myResult= myState.executeQuery("select* from konto");
			
			while (myResult.next())
			{
				if(myResult.getString("mail").equals(mail)){
					czyWolneKonto=false;
				}
			}
		} catch (Exception exc){
			exc.printStackTrace();
		}
    	
    	//jesli konto o podanym mailu nie istnieje to mo¿emy je ju¿ zak³adaæ
    	if(czyWolneKonto)
    	{
    		//o ile podane hasla sie ze soba zgadzaj¹
    		if(password.equals(password2))
    		{	
    			 //tutaj tworzymy konto i dodajemy je do baz danych
    			konto = new Konto(null, null, 0, null, null, null, null, null, false, mail, password);
    			
    			try{
    				Statement myState= myConn.createStatement();
    				
    				String sql = "insert into konto" 
    						+ " (mail, haslo, czyAdmin)"
    						+ " values ('"+konto.getMail()+"', '" +konto.getHaslo()+"', '0')";
    				
    				myState.executeUpdate(sql);
    			
    			} catch (Exception exc){
    				exc.printStackTrace();
    			}
    			
    			///////////////////////////////////////////
    			
    			
    			
				// pobieramy id_konto
				try{
					Statement myState2= myConn.createStatement();
					// 3. Execute sql query
					ResultSet myResult2= myState2.executeQuery("select* from konto where mail='"+mail+"'");
					// 4. Process the result set
					while (myResult2.next())
					{
						id_konta=myResult2.getInt("ID_KONTA");
						
					}
				} catch (Exception exc){
					exc.printStackTrace();
				}
    			
				//a teraz dodajemy nowego klienta do tabelki dane_konta z odpowiednim ID_KONTA (czyli takim jak w tebelce KONTO)
    			try{
    				Statement myState3= myConn.createStatement();
    				
    				String sql = "insert into dane_konta" 
    						+ " (imie, nazwisko, numerTelefonu, miasto, ulica, nrDomu, nrMieszkania, kodPocztowy, KontoID_KONTA)"
    						+ " values ('', '', '"+0+"', '', '', '', '', '','"+id_konta+"')";
    				
    				myState3.executeUpdate(sql);
    			
    			} catch (Exception exc){
    				exc.printStackTrace();
    			}
    			
    		}
    		else
    		{
    			StartScreen.rozneHasla.setVisible(true);
    		}
    	}
    	
    	else
    	{
    		System.out.println("eeeelo xd");
    		StartScreen.mailIstnieje.setVisible(true);
    	}
    	
    	
    	
    	
    	return konto;
    }
    
    
    
    public void wyswietlDane(JTextField pole_imie, JTextField pole_nazwisko, JTextField pole_numerTelefonu, JTextField pole_miasto
    		, JTextField pole_ulica, JTextField pole_nrDomu, JTextField pole_nrMieszkania, JTextField pole_kodPocztowy)
    {
    	pole_imie.setText(currentAccount.getImie());
    	pole_nazwisko.setText(currentAccount.getNazwisko());
    	pole_numerTelefonu.setText(Integer.toString(currentAccount.getNumerTelefonu()));
    	pole_miasto.setText(currentAccount.getMiasto());
    	pole_ulica.setText(currentAccount.getUlica());
    	pole_nrDomu.setText(currentAccount.getNrDomu());
    	pole_nrMieszkania.setText(currentAccount.getNrMieszkania());
    	pole_kodPocztowy.setText(currentAccount.getKodPocztowy());
    }
    
    public void zapiszDane(JTextField pole_imie, JTextField pole_nazwisko, JTextField pole_numerTelefonu, JTextField pole_miasto
    		, JTextField pole_ulica, JTextField pole_nrDomu, JTextField pole_nrMieszkania, JTextField pole_kodPocztowy)
    {
    	

    	String imie=pole_imie.getText();
    	String nazwisko=pole_nazwisko.getText();
    	String numerTelefonu=pole_numerTelefonu.getText();
    	String miasto=pole_miasto.getText();
    	String ulica=pole_ulica.getText();
    	String nrDomu=pole_nrDomu.getText();
    	String nrMieszkania=pole_nrMieszkania.getText();
    	String kodPocztowy=pole_kodPocztowy.getText();
    	System.out.println(id_konta);
    	System.out.println(imie);
    	try{
    	Statement myState= myConn.createStatement();
    	String sql= "update dane_konta set imie='"+imie
    			+"', "+ "nazwisko='"+nazwisko
    			+"', "+ "numerTelefonu='"+Integer.parseInt(numerTelefonu)
    			+"', "+ "miasto='"+miasto
    			+"', "+ "ulica='"+ulica
    			+"', "+ "nrDomu='"+nrDomu
    			+"', "+ "nrMieszkania='"+nrMieszkania
    			+"', "+ "kodPocztowy='"+kodPocztowy
    			+"' where KontoID_KONTA="+id_konta;
    	
    	myState.executeUpdate(sql);
    	
    	} catch (Exception exc){
    		exc.printStackTrace();
    		}
    	
    	aktualizujKonto(id_konta);
    	
    }
    
    
    public void aktualizujKonto(int id_konta)
    {
		String imie="";
		String nazwisko="";
		String adresZamieszkania="";
		int numerTelefonu=0;
		boolean czyAdmin=false;
		String email="";
		String haslo="";
		String miasto="";
		String ulica="";
		String nrDomu="";
		String nrMieszkania="";
		String kodPocztowy="";
		
		try{
			Statement myState3= myConn.createStatement();
			// 3. Execute sql query
			ResultSet myResult3= myState3.executeQuery("select* from dane_konta where KontoID_KONTA="+id_konta);
			// 4. Process the result set
			while (myResult3.next())
			{
				imie=myResult3.getString("imie");
				nazwisko=myResult3.getString("nazwisko");
				miasto=myResult3.getString("miasto");
				ulica=myResult3.getString("ulica");
				nrDomu=myResult3.getString("nrDomu");
				nrMieszkania=myResult3.getString("nrMieszkania");
				kodPocztowy=myResult3.getString("kodPocztowy");
				numerTelefonu=myResult3.getInt("numerTelefonu");
				//czyAdmin=myResult3.getString("imie");
				//email=myResult3.getString("imie");
				//haslo=myResult3.getString("imie");
			}
		} catch (Exception exc){
			exc.printStackTrace();
		}
		
		currentAccount = new Konto(imie, nazwisko, numerTelefonu, miasto, ulica, nrDomu, nrMieszkania, kodPocztowy, czyAdmin, email, haslo);
		System.out.println(currentAccount.getImie()+"  --huehue konto zaaktualizowane");
    }
    
    
    
    public String dodajSprzet(Sprzet sprzet)
    {
    	String zwrot=null;
    	boolean czyJestJuzDodany=false;
    	try{
    		//sprawdzamy czy konto o podanym mailu ju¿ istnieje czy nie
			Statement myState= myConn.createStatement();
			ResultSet myResult= myState.executeQuery("select* from sprzet");
			
			while (myResult.next())
			{
				if(myResult.getString("nazwa").equals(sprzet.getNazwa()) && myResult.getString("producent").equals(sprzet.getProducent()))
				{
					czyJestJuzDodany=true;
				}
			}
		} catch (Exception exc){
			exc.printStackTrace();
		}
    	
    	if(czyJestJuzDodany==false)
    	{
    		try{
        		//sprawdzamy czy konto o podanym mailu ju¿ istnieje czy nie
    			Statement myState= myConn.createStatement();
    			String sql ="insert into sprzet "
    					+"(nazwa, producent) "
    					+"values ('"+sprzet.getNazwa()+"', '"+sprzet.getProducent()+"')";
    			
    			myState.executeUpdate(sql);
    			
    			zwrot="Dodano sprzêt pomyœlnie. ["+sprzet.getNazwa()+", "+sprzet.getProducent()+"]";
    		} catch (Exception exc){
    			exc.printStackTrace();
    		}
    		
    	}
    	else
    	{
    		zwrot="Taki sprzêt ju¿ istnieje !";
    	}
    	
    	
    	return zwrot;
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void dodajKonto(Konto konto)
    {}
    public Sprzet szukajSprzetuId(int id)
    {return null;}
    public Sprzet szukajSprzetuNazwa(String nazwa)
    {return null;}
    public void kupSprzet(Sprzet sprzet, int ilosc, int dni,Date date)
    {}
    public void wyswietlajSprzet()
    {}
    
    public void usun(int id, int ilosc)
    {}
    public void zmienCene(int id, float nowaCena)
    {}
    public void wystawRachunek(int numer)
    {}
    public Rachunek szukajRachunek(int numer)
    {return null;}
    
    
    //*************** M O J E   M E T O D Y********************
    
   
    
}
