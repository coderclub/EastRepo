package Interface;

public    class Toyota implements Car  {

	@Override
	public void start() {
		System.out.println("Toyota has manual star");		
	}

	@Override
	public void size() {
	System.out.println("Toyota has 5' long");
		
	}

	@Override
	public void stop() {
		System.out.println("if break car must be stop");
	}

	
	
	
	
	

}
