package unlinked;

import java.util.ArrayList;


public class UnlinkedTrip {
	
	private String PLSAM;
	private String SAMPN;
	private String PERNO;
	private String PLANO; 
	private String ORIG_HOME;
	
	private String GTYPE;
	private String HHSIZE;
	private String DHOME;
	private String TRIPNO; 
	private String LTRIPNO;
	
	private String LINKFLAG;
	private String TOUR_ID;
	private String DOW;
	private String HTAZ; 
	private String HTRACT;
	
	private String OTAZ;
	private String DTAZ;
	private String NO_TAZ;
	private String OTPURP; 
	private String DT_PURP;
	
	private String OTPURP_AGG;
	private String DTPURP_AGG;
	private String DTPUR2;
	private String ULTMODE; 
	private String LTMODE_AGG;
	
	private String MODE_SAMP;
	private String TOTTR;
	private String HHMEM;
	private String PER1; 
	private String PER2;
	
	private String PER3;
	private String PER4;
	private String PER5;
	private String NONHH; 
	private String VEHNO;
	
	private String DYGOV;
	private String PLOC;
	private String PRKTY;
	private String PAYPK; 
	private String PKAMT;
	
	private String PKUNT;
	private String TOLFT;
	private String TLONB;
	private String TLFC1; 
	private String TOPN1;
	
	private String TOLE1;
	private String TOLEX1;
	private String TLLC1;
	private String TLFR1; 
	private String TLFC2_HOME;
	
	private String TOPN2;
	private String TOLE2;
	private String TOLX2;
	private String TLLC2; 
	private String TLFR2;
	
	private String TLFC3;
	private String TOPN3_ID;
	private String TOLE3;
	private String TOLX3; 
	private String TLLC3;
	
	private String TLFR3;
	private String OTLFR3;
	private String ROUTE;
	private String SERVC; 
	private String FARE;
	
	private String FAREC;
	private String BUSPS;
	private String MTABP;
	private String BPFAR; 
	private String FRBAS;
	
	private String TRP_DEP_HR;
	private String TRP_ARR_HR;
	private String TRP_DEP_MIN;
	private String TRP_ARR_MIN; 
	private String TRPDUR;

	private String ACTDUR;
	private String TRIPDIST;
	private String OTRACT;
	private String DTRACT; 
	private String OMCD;
	
	private String DMCD;
	private String OZIP;
	private String DZIP;
	private String UNIQUEID1; 
	private String UNIQUEID2;
	
	private String HH1;
	private String HH_WHT2;
	private String TOURFAC;
	private String WHT_FAC3; 
	private String HCOUNTY;
	
	private String HCITY_MCD;
	private String HSTATE;
	private String HZIP;
	private String HNYC; 
	private String HMPO;
	
	private String ONYC;
	private String OMPO;
	private String DNYC;
	private String DMPO; 
	private String GEO_GROUP1_O;
	
	private String GEO_GROUP2_O;
	private String GEO_GROUP3_O;
	private String GEO_GROUP1_D;
	private String GEO_GROUP2_D;
	private String GEO_GROUP3_D; 
	
	private String ADJ_COUNTY;
	private String OCOUNTY;
	private String DCOUNTY;

	public UnlinkedTrip(ArrayList<String>attributes) 
		{
		
			
			setPLSAM((String)attributes.get(UTHeaderIndices.PLSAM_IDX));
			setSAMPN((String)attributes.get(UTHeaderIndices.SAMPN_IDX));
			setPERNO((String)attributes.get(UTHeaderIndices.PERNO_IDX));
			setPLANO((String)attributes.get(UTHeaderIndices.PLANO_IDX)); 
			setORIG_HOME((String)attributes.get(UTHeaderIndices.ORIG_HOME_IDX));
			
			setGTYPE((String)attributes.get(UTHeaderIndices.GTYPE_IDX));
			setHHSIZE((String)attributes.get(UTHeaderIndices.HHSIZE_IDX));
			setDHOME((String)attributes.get(UTHeaderIndices.DHOME_IDX));
			setTRIPNO((String)attributes.get(UTHeaderIndices.TRIPNO_IDX)); 
			setLTRIPNO((String)attributes.get(UTHeaderIndices.LTRIPNO_IDX));
			
			setLINKFLAG((String)attributes.get(UTHeaderIndices.LINKFLAG_IDX));
			setTOUR_ID((String)attributes.get(UTHeaderIndices.TOUR_ID_IDX)); 
			setDOW((String)attributes.get(UTHeaderIndices.DOW_IDX));
			setHTAZ((String)attributes.get(UTHeaderIndices.HTAZ_IDX)); 
			setHTRACT((String)attributes.get(UTHeaderIndices.HTRACT_IDX));
			
			setOTAZ((String)attributes.get(UTHeaderIndices.OTAZ_IDX));
			setDTAZ((String)attributes.get(UTHeaderIndices.DTAZ_IDX));
			setNO_TAZ((String)attributes.get(UTHeaderIndices.NO_TAZ_IDX));
			setOTPURP((String)attributes.get(UTHeaderIndices.OTPURP_IDX)); 
			setDT_PURP((String)attributes.get(UTHeaderIndices.DT_PURP_IDX));
			
			setOTPURP_AGG((String)attributes.get(UTHeaderIndices.OTPURP_AGG_IDX));
			setDTPURP_AGG((String)attributes.get(UTHeaderIndices.DTPURP_AGG_IDX));
			setDTPUR2((String)attributes.get(UTHeaderIndices.DTPUR2_IDX));
			setULTMODE((String)attributes.get(UTHeaderIndices.ULTMODE_IDX)); 
			setLTMODE_AGG((String)attributes.get(UTHeaderIndices.LTMODE_AGG_IDX));
			
			setMODE_SAMP((String)attributes.get(UTHeaderIndices.MODE_SAMP_IDX));
			setTOTTR((String)attributes.get(UTHeaderIndices.TOTTR_IDX));
			setHHMEM((String)attributes.get(UTHeaderIndices.HHMEM_IDX));
			setPER1((String)attributes.get(UTHeaderIndices.PER1_IDX)); 
			setPER2((String)attributes.get(UTHeaderIndices.PER2_IDX));
			
			setPER3((String)attributes.get(UTHeaderIndices.PER3_IDX));
			setPER4((String)attributes.get(UTHeaderIndices.PER4_IDX));
			setPER5((String)attributes.get(UTHeaderIndices.PER5_IDX));
			setNONHH((String)attributes.get(UTHeaderIndices.NONHH_IDX)); 
			setVEHNO((String)attributes.get(UTHeaderIndices.VEHNO_IDX));
			
			setDYGOV((String)attributes.get(UTHeaderIndices.DYGOV_IDX));
			setPLOC((String)attributes.get(UTHeaderIndices.PLOC_IDX));
			setPRKTY((String)attributes.get(UTHeaderIndices.PRKTY_IDX));
			setPAYPK((String)attributes.get(UTHeaderIndices.PAYPK_IDX)); 
			setPKAMT((String)attributes.get(UTHeaderIndices.PKAMT_IDX));
			
			setPKUNT((String)attributes.get(UTHeaderIndices.PKUNT_IDX));
			setTOLFT((String)attributes.get(UTHeaderIndices.TOLFT_IDX));
			setTLONB((String)attributes.get(UTHeaderIndices.TLONB_IDX));
			setTLFC1((String)attributes.get(UTHeaderIndices.TLFC1_IDX)); 
			setTOPN1((String)attributes.get(UTHeaderIndices.TOPN1_IDX));
			
			setTOLE1((String)attributes.get(UTHeaderIndices.TOLE1_IDX));
			setTOLEX1((String)attributes.get(UTHeaderIndices.TOLEX1_IDX));
			setTLLC1((String)attributes.get(UTHeaderIndices.TLLC1_IDX));
			setTLFR1((String)attributes.get(UTHeaderIndices.TLFR1_IDX)); 
			setTLFC2_HOME((String)attributes.get(UTHeaderIndices.TLFC2_HOME_IDX));
			
			setTOPN2((String)attributes.get(UTHeaderIndices.TOPN2_IDX));
			setTOLE2((String)attributes.get(UTHeaderIndices.TOLE2_IDX));
			setTOLX2((String)attributes.get(UTHeaderIndices.TOLX2_IDX));
			setTLLC2((String)attributes.get(UTHeaderIndices.TLLC2_IDX)); 
			setTLFR2((String)attributes.get(UTHeaderIndices.TLFR2_IDX));
			
			setTLFC3((String)attributes.get(UTHeaderIndices.TLFC3_IDX));
			setTOPN3_ID((String)attributes.get(UTHeaderIndices.TOPN3_ID_IDX));
			setTOLE3((String)attributes.get(UTHeaderIndices.TOLE3_IDX));
			setTOLX3((String)attributes.get(UTHeaderIndices.TOLX3_IDX)); 
			setTLLC3((String)attributes.get(UTHeaderIndices.TLLC3_IDX));
			
			setTLFR3((String)attributes.get(UTHeaderIndices.TLFR3_IDX));
			setOTLFR3((String)attributes.get(UTHeaderIndices.OTLFR3_IDX));
			setROUTE((String)attributes.get(UTHeaderIndices.ROUTE_IDX));
			setSERVC((String)attributes.get(UTHeaderIndices.SERVC_IDX)); 
			setFARE((String)attributes.get(UTHeaderIndices.FARE_IDX));
			
			setFAREC((String)attributes.get(UTHeaderIndices.FAREC_IDX));
			setBUSPS((String)attributes.get(UTHeaderIndices.BUSPS_IDX));
			setMTABP((String)attributes.get(UTHeaderIndices.MTABP_IDX));
			setBPFAR((String)attributes.get(UTHeaderIndices.BPFAR_IDX)); 
			setFRBAS((String)attributes.get(UTHeaderIndices.FRBAS_IDX));
			
			setTRP_DEP_HR((String)attributes.get(UTHeaderIndices.TRP_DEP_HR_IDX));
			setTRP_ARR_HR((String)attributes.get(UTHeaderIndices.TRP_ARR_HR_IDX));
			setTRP_DEP_MIN((String)attributes.get(UTHeaderIndices.TRP_DEP_MIN_IDX));
			setTRP_ARR_MIN((String)attributes.get(UTHeaderIndices.TRP_ARR_MIN_IDX)); 
			setTRPDUR((String)attributes.get(UTHeaderIndices.TRPDUR_IDX));

			setACTDUR((String)attributes.get(UTHeaderIndices.ACTDUR_IDX));
			setTRIPDIST((String)attributes.get(UTHeaderIndices.TRIPDIST_IDX));
			setOTRACT((String)attributes.get(UTHeaderIndices.OTRACT_IDX));
			setDTRACT((String)attributes.get(UTHeaderIndices.DTRACT_IDX)); 
			setOMCD((String)attributes.get(UTHeaderIndices.OMCD_IDX));
			
			setDMCD((String)attributes.get(UTHeaderIndices.DMCD_IDX));
			setOZIP((String)attributes.get(UTHeaderIndices.OZIP_IDX));
			setDZIP((String)attributes.get(UTHeaderIndices.DZIP_IDX));
			setUNIQUEID1((String)attributes.get(UTHeaderIndices.UNIQUEID1_IDX)); 
			setUNIQUEID2((String)attributes.get(UTHeaderIndices.UNIQUEID2_IDX));
			
			setHH1((String)attributes.get(UTHeaderIndices.HH1_IDX));
			setHH_WHT2((String)attributes.get(UTHeaderIndices.HH_WHT2_IDX));
			setTOURFAC((String)attributes.get(UTHeaderIndices.TOURFAC_IDX));
			setWHT_FAC3((String)attributes.get(UTHeaderIndices.WHT_FAC3_IDX)); 
			setHCOUNTY((String)attributes.get(UTHeaderIndices.HCOUNTY_IDX));
			
			setHCITY_MCD((String)attributes.get(UTHeaderIndices.HCITY_MCD_IDX));
			setHSTATE((String)attributes.get(UTHeaderIndices.HSTATE_IDX));
			setHZIP((String)attributes.get(UTHeaderIndices.HZIP_IDX));
			setHNYC((String)attributes.get(UTHeaderIndices.HNYC_IDX)); 
			setHMPO((String)attributes.get(UTHeaderIndices.HMPO_IDX));
			
			setONYC((String)attributes.get(UTHeaderIndices.ONYC_IDX));
			setOMPO((String)attributes.get(UTHeaderIndices.OMPO_IDX));
			setDNYC((String)attributes.get(UTHeaderIndices.DNYC_IDX));
			setDMPO((String)attributes.get(UTHeaderIndices.DMPO_IDX)); 
			setGEO_GROUP1_O((String)attributes.get(UTHeaderIndices.GEO_GROUP1_O_IDX));
			
			setGEO_GROUP2_O((String)attributes.get(UTHeaderIndices.GEO_GROUP2_O_IDX));
			setGEO_GROUP3_O((String)attributes.get(UTHeaderIndices.GEO_GROUP3_O_IDX));
			setGEO_GROUP1_D((String)attributes.get(UTHeaderIndices.GEO_GROUP1_D_IDX));
			setGEO_GROUP2_D((String)attributes.get(UTHeaderIndices.GEO_GROUP2_D_IDX));
			setGEO_GROUP3_D((String)attributes.get(UTHeaderIndices.GEO_GROUP3_D_IDX)); 
			
			setADJ_COUNTY((String)attributes.get(UTHeaderIndices.ADJ_COUNTY_IDX));
			setOCOUNTY((String)attributes.get(UTHeaderIndices.OCOUNTY_IDX));
			setDCOUNTY((String)attributes.get(UTHeaderIndices.DCOUNTY_IDX));
			
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

	public String getGTYPE() {
		return GTYPE;
	}

	public void setGTYPE(String gTYPE) {
		GTYPE = gTYPE;
	}

	public String getHHSIZE() {
		return HHSIZE;
	}

	public void setHHSIZE(String hHSIZE) {
		HHSIZE = hHSIZE;
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

	public String getLTRIPNO() {
		return LTRIPNO;
	}

	public void setLTRIPNO(String lTRIPNO) {
		LTRIPNO = lTRIPNO;
	}

	public String getLINKFLAG() {
		return LINKFLAG;
	}

	public void setLINKFLAG(String lINKFLAG) {
		LINKFLAG = lINKFLAG;
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

	public String getHTRACT() {
		return HTRACT;
	}

	public void setHTRACT(String hTRACT) {
		HTRACT = hTRACT;
	}

	public String getHTAZ() {
		return HTAZ;
	}

	public void setHTAZ(String hTAZ) {
		HTAZ = hTAZ;
	}

	public String getOTAZ() {
		return OTAZ;
	}

	public void setOTAZ(String oTAZ) {
		OTAZ = oTAZ;
	}

	public String getDTAZ() {
		return DTAZ;
	}

	public void setDTAZ(String dTAZ) {
		DTAZ = dTAZ;
	}

	public String getNO_TAZ() {
		return NO_TAZ;
	}

	public void setNO_TAZ(String nO_TAZ) {
		NO_TAZ = nO_TAZ;
	}

	public String getOTPURP() {
		return OTPURP;
	}

	public void setOTPURP(String oTPURP) {
		OTPURP = oTPURP;
	}

	public String getDT_PURP() {
		return DT_PURP;
	}

	public void setDT_PURP(String dT_PURP) {
		DT_PURP = dT_PURP;
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

	public String getDTPUR2() {
		return DTPUR2;
	}

	public void setDTPUR2(String dTPUR2) {
		DTPUR2 = dTPUR2;
	}

	public String getULTMODE() {
		return ULTMODE;
	}

	public void setULTMODE(String uLTMODE) {
		ULTMODE = uLTMODE;
	}

	public String getLTMODE_AGG() {
		return LTMODE_AGG;
	}

	public void setLTMODE_AGG(String lTMODE_AGG) {
		LTMODE_AGG = lTMODE_AGG;
	}

	public String getMODE_SAMP() {
		return MODE_SAMP;
	}

	public void setMODE_SAMP(String mODE_SAMP) {
		MODE_SAMP = mODE_SAMP;
	}

	public String getTOTTR() {
		return TOTTR;
	}

	public void setTOTTR(String tOTTR) {
		TOTTR = tOTTR;
	}

	public String getHHMEM() {
		return HHMEM;
	}

	public void setHHMEM(String hHMEM) {
		HHMEM = hHMEM;
	}

	public String getPER2() {
		return PER2;
	}

	public void setPER2(String pER2) {
		PER2 = pER2;
	}

	public String getPER1() {
		return PER1;
	}

	public void setPER1(String pER1) {
		PER1 = pER1;
	}

	public String getPER3() {
		return PER3;
	}

	public void setPER3(String pER3) {
		PER3 = pER3;
	}

	public String getPER4() {
		return PER4;
	}

	public void setPER4(String pER4) {
		PER4 = pER4;
	}

	public String getPER5() {
		return PER5;
	}

	public void setPER5(String pER5) {
		PER5 = pER5;
	}

	public String getNONHH() {
		return NONHH;
	}

	public void setNONHH(String nONHH) {
		NONHH = nONHH;
	}

	public String getVEHNO() {
		return VEHNO;
	}

	public void setVEHNO(String vEHNO) {
		VEHNO = vEHNO;
	}

	public String getDYGOV() {
		return DYGOV;
	}

	public void setDYGOV(String dYGOV) {
		DYGOV = dYGOV;
	}

	public String getPLOC() {
		return PLOC;
	}

	public void setPLOC(String pLOC) {
		PLOC = pLOC;
	}

	public String getPAYPK() {
		return PAYPK;
	}

	public void setPAYPK(String pAYPK) {
		PAYPK = pAYPK;
	}

	public String getPRKTY() {
		return PRKTY;
	}

	public void setPRKTY(String pRKTY) {
		PRKTY = pRKTY;
	}

	public String getPKAMT() {
		return PKAMT;
	}

	public void setPKAMT(String pKAMT) {
		PKAMT = pKAMT;
	}

	public String getPKUNT() {
		return PKUNT;
	}

	public void setPKUNT(String pKUNT) {
		PKUNT = pKUNT;
	}

	public String getTOLFT() {
		return TOLFT;
	}

	public void setTOLFT(String tOLFT) {
		TOLFT = tOLFT;
	}

	public String getTLONB() {
		return TLONB;
	}

	public void setTLONB(String tLONB) {
		TLONB = tLONB;
	}

	public String getTLFC1() {
		return TLFC1;
	}

	public void setTLFC1(String tLFC1) {
		TLFC1 = tLFC1;
	}

	public String getTOPN1() {
		return TOPN1;
	}

	public void setTOPN1(String tOPN1) {
		TOPN1 = tOPN1;
	}

	public String getTOLE1() {
		return TOLE1;
	}

	public void setTOLE1(String tOLE1) {
		TOLE1 = tOLE1;
	}

	public String getTOLEX1() {
		return TOLEX1;
	}

	public void setTOLEX1(String tOLEX1) {
		TOLEX1 = tOLEX1;
	}

	public String getTLLC1() {
		return TLLC1;
	}

	public void setTLLC1(String tLLC1) {
		TLLC1 = tLLC1;
	}

	public String getTLFR1() {
		return TLFR1;
	}

	public void setTLFR1(String tLFR1) {
		TLFR1 = tLFR1;
	}

	public String getTLFC2_HOME() {
		return TLFC2_HOME;
	}

	public void setTLFC2_HOME(String tLFC2_HOME) {
		TLFC2_HOME = tLFC2_HOME;
	}

	public String getTOPN2() {
		return TOPN2;
	}

	public void setTOPN2(String tOPN2) {
		TOPN2 = tOPN2;
	}

	public String getTOLE2() {
		return TOLE2;
	}

	public void setTOLE2(String tOLE2) {
		TOLE2 = tOLE2;
	}

	public String getTOLX2() {
		return TOLX2;
	}

	public void setTOLX2(String tOLX2) {
		TOLX2 = tOLX2;
	}

	public String getTLLC2() {
		return TLLC2;
	}

	public void setTLLC2(String tLLC2) {
		TLLC2 = tLLC2;
	}

	public String getTLFR2() {
		return TLFR2;
	}

	public void setTLFR2(String tLFR2) {
		TLFR2 = tLFR2;
	}

	public String getTLFC3() {
		return TLFC3;
	}

	public void setTLFC3(String tLFC3) {
		TLFC3 = tLFC3;
	}

	public String getTOPN3_ID() {
		return TOPN3_ID;
	}

	public void setTOPN3_ID(String tOPN3_ID) {
		TOPN3_ID = tOPN3_ID;
	}

	public String getTOLE3() {
		return TOLE3;
	}

	public void setTOLE3(String tOLE3) {
		TOLE3 = tOLE3;
	}

	public String getTOLX3() {
		return TOLX3;
	}

	public void setTOLX3(String tOLX3) {
		TOLX3 = tOLX3;
	}

	public String getTLLC3() {
		return TLLC3;
	}

	public void setTLLC3(String tLLC3) {
		TLLC3 = tLLC3;
	}

	public String getTLFR3() {
		return TLFR3;
	}

	public void setTLFR3(String tLFR3) {
		TLFR3 = tLFR3;
	}

	public String getOTLFR3() {
		return OTLFR3;
	}

	public void setOTLFR3(String oTLFR3) {
		OTLFR3 = oTLFR3;
	}

	public String getROUTE() {
		return ROUTE;
	}

	public void setROUTE(String rOUTE) {
		ROUTE = rOUTE;
	}

	public String getSERVC() {
		return SERVC;
	}

	public void setSERVC(String sERVC) {
		SERVC = sERVC;
	}

	public String getFARE() {
		return FARE;
	}

	public void setFARE(String fARE) {
		FARE = fARE;
	}

	public String getFAREC() {
		return FAREC;
	}

	public void setFAREC(String fAREC) {
		FAREC = fAREC;
	}

	public String getBUSPS() {
		return BUSPS;
	}

	public void setBUSPS(String bUSPS) {
		BUSPS = bUSPS;
	}

	public String getMTABP() {
		return MTABP;
	}

	public void setMTABP(String mTABP) {
		MTABP = mTABP;
	}

	public String getBPFAR() {
		return BPFAR;
	}

	public void setBPFAR(String bPFAR) {
		BPFAR = bPFAR;
	}

	public String getFRBAS() {
		return FRBAS;
	}

	public void setFRBAS(String fRBAS) {
		FRBAS = fRBAS;
	}

	public String getTRP_DEP_HR() {
		return TRP_DEP_HR;
	}

	public void setTRP_DEP_HR(String tRP_DEP_HR) {
		TRP_DEP_HR = tRP_DEP_HR;
	}

	public String getTRP_ARR_HR() {
		return TRP_ARR_HR;
	}

	public void setTRP_ARR_HR(String tRP_ARR_HR) {
		TRP_ARR_HR = tRP_ARR_HR;
	}

	public String getTRP_DEP_MIN() {
		return TRP_DEP_MIN;
	}

	public void setTRP_DEP_MIN(String tRP_DEP_MIN) {
		TRP_DEP_MIN = tRP_DEP_MIN;
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

	public String getOTRACT() {
		return OTRACT;
	}

	public void setOTRACT(String oTRACT) {
		OTRACT = oTRACT;
	}

	public String getDTRACT() {
		return DTRACT;
	}

	public void setDTRACT(String dTRACT) {
		DTRACT = dTRACT;
	}

	public String getOMCD() {
		return OMCD;
	}

	public void setOMCD(String oMCD) {
		OMCD = oMCD;
	}

	public String getDMCD() {
		return DMCD;
	}

	public void setDMCD(String dMCD) {
		DMCD = dMCD;
	}

	public String getOZIP() {
		return OZIP;
	}

	public void setOZIP(String oZIP) {
		OZIP = oZIP;
	}

	public String getDZIP() {
		return DZIP;
	}

	public void setDZIP(String dZIP) {
		DZIP = dZIP;
	}

	public String getUNIQUEID1() {
		return UNIQUEID1;
	}

	public void setUNIQUEID1(String uNIQUEID1) {
		UNIQUEID1 = uNIQUEID1;
	}

	public String getUNIQUEID2() {
		return UNIQUEID2;
	}

	public void setUNIQUEID2(String uNIQUEID2) {
		UNIQUEID2 = uNIQUEID2;
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

	public String getTOURFAC() {
		return TOURFAC;
	}

	public void setTOURFAC(String tOURFAC) {
		TOURFAC = tOURFAC;
	}

	public String getWHT_FAC3() {
		return WHT_FAC3;
	}

	public void setWHT_FAC3(String wHT_FAC3) {
		WHT_FAC3 = wHT_FAC3;
	}

	public String getHCOUNTY() {
		return HCOUNTY;
	}

	public void setHCOUNTY(String hCOUNTY) {
		HCOUNTY = hCOUNTY;
	}

	public String getHCITY_MCD() {
		return HCITY_MCD;
	}

	public void setHCITY_MCD(String hCITY) {
		HCITY_MCD = hCITY;
	}

	public String getHSTATE() {
		return HSTATE;
	}

	public void setHSTATE(String hSTATE) {
		HSTATE = hSTATE;
	}

	public String getHZIP() {
		return HZIP;
	}

	public void setHZIP(String hZIP) {
		HZIP = hZIP;
	}

	public String getHNYC() {
		return HNYC;
	}

	public void setHNYC(String hNYC) {
		HNYC = hNYC;
	}

	public String getHMPO() {
		return HMPO;
	}

	public void setHMPO(String hMPO) {
		HMPO = hMPO;
	}

	public String getONYC() {
		return ONYC;
	}

	public void setONYC(String oNYC) {
		ONYC = oNYC;
	}

	public String getOMPO() {
		return OMPO;
	}

	public void setOMPO(String oMPO) {
		OMPO = oMPO;
	}

	public String getDNYC() {
		return DNYC;
	}

	public void setDNYC(String dNYC) {
		DNYC = dNYC;
	}

	public String getDMPO() {
		return DMPO;
	}

	public void setDMPO(String dMPO) {
		DMPO = dMPO;
	}

	public String getGEO_GROUP1_O() {
		return GEO_GROUP1_O;
	}

	public void setGEO_GROUP1_O(String gEO_GROUP1_O) {
		GEO_GROUP1_O = gEO_GROUP1_O;
	}

	public String getGEO_GROUP2_O() {
		return GEO_GROUP2_O;
	}

	public void setGEO_GROUP2_O(String gEO_GROUP2_O) {
		GEO_GROUP2_O = gEO_GROUP2_O;
	}

	public String getGEO_GROUP3_O() {
		return GEO_GROUP3_O;
	}

	public void setGEO_GROUP3_O(String gEO_GROUP3_O) {
		GEO_GROUP3_O = gEO_GROUP3_O;
	}

	public String getGEO_GROUP1_D() {
		return GEO_GROUP1_D;
	}

	public void setGEO_GROUP1_D(String gEO_GROUP1_D) {
		GEO_GROUP1_D = gEO_GROUP1_D;
	}

	public String getGEO_GROUP2_D() {
		return GEO_GROUP2_D;
	}

	public void setGEO_GROUP2_D(String gEO_GROUP2_D) {
		GEO_GROUP2_D = gEO_GROUP2_D;
	}

	public String getGEO_GROUP3_D() {
		return GEO_GROUP3_D;
	}

	public void setGEO_GROUP3_D(String gEO_GROUP3_D) {
		GEO_GROUP3_D = gEO_GROUP3_D;
	}

	public String getADJ_COUNTY() {
		return ADJ_COUNTY;
	}

	public void setADJ_COUNTY(String aDJ_COUNTY) {
		ADJ_COUNTY = aDJ_COUNTY;
	}

	public String getOCOUNTY() {
		return OCOUNTY;
	}

	public void setOCOUNTY(String oCOUNTY) {
		OCOUNTY = oCOUNTY;
	}

	public String getDCOUNTY() {
		return DCOUNTY;
	}

	public void setDCOUNTY(String dCOUNTY) {
		DCOUNTY = dCOUNTY;
	}



}
