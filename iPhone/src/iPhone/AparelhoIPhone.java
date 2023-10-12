package iPhone;

public class AparelhoIPhone {

	public static void main(String[] args) {
		
		Estrutura aparelho = new Estrutura();
		
		System.out.println("------------->");
	    aparelho.selecionarMusica("Hokey Pokey");
	    aparelho.tocar();
	    aparelho.pausar();

	    System.out.println("------------->");
	    aparelho.atender();
	    aparelho.iniciarCorreioVoz();
	    aparelho.ligar("992717265");

	    System.out.println("------------->");
	    aparelho.exibirPagina();
	    aparelho.atualizarPagina();
	    aparelho.adicionarNovaAba();

	    System.out.println("------------->");
	  }
	

}
