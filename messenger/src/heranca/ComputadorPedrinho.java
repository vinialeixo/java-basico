package heranca;
/*
 * Simulação do uso da classe MSNMessenger
 */
public class ComputadorPedrinho {
	public static void main(String[] args) {
		//abrindo MSN Messenger
		MSNMessenger msn = new MSNMessenger();
		
		msn.enviarMensagem();
		
		msn.receberMensagem();

		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();

		Facebook fbc = new Facebook();
		fbc.enviarMensagem();
		fbc.receberMensagem();
	}
}
