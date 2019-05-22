package day47_blocks;

import static day47_blocks.BriteERP.*;

public class BriteERPLogInTest {
	public static void main(String[] args) {
		// call static methods. ClassName.methodName
		BriteERP.enterEmail();
		BriteERP.enterPassword();
		BriteERP.verifyLogIn();
	
		// we can call static method without name if we IMPORT Class on the top
		enterEmail();
		enterPassword();
		verifyLogIn();
	
	}
}
