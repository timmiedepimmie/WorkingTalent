import java.util.Arrays;

public class MiniOpdracht3 {
	void telArrayOp(int[] array) {
		int som = 0;
		for (int i=0; i < array.length; i++) {
			som += array[i];
		}
		
		System.out.println(som + " is de som van " + Arrays.toString(array));
		return;
	}
}
