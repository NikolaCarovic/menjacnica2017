package menjacnica.sistemske_operacije;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;

import menjacnica.Valuta;

public class SOucitajIzFajla {
	
	public static LinkedList<Valuta> izvrsi(LinkedList<Valuta> kursnaLista,String putanja){
		try{
			ObjectInputStream in = new ObjectInputStream(
					new BufferedInputStream(new FileInputStream(putanja)));
			
			kursnaLista = (LinkedList<Valuta>)(in.readObject());
			
			in.close();
			return kursnaLista;
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
}
