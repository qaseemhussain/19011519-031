package com.uog.crud.Student_Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name= "Student")
public class Student_Entity {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Autowired
	private int STUDENT_ID;
	private String ROLLNUMBER;
	private String FIRST_NAME;
	private String LAST_NAME;
	private String MOBILE_NUMBER;
	private String EMAIL;
	private String ADDRESS;
	private boolean ISACTIVE;
	public boolean isISACTIVE() {
		return ISACTIVE;
	}
	public void setISACTIVE(boolean iSACTIVE) {
		ISACTIVE = iSACTIVE;
	}
	public int getSTUDENT_ID() {
		return STUDENT_ID;
	}
	public void setSTUDENT_ID(int sTUDENT_ID) {
		STUDENT_ID = sTUDENT_ID;
	}
	public String getROLLNUMBER() {
		return ROLLNUMBER;
	}
	public void setROLLNUMBER(String rOLLNUMBER) {
		ROLLNUMBER = rOLLNUMBER;
	}
	public String getFIRST_NAME() {
		return FIRST_NAME;
	}
	public void setFIRST_NAME(String fIRST_NAME) {
		FIRST_NAME = fIRST_NAME;
	}
	public String getLAST_NAME() {
		return LAST_NAME;
	}
	public void setLAST_NAME(String lAST_NAME) {
		LAST_NAME = lAST_NAME;
	}
	public String getMOBILE_NUMBER() {
		return MOBILE_NUMBER;
	}
	public void setMOBILE_NUMBER(String mOBILE_NUMBER) {
		MOBILE_NUMBER = mOBILE_NUMBER;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
	@Override
	public String toString() {
		return "Student_Entity [STUDENT_ID=" + STUDENT_ID + ", ROLLNUMBER=" + ROLLNUMBER + ", FIRST_NAME=" + FIRST_NAME
				+ ", LAST_NAME=" + LAST_NAME + ", MOBILE_NUMBER=" + MOBILE_NUMBER + ", EMAIL=" + EMAIL + ", ADDRESS="
				+ ADDRESS + "]";
	}
	
	

}
