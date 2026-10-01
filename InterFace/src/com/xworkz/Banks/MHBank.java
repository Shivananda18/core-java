package com.xworkz.Banks;

public class MHBank extends SbiBank{

    @Override
    public  String AadhaarBiometricAuthenticatable(){
        return "AadhaarBiometricAuthenticatable for MHBank ";
    }
    @Override
    public String AadhaarOtpVerifiable() {
        return "AadhaarOtpVerifiable for MHBank";
    }
    @Override
    public String OfflineAadhaarXmlValidator() {
        return "OfflineAadhaarXmlValidator for MHBank";
    }
    @Override
    public String AadhaarAddressOverride() {
        return "AadhaarAddressOverride fro MHBank";
    }
    @Override
    public String AadhaarMaskingEnforcer() {
        return "AadhaarMaskingEnforcer for MHBank";
    }
    @Override
    public String PanCardOcrValidator() {
        return "PanCardOcrValidator for MHBank";
    }
    @Override
    public int MobileNumberLinkable() {
        return 0;
    }
    @Override
    public String MinorToMajorStatusConverter() {
        return "MinorToMajorStatusConverter for MHBank";
    }
    @Override
    public String DeceasedAccountSettlement() {
        return "DeceasedAccountSettlement for MHBank";
    }
    @Override
    public String RiskProfileEscalator() {
        return "RiskProfileEscalator for MHBank";
    }

    @Override
    public String InoperativeAccountFreezer() {
        return "InoperativeAccountFreezer for MHBank";
    }

    @Override
    public String PartialFreezeEnforcer() {
        return "PartialFreezeEnforcer for MHBank";
    }

    @Override
    public String DormantAccountReactivator() {
        return "DormantAccountReactivator for MHBank";
    }

    @Override
    public String LienMarkingManager() {
        return "LienMarkingManager for MHBank";
    }

    @Override
    public String UnclaimedDepositMigrator() {
        return "UnclaimedDepositMigrator for MHBank";
    }

    @Override
    public String DailyTransactionLimiter() {
        return " DailyTransactionLimiter for MHBank";
    }

    @Override
    public String CrossBorderRemittanceScanner() {
        return "CrossBorderRemittanceScanner for MHBank";
    }

    @Override
    public String HighValueCashReporter() {
        return "HighValueCashReporter for MHBank";
    }

    @Override
    public String CardLimitCustomizer() {
        return "CardLimitCustomizer for MHBank";
    }

    @Override
    public String DigitalWalletInteroperable() {
        return "DigitalWalletInteroperable for MHBank";
    }

    @Override
    public String AdvanceKycNotifier() {
        return "AdvanceKycNotifier for MHBank";
    }

    @Override
    public String FailedDispenseReverser() {
        return "FailedDispenseReverser for MHBank";
    }

    @Override
    public String FraudAlertDisseminator() {
        return "FraudAlertDisseminator for MHBank";
    }

    @Override
    public String ConsentRecordKeeper() {
        return "ConsentRecordKeeper for MHBank";
    }

    @Override
    public String AuditTrailArchiver() {
        return "AuditTrailArchiver for MHBank";
    }

    @Override
    public void insert() {
        System.out.println("hi");
    }
}
