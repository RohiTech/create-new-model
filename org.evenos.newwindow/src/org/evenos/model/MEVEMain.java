package org.evenos.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MEVEMain extends X_EVE_Main
{
	private static final long serialVersionUID = 4121027200661760193L;

	public MEVEMain(Properties ctx, int EVE_Main_ID, String trxName) {
		super(ctx, EVE_Main_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MEVEMain(Properties ctx, int EVE_Main_ID, String trxName, String[] virtualColumns) {
		super(ctx, EVE_Main_ID, trxName, virtualColumns);
		// TODO Auto-generated constructor stub
	}

	public MEVEMain(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		// TODO Auto-generated method stub
		return super.afterSave(newRecord, success);
	}
}
