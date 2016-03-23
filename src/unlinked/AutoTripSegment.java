package unlinked;

public class AutoTripSegment{
	
	//Attributes of an unlinked trip we are interested in:
	/* plsam 
	 * sa2pn
	 * perno
	 * plano
	 * origHome
	 * dhome
	 * tripno
	 * tourId
	 * dow
	 * otpurpAgg
	 * dtpurpAgg
	 * ultmode
	 * trpDepHr
	 * trpArrHr
	 * trpDepMin
	 * trpDepHr
	 * trpDur
	 * actDur
	 * tripDist 
	 */
	private String PLSAM;
	private String SAMPN;
	private String PERNO;
	private String PLANO;
	private String ORIG_HOME;
	private String DHOME;
	private String TRIPNO;
	private String LTRIPNO;
	private String TOUR_ID;
	private String DOW;
	private String OTPURP_AGG;
	private String DTPURP_AGG;
	private String ULTMODE;
	private String VEHNO;
	private String TRP_DEP_HR;
	private String TRP_ARR_HR;
	private String TRP_DEP_MIN;
	private String TRP_ARR_MIN;
	private String TRPDUR;
	private String ACTDUR;
	private String TRIPDIST;
	
	AutoTripSegment(UnlinkedTrip unlinkedTripSource)
	{
		if (unlinkedTripSource.getULTMODE().equals("5"))
		{
			setPLSAM(unlinkedTripSource.getPLSAM());
			setSAMPN(unlinkedTripSource.getSAMPN());
			setPERNO(unlinkedTripSource.getPERNO());
			setPLANO(unlinkedTripSource.getPLANO());
			setORIG_HOME(unlinkedTripSource.getORIG_HOME());
			setDHOME(unlinkedTripSource.getDHOME());
			setTRIPNO(unlinkedTripSource.getTRIPNO());
			setLTRIPNO(unlinkedTripSource.getLTRIPNO());
			setTOUR_ID(unlinkedTripSource.getTOUR_ID());
			setDOW(unlinkedTripSource.getDOW());
			setOTPURP_AGG(unlinkedTripSource.getOTPURP_AGG());
			setDTPURP_AGG(unlinkedTripSource.getDTPURP_AGG());
			setULTMODE(unlinkedTripSource.getULTMODE());
			setVEHNO(unlinkedTripSource.getVEHNO());
			setTRP_DEP_HR(unlinkedTripSource.getTRP_DEP_HR());
			setTRP_ARR_HR(unlinkedTripSource.getTRP_ARR_HR());
			setTRP_DEP_MIN(unlinkedTripSource.getTRP_DEP_MIN());
			setTRP_ARR_MIN(unlinkedTripSource.getTRP_ARR_MIN());
			setTRPDUR(unlinkedTripSource.getTRPDUR());
			setACTDUR(unlinkedTripSource.getACTDUR());
			setTRIPDIST(unlinkedTripSource.getTRIPDIST());

		
		}

	}

	public String getPLSAM() {
		return PLSAM;
	}

	public void setPLSAM(String pLSAM) {
		PLSAM = pLSAM;
	}

	public String getSAMPN() {
		return SAMPN;
	}

	public void setSAMPN(String sAMPN) {
		SAMPN = sAMPN;
	}

	public String getPERNO() {
		return PERNO;
	}

	public void setPERNO(String pERNO) {
		PERNO = pERNO;
	}

	public String getPLANO() {
		return PLANO;
	}

	public void setPLANO(String pLANO) {
		PLANO = pLANO;
	}

	public String getORIG_HOME() {
		return ORIG_HOME;
	}

	public void setORIG_HOME(String oRIG_HOME) {
		ORIG_HOME = oRIG_HOME;
	}

	public String getDHOME() {
		return DHOME;
	}

	public void setDHOME(String dHOME) {
		DHOME = dHOME;
	}

	public String getTRIPNO() {
		return TRIPNO;
	}

	public void setTRIPNO(String tRIPNO) {
		TRIPNO = tRIPNO;
	}

	public String getTOUR_ID() {
		return TOUR_ID;
	}

	public void setTOUR_ID(String tOUR_ID) {
		TOUR_ID = tOUR_ID;
	}

	public String getDOW() {
		return DOW;
	}

	public void setDOW(String dOW) {
		DOW = dOW;
	}

	public String getOTPURP_AGG() {
		return OTPURP_AGG;
	}

	public void setOTPURP_AGG(String oTPURP_AGG) {
		OTPURP_AGG = oTPURP_AGG;
	}

	public String getDTPURP_AGG() {
		return DTPURP_AGG;
	}

	public void setDTPURP_AGG(String dTPURP_AGG) {
		DTPURP_AGG = dTPURP_AGG;
	}

	public String getULTMODE() {
		return ULTMODE;
	}

	public void setULTMODE(String uLTMODE) {
		ULTMODE = uLTMODE;
	}

	public String getTRP_DEP_HR() {
		return TRP_DEP_HR;
	}

	public void setTRP_DEP_HR(String tRP_DEP_HR) {
		TRP_DEP_HR = tRP_DEP_HR;
	}

	public String getTRP_DEP_MIN() {
		return TRP_DEP_MIN;
	}

	public void setTRP_DEP_MIN(String tRP_DEP_MIN) {
		TRP_DEP_MIN = tRP_DEP_MIN;
	}

	public String getTRP_ARR_HR() {
		return TRP_ARR_HR;
	}

	public void setTRP_ARR_HR(String tRP_ARR_HR) {
		TRP_ARR_HR = tRP_ARR_HR;
	}

	public String getTRP_ARR_MIN() {
		return TRP_ARR_MIN;
	}

	public void setTRP_ARR_MIN(String tRP_ARR_MIN) {
		TRP_ARR_MIN = tRP_ARR_MIN;
	}

	public String getTRPDUR() {
		return TRPDUR;
	}

	public void setTRPDUR(String tRPDUR) {
		TRPDUR = tRPDUR;
	}

	public String getACTDUR() {
		return ACTDUR;
	}

	public void setACTDUR(String aCTDUR) {
		ACTDUR = aCTDUR;
	}

	public String getTRIPDIST() {
		return TRIPDIST;
	}

	public void setTRIPDIST(String tRIPDIST) {
		TRIPDIST = tRIPDIST;
	}

	public String getVEHNO() {
		return VEHNO;
	}

	public void setVEHNO(String vEHNO) {
		VEHNO = vEHNO;
	}

	public String getLTRIPNO() {
		return LTRIPNO;
	}

	public void setLTRIPNO(String lTRIPNO) {
		LTRIPNO = lTRIPNO;
	}


	

}
