package org.evenos.factories;

import java.sql.ResultSet;

import org.adempiere.base.IModelFactory;
import org.compiere.model.PO;
import org.compiere.util.Env;
import org.evenos.model.MEVEMain;
import org.evenos.model.MEVESub;

public class MyModelFactory implements IModelFactory
{
	@Override
	public Class<?> getClass(String tableName) {
		// TODO Auto-generated method stub
		
		if(tableName.equalsIgnoreCase(MEVESub.Table_Name))
			return MEVESub.class;
		
		if(tableName.equalsIgnoreCase(MEVEMain.Table_Name))
			return MEVEMain.class;
		
		return null;
	}

	@Override
	public PO getPO(String tableName, int Record_ID, String trxName) {
		// TODO Auto-generated method stub
		
		if(tableName.equalsIgnoreCase(MEVESub.Table_Name))
			return new MEVESub(Env.getCtx(), Record_ID, trxName);
		
		if(tableName.equalsIgnoreCase(MEVEMain.Table_Name))
			return new MEVEMain(Env.getCtx(), Record_ID, trxName);
		
		return null;
	}

	@Override
	public PO getPO(String tableName, ResultSet rs, String trxName) {
		// TODO Auto-generated method stub
		
		if(tableName.equalsIgnoreCase(MEVESub.Table_Name))
			return new MEVESub(Env.getCtx(), rs, trxName);
		
		if(tableName.equalsIgnoreCase(MEVEMain.Table_Name))
			return new MEVEMain(Env.getCtx(), rs, trxName);
		
		return null;
	}
}
