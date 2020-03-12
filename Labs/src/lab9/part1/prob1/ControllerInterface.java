package lab9.part1.prob1;

import java.util.List;


import lab9.part1.prob1.Book;

public interface ControllerInterface {
	public void login(String id, String password) throws LoginException;
	public List<String> allMemberIds();
	public List<String> allBookIds();
	
}
