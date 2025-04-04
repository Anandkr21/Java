
public class HSBCBank implements Bank {

	@Override
	public void transfer() {
		System.out.println("HSBC transfering");
	}

	@Override
	public void deposit() {
		System.out.println("HSBC deposit");
	}

	@Override
	public void clearCheque() {
		System.out.println("HSBC clearCheque");
	}
	
	public void onCallTransfer() {
		System.out.println("HSBC onCallTransfer");
	}


}
