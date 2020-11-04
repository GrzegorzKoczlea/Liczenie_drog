import java.util.ArrayList;
import java.util.List;

public class Main {

public static int[][] tablica_dlugosc_drogi = new int[5][5];

	public static boolean Sprawdz_czy_bezposrednia_droga(int poczatkowy_wierzcholek, int koncowy_wierzcholek ) {
		if(tablica_dlugosc_drogi[poczatkowy_wierzcholek][koncowy_wierzcholek] != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void Znajdz_najkrotsza_droge(int pocz¹tek, int koniec) {
		
		
	}
	
	public static void main(String[] args) {
	
		ArrayList<ArrayList<Integer>> lista_drog = new ArrayList<ArrayList<Integer>>();
		
		tablica_dlugosc_drogi[1][0] = 40 ;
		tablica_dlugosc_drogi[3][0] = 15;
		tablica_dlugosc_drogi[4][0] = 30;
		tablica_dlugosc_drogi[0][1] = 40;
		tablica_dlugosc_drogi[2][1] = 5;
		tablica_dlugosc_drogi[3][1] = 10;
		tablica_dlugosc_drogi[1][2] = 5;
		tablica_dlugosc_drogi[3][2] = 35;
		tablica_dlugosc_drogi[0][3] = 15;
		tablica_dlugosc_drogi[1][3] = 10;
		tablica_dlugosc_drogi[2][3] = 35;
		tablica_dlugosc_drogi[4][3] = 25;
		tablica_dlugosc_drogi[0][4] = 30;
		tablica_dlugosc_drogi[3][4] = 25;
		
		int poczatkowy_wierzcholek = 0;
		int koncowy_wierzcholek = 2;
		
		ArrayList<Integer> droga = new ArrayList<Integer>();
		
		if(Sprawdz_czy_bezposrednia_droga(poczatkowy_wierzcholek, koncowy_wierzcholek) == true) {
			droga.add(poczatkowy_wierzcholek);
			droga.add(koncowy_wierzcholek);
			
			lista_drog.add(droga);
			droga.clear();
		}
		
		ArrayList<Integer> kolejne_wierzcho³ki = new ArrayList<Integer>();
		
		int wierzcholek_do_sprawdzenia = poczatkowy_wierzcholek; 
		
		for(int i = 0; i < 5; i++) {
			if(tablica_dlugosc_drogi[wierzcholek_do_sprawdzenia][i] != 0) {
				kolejne_wierzcho³ki.add(i);
			}	
		}
		
		for(int i = 0; i < kolejne_wierzcho³ki.size(); i++) {
			droga.add(wierzcholek_do_sprawdzenia);
			droga.add(kolejne_wierzcho³ki.get(i));
			
			lista_drog.add(droga);
			droga.clear();
		}
		
		int poziom = 2;
		
		for(int i = 0; i < lista_drog.size(); i++) {
			droga = lista_drog.get(i);	// usunac droge  z listy
			
			if(droga.size() < poziom) {
				continue;
			}
			
			wierzcholek_do_sprawdzenia = droga.get(droga.size() - 1);
			
			for(int j = 0; j < 5; j++) {                                              // trzeba bedzie zrobic z tego funkcje
				if(tablica_dlugosc_drogi[wierzcholek_do_sprawdzenia][j] != 0) {
					// dodawac drogi do listy
				}	
			}
		}
		
		
	}

}
