package testesThiago;




import static org.junit.Assert.assertThat; 
//importar esta classe para que assertThat(clienteContaCorrente1.getId(), is(10)); funcione
import static org.hamcrest.CoreMatchers.*;


import org.junit.Test;

import negocio.ContaCorrente;


/**
 * Esta classe tem objetivo de testar cada valor adiciionado para cadastro de uma nova conta corrente
 * identificando entao a correspondencia do valor adicionado
 * 
 * 
 * Conario : Nova Conta corrente
 * 
 * Dado cadastro de nova conta corrente
 * 
 * Quando envio o formulario com os campos obrigatorios
 * 
 * Entao a nova conta é criada com sucesso
 * 
 *
 * @author Thiago
 *
 */

public class ContaCorrenteTest {
	
	//Instacia do Objeto para setar os valores na classe contaCorrente
	ContaCorrente clienteContaCorrente1 = new ContaCorrente(10, 21.00, true);
	
	@Test // Cada anotação vale para um metodo de teste
	public void testContaCorrenteId() {
		
		assertThat(this.clienteContaCorrente1.getId(), is(10));
	}
	
	@Test
	// Afirmar que o valor do saldo corresponde ao valor enviado
	public void testContaCorrenteSaldo() {
		
		assertThat(this.clienteContaCorrente1.getSaldo(), is(21.00));
	}

	@Test
	// Afirmar que o valor da situação do cliente correspode ao valor enviado
	public void testContaCorrenteSituacao() {
		
		assertThat(this.clienteContaCorrente1.isAtiva(), is(true));
	}

}
