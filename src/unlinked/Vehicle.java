package unlinked;

import java.util.ArrayList;

public class Vehicle {
	
	private String VSAMP;
	private String SAMPN;
	private String VEHNO;
	private String YEAR;
	private String BODY;
	private String O_BODY;
	private String FUEL;
	private String O_FUEL;
	private String EZPAS;
	private String CNTV;
	private String O_CNTV;
	private String HH1;
	private String HH_WHT2;
	
	public Vehicle(ArrayList<String>attributes)
	{
		setVSAMP(attributes.get(0));
		setSAMPN(attributes.get(1));
		setVEHNO(attributes.get(2));
		setYEAR(attributes.get(3));
		setBODY(attributes.get(4));
		setO_BODY(attributes.get(5));
		setFUEL(attributes.get(6));
		setO_FUEL(attributes.get(7));
		setEZPAS(attributes.get(8));
		setCNTV(attributes.get(9));
		setO_CNTV(attributes.get(10));
		setHH1(attributes.get(11));
		setHH_WHT2(attributes.get(12));
				
		
	}

	public String getVSAMP() {
		return VSAMP;
	}

	public void setVSAMP(String vSAMP) {
		VSAMP = vSAMP;
	}

	public String getSAMPN() {
		return SAMPN;
	}

	public void setSAMPN(String sAMPN) {
		SAMPN = sAMPN;
	}

	public String getVEHNO() {
		return VEHNO;
	}

	public void setVEHNO(String vEHNO) {
		VEHNO = vEHNO;
	}

	public String getYEAR() {
		return YEAR;
	}

	public void setYEAR(String yEAR) {
		YEAR = yEAR;
	}

	public String getBODY() {
		return BODY;
	}

	public void setBODY(String bODY) {
		BODY = bODY;
	}

	public String getO_BODY() {
		return O_BODY;
	}

	public void setO_BODY(String o_BODY) {
		O_BODY = o_BODY;
	}

	public String getFUEL() {
		return FUEL;
	}

	public void setFUEL(String fUEL) {
		FUEL = fUEL;
	}

	public String getO_FUEL() {
		return O_FUEL;
	}

	public void setO_FUEL(String o_FUEL) {
		O_FUEL = o_FUEL;
	}

	public String getEZPAS() {
		return EZPAS;
	}

	public void setEZPAS(String eZPAS) {
		EZPAS = eZPAS;
	}

	public String getCNTV() {
		return CNTV;
	}

	public void setCNTV(String cNTV) {
		CNTV = cNTV;
	}

	public String getO_CNTV() {
		return O_CNTV;
	}

	public void setO_CNTV(String o_CNTV) {
		O_CNTV = o_CNTV;
	}

	public String getHH1() {
		return HH1;
	}

	public void setHH1(String hH1) {
		HH1 = hH1;
	}

	public String getHH_WHT2() {
		return HH_WHT2;
	}

	public void setHH_WHT2(String hH_WHT2) {
		HH_WHT2 = hH_WHT2;
	}
	
}
