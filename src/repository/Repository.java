package repository;

import model.Doces;

public interface Repository {

	 //CRUD da conta
    public void listarTodas();
    public void adicionar(Doces doces);
    public void atualizar(Doces doces);
    public void excluir (int numero);

   
}
