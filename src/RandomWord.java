import java.util.Random;
import java.util.Arrays;

public class RandomWord{

	public String[] dict = {
		"JAVA", "PIXEL", "GALAXY", "PUZZLE",
		"MATRIX", "RHYTHM", "WIZARD", "ORANGE",
		"BANANA", "FLOWER", "BREEZE", "JUNGLE",
		"FROZEN", "SILENCE", "HARBOR", "ROCKET",
		"DRAGON", "PENGUIN", "WHISPER", "THUNDER"
	};

	String randWord(){
		Random rand = new Random();
		int num = rand.nextInt(0, 20);
		return dict[num];
	}
}
