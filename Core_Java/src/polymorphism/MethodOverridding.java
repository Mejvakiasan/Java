package polymorphism;


	
	class Bank{
		public double getInterest() {
			return 0.0;
		}
		
		}
	
	class SBI extends Bank{
		@Override
		public double getInterest() {
			return 6.5;
		}
	}
	
	class ICICI extends Bank{
		@Override
		public double getInterest() {
			return 7.0;
		}
	}
	
	class HDFC extends Bank{
		@Override
		public double getInterest() {
			return 6.8;
		}
	}
	
	public class MethodOverridding {
		public static void main(String[] args) {
			Bank bank = new Bank();
			Bank sbi = new SBI();
			Bank icici = new ICICI();
			Bank hdfc = new HDFC();
			
			System.out.println(bank.getInterest());
			System.out.println(sbi.getInterest());
			System.out.println(icici.getInterest());
			System.out.println(hdfc.getInterest());
		}
}
