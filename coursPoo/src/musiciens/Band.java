package musiciens;

import java.util.List;

public class Band {


		public static  void play(List<Musicians> musicians) {
			for (Musicians musician : musicians) {
				musician.play1();
			}
		}

}
