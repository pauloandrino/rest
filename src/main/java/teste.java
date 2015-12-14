import model.Produto;


public class teste {

	public static void main(String[] args) {
		Produto p = Produto.builder().id(1l).nome("Paulo").build();
		
		System.out.println(p.getId());
		System.out.println(p.getNome());
	}
}
