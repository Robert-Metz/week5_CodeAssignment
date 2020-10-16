package week5;



public class AsteriskLogger  implements Logger{

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
	}

	@Override
	public void error(String error) {
		String asterisksTop = "**";
		String asterisksBottom = "**";
				
		
		for(int i = 0; i < error.length(); i++) {
			asterisksTop = asterisksTop + "*";
			System.out.print(asterisksTop);
		}
		System.out.println();
		
		System.out.println("***Error: " + error + "***");
		for(int i = 0; i < error.length(); i++) {
			asterisksBottom = asterisksBottom + "*";
			System.out.print(asterisksBottom);
		}
		System.out.println();


		
		
		
	}

}
