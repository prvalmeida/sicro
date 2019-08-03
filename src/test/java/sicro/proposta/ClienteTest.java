package sicro.proposta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
 
class ClienteTest {
	
	private Cliente cliente;
	
	@Before
	void createClient() {
		cliente = new Cliente ("00866598755");
	}
 
    @Test
    void create() {
   	
    	Proposta p = new Proposta(cliente,60000,"teste",2);
    	
    	assertEquals(2, p.getMatriculaConvenio()); 
    }
    
    //Aqui testamos se a adição de uma proposta à lista de propostas de um cliente funciona
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
    
    //Cenario em que tentamos associar uma proposta a um cliente que já possui 5 propostas no seu CPF
    //A ideia é a classe Cliente lançar uma exceção quando isso ocorre
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    		   	
        Exception exception = assertThrows(Exception.class, () ->
        cliente.addProposta(p));
        
        assertEquals("Cliente atingiu máximo número de propostas", exception.getMessage());
    }
    
    @Test
    void valueTooBig() {
    	Proposta p = new Proposta();
    	
        Exception exception = assertThrows(Exception.class, () ->
        p.setValorEmprestimo(70000));
        
        assertEquals("Valor de empréstimo maior que o limite", exception.getMessage());
    }
}