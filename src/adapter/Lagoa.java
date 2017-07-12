package adapter;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class Lagoa {

	public static void main(String[] args) {
		Pato pato = new PatoMalhado();
		Peru peru = new PeruSelvagem();
		Pato peruAdapter = new PeruAdapter(peru);
		
		peru.gluglu();
		peru.voar();
		
		pato.quackar();
		pato.voar();
		
		peruAdapter.quackar();
		peruAdapter.voar();
		
		//Iterator
		
		List<String> lista = new ArrayList<String>();
		lista.add("Strategy");
		lista.add("Observer");
		lista.add("Decorator");
		
		for( Iterator iterator = list.iterator(); iterator.hasNext() ){
			String string = (String) iterator.next();
			System.out.println("Lista:" + string);
		}
		Set<String> set = new HashSet<String>();
		set.add("Strategy");
		set.add("Observer");
		set.add("Decoratot");
		
		for( Iterator iterator = set.iterator(); iterator.hasNext();){
			String string = ( String ) iterator.next();
			System.out.println("Set:" + String);
		}
	}
}
