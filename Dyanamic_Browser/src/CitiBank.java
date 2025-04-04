
public class CitiBank implements Bank {

	@Override
	public void transfer() {
		System.out.println("Citi bank transfer");
	}

	@Override
	public void deposit() {
		System.out.println("Citi bank deposit");
	}

	@Override
	public void clearCheque() {
		System.out.println("Citi bank clear Cheque");
	}

}
