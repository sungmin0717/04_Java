package pkg2.run;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import pkg2.service.ByteService;

public class ByteRun {

	public static void main(String[] args) {
		
		ByteService service = new ByteService();
//		service.fileByteOutput();
//		service.bufferedFileByteOutput();
		
//		service.fileByteInput1();
//		service.fileByteInput2();
		service.bufferedFileByteInput();
		service.fileCopy();
	}
	

}
