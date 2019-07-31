package sicro.proposta;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
 
class PropostaTest {
 
    @Test
    void create() {
    	Proposta p = new Proposta(60000,"teste",2);
    	
    	assertEquals(3, p.getMatriculaConvenio()); 
    }
}