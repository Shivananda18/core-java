package com.xworkz.Banks;

import com.xworkz.RbiBank.RbiBank;

public class HSBCBank extends RbiBank {


    @Override
    public  String AadhaarBiometricAuthenticatable(){
        return "AadhaarBiometricAuthenticatable for HSBCBank ";
    }
    @Override
    public String AadhaarOtpVerifiable() {
        return "AadhaarOtpVerifiable for HSBCBank";
    }
    @Override
    public String OfflineAadhaarXmlValidator() {
        return "OfflineAadhaarXmlValidator for HSBCBank";
    }
    @Override
    public String AadhaarAddressOverride() {
        return "AadhaarAddressOverride fro HSBCBank";
    }
    @Override
    public String AadhaarMaskingEnforcer() {
        return "AadhaarMaskingEnforcer for HSBCBank";
    }
    @Override
    public String PanCardOcrValidator() {
        return "PanCardOcrValidator for HSBCBank";
    }
    @Override
    public int MobileNumberLinkable() {
        return 0;
    }
    @Override
    public String MinorToMajorStatusConverter() {
        return "MinorToMajorStatusConverter for HSBCBank";
    }
    @Override
    public String DeceasedAccountSettlement() {
        return "DeceasedAccountSettlement for HSBCBank";
    }
    @Override
    public String RiskProfileEscalator() {
        return "RiskProfileEscalator for HSBCBank";
    }

    @Override
    public String InoperativeAccountFreezer() {
        return "InoperativeAccountFreezer for HSBCBank";
    }

    @Override
    public String PartialFreezeEnforcer() {
        return "PartialFreezeEnforcer for HSBCBank";
    }

    @Override
    public String DormantAccountReactivator() {
        return "DormantAccountReactivator for HSBCBank";
    }

    @Override
    public String LienMarkingManager() {
        return "LienMarkingManager for HSBCBank";
    }

    @Override
    public String UnclaimedDepositMigrator() {
        return "UnclaimedDepositMigrator for HSBCBank";
    }

    @Override
    public String DailyTransactionLimiter() {
        return " DailyTransactionLimiter for HSBCBank";
    }

    @Override
    public String CrossBorderRemittanceScanner() {
        return "CrossBorderRemittanceScanner for HSBCBank";
    }

    @Override
    public String HighValueCashReporter() {
        return "HighValueCashReporter for HSBCBank";
    }

    @Override
    public String CardLimitCustomizer() {
        return "CardLimitCustomizer for HSBCBank";
    }

    @Override
    public String DigitalWalletInteroperable() {
        return "DigitalWalletInteroperable for HSBCBank";
    }

    @Override
    public String AdvanceKycNotifier() {
        return "AdvanceKycNotifier for HSBCBank";
    }

    @Override
    public String FailedDispenseReverser() {
        return "FailedDispenseReverser for HSBCBank";
    }

    @Override
    public String FraudAlertDisseminator() {
        return "FraudAlertDisseminator for HSBCBank";
    }

    @Override
    public String ConsentRecordKeeper() {
        return "ConsentRecordKeeper for HSBCBank";
    }

    @Override
    public String AuditTrailArchiver() {
        return "AuditTrailArchiver for HSBCBank";
    }
}
