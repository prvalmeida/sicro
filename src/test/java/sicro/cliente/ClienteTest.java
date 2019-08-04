package sicro.cliente;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sicro.cliente.Cliente;
import sicro.cliente.Proposta;
 
class ClienteTest {
	
	private Cliente cliente;
	
	@BeforeEach
	void createClient() {
		cliente = new Cliente ("00866598755");
	}
 
	/**
	 * Teste de criação da proposta
	 */
    @Test
    void create() {
   	
    	Proposta p = new Proposta(cliente,60000,"teste",2);
    	
    	assertEquals(2, p.getMatriculaConvenio()); 
    }
    
    /**
     * Aqui testamos se a adição de uma proposta à lista de propostas de um cliente funciona
     */
    @Test
    void addPropose () {
    	Proposta p = new Proposta(cliente,60000,"inss",1000);
    	
    	try {
    		cliente.addProposta(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	List<Proposta> propostas = cliente.getPropostas();
    	
    	assertTrue(propostas.contains(p));
    }
    
    /**
     * Cenario em que tentamos associar uma proposta a um cliente que já possui 5 propostas no seu CPF
     * A ideia é a classe Cliente lançar uma exceção quando isso ocorre
     */
    @Test
    void moreThanFiveProposes() {
    	Proposta p = new Proposta(cliente,60000,"inss",1000);
    	try {
    		cliente.addProposta(p);
    		cliente.addProposta(p);
    		cliente.addProposta(p);
    		cliente.addProposta(p);
    		cliente.addProposta(p);
    	} catch (Exception e) {
			e.printStackTrace();
		}
    		   	
        Exception exception = assertThrows(Exception.class, () ->
        cliente.addProposta(p));
        
        assertEquals("Cliente atingiu máximo número de propostas", exception.getMessage());
    }
    
    /**
     * Cenario em que tentamos criar uma proposta com valor maior que o permitido
     */
    @Test
    void valueTooBig() {
    	Proposta p = new Proposta();
    	
        Exception exception = assertThrows(Exception.class, () ->
        p.setValorEmprestimo(70000));
        
        assertEquals("Valor de empréstimo maior que o limite", exception.getMessage());
    }
    
    /**
     * Cliente nao pode ser mais velho que 75 anos e mais novo que 18 
     */
    @Test
    void clientTooOld() {
    	//Get current date
    	LocalDate currentDate = LocalDate.now();
    	int age = 76;
    	
    	//Force an age of 76 years old
    	LocalDate birthDate = LocalDate.of(currentDate.getYear()-age, currentDate.getMonthValue(), currentDate.getDayOfMonth());
    	
        Exception exception = assertThrows(Exception.class, () ->
        cliente.setDataNascimento(birthDate));
        
        assertEquals("Idade do cliente maior que o limite", exception.getMessage());
    }
}