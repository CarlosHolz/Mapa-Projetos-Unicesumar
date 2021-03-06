package br.unicesumar.aula.controle;

import br.unicesumar.aula.exceptions.DadoConsultadoException;
import br.unicesumar.aula.modelo.Projeto;

import java.util.List;

public interface ProjetoDAO {

	void adicionar(Projeto projeto) throws DadoConsultadoException;

	List<Projeto> listar();

	Projeto consultarPorNome(String nome) throws DadoConsultadoException;

	Projeto alterar(String nome, Projeto projeto) throws DadoConsultadoException;

	void excluir(Projeto projeto) throws DadoConsultadoException;

	void excluir(String nome) throws DadoConsultadoException;
}
