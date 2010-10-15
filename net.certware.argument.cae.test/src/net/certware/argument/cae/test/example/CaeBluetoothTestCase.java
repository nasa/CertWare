package net.certware.argument.cae.test.example;

import net.certware.argument.cae.Argument;
import net.certware.argument.cae.CaeFactory;
import net.certware.argument.cae.Claim;
import net.certware.argument.cae.Context;
import junit.framework.TestCase;


/**
 * Unit testing Bluetooth security case example from OMG document.
 * @author mrb
 * @since 0.1
 */
public class CaeBluetoothTestCase extends TestCase {

	Claim toplevelClaim;

	/**
	 * Dispose of the claim.
	 */
	public void tearDown() {
		toplevelClaim = null;
	}
	
	/**
	 * Populate the argument model.
	 */
	public void setUp() {
		toplevelClaim = CaeFactory.eINSTANCE.createClaim();
		toplevelClaim.setIdentifier("Top-Level Claim");

		Argument argument = CaeFactory.eINSTANCE.createArgument();
		argument.setIdentifier("Argue over vulnerabilities");
		argument.setDescription("Argue for each security requirement identified in the security white paper");
		toplevelClaim.getStrategy().add(argument);
		
		Claim available = CaeFactory.eINSTANCE.createClaim();
		available.setIdentifier("Availability");
		available.setContent("A bluetooth enabled network is adequately available [1] Section 1 para 3");
		argument.getClaims().add(available);
		
		Claim access = CaeFactory.eINSTANCE.createClaim();
		access.setIdentifier("Access");
		access.setContent("A bluetooth enabled network provides adequate control for access to services and data [1] Section 1 para 3");
		argument.getClaims().add(access);
		
		Claim confidentiality = CaeFactory.eINSTANCE.createClaim();
		confidentiality.setIdentifier("Confidentiality");
		confidentiality.setContent("A bluetooth enabled network provides adequate levels of confidentiality [1] Section 1 para 3");
		argument.getClaims().add(confidentiality);

		Claim integrity = CaeFactory.eINSTANCE.createClaim();
		integrity.setIdentifier("Integrity");
		integrity.setContent("A bluetooth enabled network provides adequate levels of integrity [1] Section 1 para 3");
		argument.getClaims().add(integrity);
		
		Context i1 = CaeFactory.eINSTANCE.createContext();
		i1.setIdentifier("Context: security policy and scenario for use");
		i1.setContent("Definitions are required of the intended security policy and the scenario of use for the system, including what is regarded as 'adequate'");
		i1.setDescription("");
		toplevelClaim.getContext().add(i1);
		
		Context i2 = CaeFactory.eINSTANCE.createContext();
		i2.setIdentifier("References");
		i2.setContent("[1] Bluetooth security white paper 19/4/02");
		i2.setDescription("");
		toplevelClaim.getContext().add(i2);

		Context i3 = CaeFactory.eINSTANCE.createContext();
		i3.setIdentifier("Definition: Availability");
		i3.setContent("The system is capable of providing requested services to authorized users, in an acceptable/defined time");
		i3.setDescription("");
		available.getContext().add(i3);

		Context i4 = CaeFactory.eINSTANCE.createContext();
		i4.setIdentifier("Definition: Access");
		i4.setContent("Only users permitted by the defined security policy have access to services and data");
		i4.setDescription("");
		access.getContext().add(i4);

		Context i5 = CaeFactory.eINSTANCE.createContext();
		i5.setIdentifier("Definition: Confidentiality");
		i5.setContent("Unauthorized persons cannot intercept and understand information to which they are not entitled");
		i5.setDescription("");
		confidentiality.getContext().add(i5);
		
		Context i6 = CaeFactory.eINSTANCE.createContext();
		i6.setIdentifier("Definition: Integrity");
		i6.setContent("Services and data are provided to authorized users as intended and without corruption");
		i6.setDescription("");
		integrity.getContext().add(i6);

	}
	

	public void testArgumentLists() throws Exception {
		assertEquals(1, toplevelClaim.getStrategy().size());
		assertEquals(2, toplevelClaim.getContext().size());
		assertTrue(toplevelClaim.getAssumption().isEmpty());
		assertTrue(toplevelClaim.getIsTagged().isEmpty());
	}

	public void testArgument() throws Exception {
		assertNull(toplevelClaim.getDescription());
		assertNull(toplevelClaim.getContent());
		assertEquals("Top-Level Claim",toplevelClaim.getIdentifier());
	}

	public void testSubclaims() throws Exception {
		Argument a = toplevelClaim.getStrategy().get(0);
		assertEquals(4,a.getClaims().size());
		
		for ( Claim c : a.getClaims() ){
			assertEquals(1,c.getContext().size());
			assertNull(c.getDescription());
			assertEquals(0,c.getAssumption().size());
		}
	}
	
}
