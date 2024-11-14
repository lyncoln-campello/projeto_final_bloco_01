package repository;

import model.Doces;

public interface Repository {

	 
    public void listarTodas();
    public void adicionar(Doces doces);
    public void atualizar(Doces doces);
    public void excluir (int numero);
    
    

   
}
