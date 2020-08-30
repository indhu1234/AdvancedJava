package indhu;

public class Greetings
{
  String message;
  Birthday bd;
  

public Birthday getBd() {
	return bd;
}

public void setBd(Birthday bd) {
	this.bd = bd;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
  public void wishes()
  {
	  System.out.println("Greetings "+message);
  }
}
