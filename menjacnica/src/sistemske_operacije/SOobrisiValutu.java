package sistemske_operacije;

import java.util.LinkedList;

import menjacnica.Valuta;

public class SOobrisiValutu {
	
	public static void izvrsi(LinkedList<Valuta> kursnaLista,Valuta valuta){
		if (!kursnaLista.contains(valuta))
			throw new RuntimeException("Valuta ne postoji u kursnoj listi");
		
		kursnaLista.remove(valuta);
	}
}
