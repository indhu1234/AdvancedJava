package indhu.org;

public class Football implements Player
{
int a;

	public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}
    public void play() {
		System.out.println("Foot Ball Match");
		
	}
  public Football()
  {
	  System.out.println("Football game");
  }
}
