package wrapper.run;

import java.sql.Wrapper;

import wrapper.service.WrapperService;

public class WrapperRun {

	public static void main(String[] args) {
		
		WrapperService service = new WrapperService();
		
//		service.test1();
		service.test2();
	}
}
