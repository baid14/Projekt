package pr;
public class SkobanViewEnd implements SokobanEnd{

	String inscription = "end";
	
	public String GetInscription()
	{
		return inscription;
	}
	
	public void view()
	{
		System.out.println(inscription);
	}

}
