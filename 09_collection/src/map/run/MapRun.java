package map.run;

import java.security.Provider.Service;

import map.service.MapService;

public class MapRun {

	public static void main(String[] args) {
		
		MapService service = new MapService();
		
//		service.test1();
		service.test2();
	}
}
