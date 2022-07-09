package testesThiago;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import negocio.Cliente;
import negocio.GerenciadoraClientes;

public class GerenciadoraClientesTest {

	
	@Test
	public void ListarTodosClientesDobancoTest() {
		
		List<Cliente> clientesDoBanco = new ArrayList();
		Cliente cliente01 = new Cliente(1, "Gustavo Farias", 31, "gugafarias@gmail.com", 11, true);
		Cliente cliente02 = new Cliente(2, "Thiago Ferreira", 25, "thiagomilton.f@gmail.com", 11, true);
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);
		
		GerenciadoraClientes gercliente = new GerenciadoraClientes(clientesDoBanco);
		
		// verificar que o tamanho da lista e maior ou igual a 1
		assertTrue(gercliente.getClientesDoBanco().size() >0);	
			
		
	}
	
	@Test
	public void PesquisaClienteTest() {
		
		List<Cliente> clientesDoBanco = new ArrayList();
		Cliente clientePesquisaTest = new Cliente(1, "Gustavo Farias", 31, "gugafarias@gmail.com", 11, true);
		clientesDoBanco.add(clientePesquisaTest);
		
		GerenciadoraClientes gerenciadoarClientes = new GerenciadoraClientes(clientesDoBanco);
		assertThat(gerenciadoarClientes.pesquisaCliente(1).getId(), is(1));
		assertThat(gerenciadoarClientes.pesquisaCliente(1).getEmail(), is("gugafarias@gmail.com"));
		
		
	}
	
	
	@Test
	public void AdicionarClienteTest() {
		
		
		//================ Montagem do cenario ==============
		
		// Cria uma lista do tipo cliente
		List<Cliente> clientesDoBanco = new ArrayList();
		
		// Passa esta lista vazia como parametro do construtor para iniciar a base de cliente
		GerenciadoraClientes gercliente = new GerenciadoraClientes(clientesDoBanco);
		
		
		//=============== Execução =====================
		
		//Seta os valores para o cliente
		Cliente cliente = new Cliente(2, "Thauane F", 16, "thauane@gmail.com", 11, false);
		
		//Adiciona o cliente passando a instancia de cliente
		gercliente.adicionaCliente(cliente);
		
		
		//=============== Verificação==================
		
		//Verifica os valores retornados do metodo
		assertThat(gercliente.pesquisaCliente(2).getId(), is(2));
		assertThat(gercliente.pesquisaCliente(2).getEmail(), is("thauane@gmail.com"));
		
			
	}
	
    @Test
    public void RemoverClienteTest() {
    
		// Cria uma lista do tipo cliente
		List<Cliente> clientesDoBanco = new ArrayList();
		
		// Passa esta lista vazia como parametro do construtor para iniciar a base de cliente
		GerenciadoraClientes gercliente = new GerenciadoraClientes(clientesDoBanco);
		
		//Seta os valores para o cliente
		Cliente cliente = new Cliente(2, "Thauane F", 16, "thauane@gmail.com", 11, false);
		
		//Adiciona o cliente passando a instancia de cliente
		gercliente.adicionaCliente(cliente);
    	
    	// Verifica se o valor retornado pelo metodo remove cliente e true (foi removido)
		assertTrue(gercliente.removeCliente(2) == true);
    	
    	
    }

}
