package enums;

public enum ErrorDetails {

    MHW_STAA_IRS2_EAUTH403("EAUTH403", "Authentication is denied: Username or password is incorrect ", "JCSS/IRS2", "Soap header validation"),
    MHW_STAA_IRS2_EAUTH401("EAUTH401", "Authentication is denied: Headers are missing ", "JCSS/IRS2", "Soap header validation"),
    MHW_STAA_IRS2_EAUTH402("EAUTH402", "Authentication is denied: Transaction is not allowed ", "JCSS/IRS2", "Soap header validation"),
    MHW_STAA_IRS2_EAUTH404("EAUTH404", "Authentication is denied: User not found ", "JCSS/IRS2", "Soap header validation"),
    MHW_STAA_IRS2_EAUTH405("EAUTH405", "Authentication is denied: Invalid CSSDBID ", "JCSS/IRS2", "Soap header validation"),
    MHW_STAA_IRS2_EAUTH406("EAUTH406", "Authentication is denied: No profile found ", "JCSS/IRS2", "Soap header validation"),
    MHW_STAA_IRS2_EAUTH407("EAUTH407", "Authentication is denied: Invalid request object ", "JCSS/IRS2", "Soap header validation"),
    MHW_STAA_IRS2_EAUTH408("EAUTH408", "Authentication is denied: Password has expired ", "JCSS/IRS2", "Soap header validation"),
    MHW_STAA_IRS2_EAUTH409("EAUTH409", "Authentication is denied: User is disabled ", "JCSS/IRS2", "Soap header validation"),
    MHW_STAA_IRS2_EUNAT401("EUNAT401", "Unauthorized : Resource not authorized for profile ", "JCSS/IRS2", "Soap header validation"),
    MHW_STAA_IRS2_ERS2001("IRS2001", "CSS-IRS2 Replication Lag exceeds the tolerance Limit ", "JCSS/IRS2", "CSS-IRS2 replication lag [Note: this may not ba applicale in this scenario as there is no fall back]"),
    MHW_STAA_IRS2_ETXJCSS("ETXJCSS", "Error executing Tx ", "JCSS/IRS2", "ESB exection errors"),
    MHW_STAA_IRS2_EVL016("EVL016", "Entry must be FindSumOfElements-Z and/or 0-9 ", "Business", "Line ID format validation"),
    MHW_STAA_IRS2_EVL013("EVL013", "An entry must be made. ", "Business", "Blank entry"),
    MHW_STAA_IRS2_EPA799("EPA799", "Invalid Line ID entered.", "Business", "If user input field ‘Input Line Id’ has invalid value i.e. values other than below mentioned values." +
            "'SGEA' First 4 char" +
            "'OGEA' First 4 char" +
            "'FB' First2 Char" +
            "LL' First2 Char" +
            "Numeric value First2 Char"),
    MHW_STAA_IRS2_EPA796("EPA796", "Line Id is not present on database.", "Business", "If entered value in ‘Input Line Id’ is not present in NSL."),
    MHW_STAA_IRS2_IPA186("IPA186", "NTE Details not found on database.", "Business", "If there is no routing record present for the input private circuit then this message gets populated."),
    MHW_STAA_IRS2_ESY045("ESY045", "xxxxxxxxxxx' cannot be found.", "Business", "If **** table is not present in TAB** record."),
    MHW_STAA_IRS2_EAT009("EAT009", "Enter either National no. or Exchange Name & Tel No.", "", ""),
    MHW_STAA_IRS2_EVL010("EVL010", "Telephone number is too short. 7 digits minimum.", "", ""),
    MHW_STAA_IRS2_EVL018("EVL018", "ENTRY MUST BE FindSumOfElements-Z, 0-9   OR .-,/&()<>%", "", ""),
    MHW_STAA_IRS2_EVL005("EVL005", "Invalid character <Character>.", "", ""),
    MHW_STAA_IRS2_EVL058("EVL058", "Field format invalid - must be AXXX9999999.", "", ""),
    MHW_STAA_IRS2_EVL019("EVL019", "Embedded spaces not allowed.", "", ""),
    MHW_STAA_IRS2_EVL011("EVL011", "Telephone number is too long. 11 digits maximum.", "", ""),
    MHW_STAA_IRS2_EAT002("EAT002", "Telephone number not found.", "", ""),
    MHW_STAA_IRS2_EAT007("EAT007", "Installation not found.", "", ""),
    MHW_STAA_IRS2_EAT074("EAT074", "Number returned/lost-back to OLO. No details can be displayed.", "", ""),
    MHW_STAA_IRS2_EAT010("EAT010", "TABLE (value in WS-MSG-ID) DOES NOT EXIST.", "", ""),
    MHW_STAA_IRS2_EAT011("EAT011", "TABLE HEADER (value in WS-MSG-ID) DOES NOT EXIST", "", ""),
    MHW_STAA_IRS2_EAT051("EAT051", "This number is part of an OLO number range.", "", ""),
    MHW_STAA_IRS2__EVL013("_EVL013", "An entry must be made.", "", ""),
    MHW_STAA_IRS2_EAT045("EAT045", "Table GENSPI is incorrectly set up", "", ""),
    MHW_STAA_IRS2_EAT079("EAT079", "Invalid return from BP242DCS - contact Application Support", "", ""),
    MHW_STAA_IRS2_ESY020("ESY020", "(DM-ERR-TEXT) Not in system. Please contact Application Support.", "", ""),
    MHW_STAA_IRS2_EAT050("EAT050", "BT number ported to OLO.", "", ""),
    MHW_STAA_IRS2_EAT162("EAT162", "This is not a WLR3 installation", "", ""),
    MHW_STAA_IRS2_EER021("EER021", "No Network Service Line record exists for this number", "", ""),
    MHW_STAA_IRS2_EER311("EER311", "This number is a gaining number from an unspecified transfer", "", ""),
    MHW_STAA_IRS2_EER310("EER310", "This number is from a range that is not yet in service", "", ""),
    MHW_STAA_IRS2_EER326("EER326", "Please enter national number", "", ""),
    MHW_STAA_IRS2__EVL005("_EVL005", "Invalid character <Character>.", "", ""),
    MHW_STAA_IRS2__EVL010("_EVL010", "Telephone number is too short. 7 digits minimum.", "", ""),
    MHW_STAA_IRS2__EVL058("_EVL058", "Field format invalid - must be AXXX9999999.", "", ""),
    MHW_STAA_IRS2__EVL018("_EVL018", "ENTRY MUST BE FindSumOfElements-Z, 0-9   OR .-,/&()<>%", "", ""),
    MHW_STAA_IRS2_FSY003("FSY003", "Transaction abandoned due to internal error. Please inform ISU", "", ""),
    MHW_STAA_IRS2_ENP094("ENP094", "OLO Id (input OLD ID) not found", "", ""),
    MHW_STAA_IRS2__ESY045("_ESY045", "INSTALLATION-ID cannot be found.  Check entry & re-try", "", ""),
    MHW_STAA_IRS2_ESY049("ESY049", "ESY049 Please enter consistent params", "", ""),
    MHW_STAA_IRS2_EOH502("EOH502", "Invalid telephone number", "", ""),
    MHW_STAA_IRS2_EOH005("EOH005", "ORDER <ORDER NUMBER> not on the database", "", ""),
    MHW_STAA_IRS2___ESY045("__ESY045", "GIVEN ACC NO cannot be found.  Check entry & re-try", "", ""),
    MHW_STAA_IRS2____ESY045("___ESY045", "NO USER INPUT cannot be found.  Check entry & re-try", "", ""),
    MHW_STAA_IRS2__EVL016("_EVL016", "Entry must be FindSumOfElements-Z,0-9 AND/OR - /", "", ""),
    MHW_STAA_IRS2___EVL005("__EVL005", "Invalid character #", "", ""),
    MHW_STAA_IRS2___EVL010("__EVL010", "Telephone number is too short.  7 digits minimum", "", ""),
    MHW_STAA_IRS2__EVL011("_EVL011", "Telephone number is too long.  11 digits maximum", "", ""),
    MHW_STAA_IRS2_EVL012("EVL012", "Entry must be numeric", "", ""),
    MHW_STAA_IRS2__EVL019("_EVL019", "Embedded spaces not allowed", "", ""),
    MHW_STAA_IRS2__EAT010("_EAT010", "TABLE ATSYSIND DOES NOT EXIST", "", ""),
    MHW_STAA_IRS2__EAT011("_EAT011", "TABLE ATSYSIND HEADER DOES NOT EXIST", "", ""),
    MHW_STAA_IRS2_EAT012("EAT012", "TABLE ATSYSIND KEY DOES NOT EXIST", "", ""),
    MHW_STAA_IRS2_E_503("E_503", "Backend invocation error", "ESB", ""),
    MHW_STAA_IRS2_E_504("E_504", "Backend Timeout", "ESB", ""),
    MHW_STAA_IRS2_E_500("E_500", "Internal Server Error", "ESB", ""),
    ;

    String errorCode;
    String errorText;
    String errorType;
    String errorDesc;

    ErrorDetails(String errorCode, String errorText, String errorType, String errorDesc) {
        this.errorCode = errorCode;
        this.errorText = errorText;
        this.errorType = errorType;
        this.errorDesc = errorDesc;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorText() {
        return errorText;
    }

    public String getErrorType() {
        return errorType;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

}


