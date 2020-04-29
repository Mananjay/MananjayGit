//Mananjay added
package com.ibm.pes.dlo.cmn;

import com.ibm.pes.dlo.KeyedDLO;
public interface PrCostCenter extends KeyedDLO{
	
	CostCenterKey getCostCenterKey();
	
	String getApproverWebId();
	
	String getDivisionCd();
	
	String getLedgerCd();
	
	String getLedgerReportingUnit();
	
	String getAccountMajor();
	
	boolean isBlocked();	
}//EndInterface
//Added last line by Mananjay
