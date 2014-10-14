package ngat.phase2.util;

import java.io.Serializable;

import ngat.phase2.IAccount;

public class SemesterAccountEntry implements Serializable {

	IAccount account;
	String column1, column2, column3;
	
	public SemesterAccountEntry() {} //JiBX requirement
	
	public SemesterAccountEntry(IAccount account, String column1, String column2, String column3) {
		this.account = account;
		this.column1 = column1;
		this.column2 = column2;
		this.column3 = column3;
	}

	public IAccount getAccount() {
		return account;
	}

	public String getColumn1() {
		return column1;
	}

	public String getColumn2() {
		return column2;
	}

	public String getColumn3() {
		return column3;
	}
	
	public void setAccount(IAccount account) {
		this.account = account;
	}

	public void setColumn1(String column1) {
		this.column1 = column1;
	}

	public void setColumn2(String column2) {
		this.column2 = column2;
	}

	public void setColumn3(String column3) {
		this.column3 = column3;
	}

	public String toString() {
		String s= "";
		s += this.getClass().getName() + "[";
		s += "account=" + account + ",";
		s += "column1=" + column1 + ",";
		s += "column2=" + column2 + ",";
		s += "column3=" + column3;
		s += "]";
		return s;
	}
}
