package set.run;


import java.security.Provider.Service;

import set.service.SetService;

public class SetRun {

	public static void main(String[] args) {
		SetService sevice = new SetService();
		
//		sevice.test1();
//		sevice.test2();
//		sevice.test3();
//		sevice.test4();
		sevice.lottoNumberGenerator();
	}
}
