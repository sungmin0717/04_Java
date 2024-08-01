package dao;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import dto.Member;

public interface MemberDao {

	private final String FILE_PATH = "/io_test/membership복습.dat";
	
	private List<Member> memberList = null;
	
	private ObjectInputStream ois = null;
	private ObjectOutputStream oos = null;
	
	public MemberDaoImpl() {
		
	}
}
