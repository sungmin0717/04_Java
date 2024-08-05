package dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import dto.Todo;

public class TotoListDaoImpl implements TotoListDao{

	//파일 경로. 설정.
	private final String FILE_PATH = "/io_test/Todo.dat";
	
	
	//목록 저장 
	
	private List<Todo> todoList = null;
	
	
	
	//스트림 객체 생성.
	
	private ObjectOutputStream oos = null;
	private ObjectInputStream ois = null; 
	
	
	//기본 생성자.
	//파일이 있으면 읽어오고 없으면 새로만드는.
	public TotoListDaoImpl() throws IOException, ClassNotFoundException {
		//파일이 존재하는 여부 확인. 파일 패스라는것을 읽어 올거야
		File file = new File(FILE_PATH);
		
		if(file.exists()) { //파일이 존재한다면,
			try {
				//스트림 생성
				todoList = (ArrayList<Todo>) ois.readObject();
				
				
			} finally {
				if(ois != null) ois.close();
			}
			
		}else {
			todoList = new ArrayList<Todo>();
			
		}

		}		
		//파일저장 
		public void savefile() throws FileNotFoundException, IOException {
//			todoList 파일을 저장한다.
			
			try {
				oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
				oos.writeObject(todoList);
			} finally {
				if(oos != null) oos.close();
				
			}
	}
}
