
package com.ibm.pes.dlo.cmn;

import com.ibm.pes.dlo.DLOProxyNamer;
import com.ibm.pes.exception.ApplicationException;
import com.ibm.pes.fwutil.Instantiater;
import com.ibm.pes.logging.LogMsg;

/**
 * <code>PrCostCenterFactory</code> produces CostCenter objects. 
 */
public abstract class PrCostCenterFactory{
	private static PrCostCenterFactory soleInstance = null;
	
	
	public abstract PrCostCenter produce(CostCenterKey ccKey) throws ApplicationException;
}//EndClass
//Added comments by Mananjay