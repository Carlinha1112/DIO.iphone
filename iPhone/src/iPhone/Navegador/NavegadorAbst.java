package iPhone.Navegador;

public abstract class NavegadorAbst implements NavegadorFuncoes {

	  @Override
	  public void exibirPagina() {
	    System.out.println("Exibindo a página.");
	  }

	  @Override
	  public void adicionarNovaAba() {
	    System.out.println("Adicionando página.");
	  }

	  @Override
	  public void atualizarPagina() {
	    System.out.println("Atualizando página.");
	  }
}
