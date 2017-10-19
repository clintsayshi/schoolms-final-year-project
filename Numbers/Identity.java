package Numbers;

import java.util.Date;

public class Identity {
	// The Input Identity Number
	private long id;
	
	public Identity(String id) {
		super();
		this.id = Long.parseLong(id);
	}
	
	public void setId(String id) {
		this.id = Long.parseLong(id);
	}
	
	public long getId() {
		return id;
	}
	
	public char getGender(){
		
		if(Integer.parseInt(getLine(6)) >= 0 && Integer.parseInt(getLine(6)) <= 4)
			return 'F';
		else if(Integer.parseInt(getLine(6)) >= 5 && Integer.parseInt(getLine(6)) <= 9)
			return 'M';
		
		return 'X';
	}
	
	public String getCitizenship(){
		
		if(Integer.parseInt(getLine(10)) == 0)
			return "SA";
		else if(Integer.parseInt(getLine(10)) == 1)
			return "Non-SA";
		
		return "Not a valid Identity Number";
		
	}
	
	public String getLine(int n){
		String s = id + "";
		char[] arr = s.toCharArray();
		s = arr[n] + "";
		return s;
	}
	
	public String getLine(){
		String s = id + "";
		s = s.substring(0,6);
		return s;
	}
	
	public Date getBirth() {
		Date birth = new Date();
		int d = Integer.parseInt(getLine());
		birth = new Date(d);
		return birth;
	}

}
