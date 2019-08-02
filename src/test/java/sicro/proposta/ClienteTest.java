package sicro.proposta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
 
class ClienteTest {
	
	private final Cliente cliente = new Cliente("00899999955");
 
    @Test
    void create() {
   	
    	Proposta p = new Proposta(cliente,60000,"teste",2);
    	
    	assertEquals(2, p.getMatriculaConvenio()); 
    }
    
    //Aqui testamos se a adição de uma proposta à lista de propostas de um cliente funciona
    @Test
    void addPropose () {
    	Cliente c = new Cliente("00899999955");
    	Proposta p = new Proposta(c,60000,"inss",1000);
    	
    	try {
			c.addProposta(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	List<Proposta> propostas = c.getPropostas();
    	
    	assertTrue(propostas.contains(p));
    }
    
    //Cenario em que tentamos associar uma proposta a um cliente que já possui 5 propostas no seu CPF
    //A ideia é a classe Cliente lançar uma exceção quando isso ocorre
    @Test
    void moreThanFiveProposes() {
    	Cliente c = new Cliente("00899999966");
    	Proposta p = new Proposta(cliente,60000,"inss",1000);
    	try {
	    	c.addProposta(p);
	    	c.addProposta(p);
	    	c.addProposta(p);
	    	c.addProposta(p);
	    	c.addProposta(p);
    	} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    		   	
        Exception exception = assertThrows(Exception.class, () ->
        c.addProposta(p));
        assertEquals("Cliente atingiu máximo número de propostas", exception.getMessage());
    }
}