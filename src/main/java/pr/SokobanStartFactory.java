package pr;
public class SokobanStartFactory {

	public static SokobanStart getInstance(int i){
		if (i==1)
		return new SokobanViewStart();
		else
			return new SokobanViewStart_v2();
		
	}
	
}
