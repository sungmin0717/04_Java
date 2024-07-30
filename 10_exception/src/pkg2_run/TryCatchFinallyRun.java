package pkg2_run;

import pkg1.service.TryCatchService;
import pkg2_service.TryCatchFinallyService;

public class TryCatchFinallyRun {

	public static void main(String[] args) {
		TryCatchFinallyService service = new TryCatchFinallyService();
		service.test1();
	}
}
