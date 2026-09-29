package com.xworkz.Banks;

import com.xworkz.RbiBank.RbiBank;

public class BankOfBaroda extends RbiBank {


    @Override
    public  String AadhaarBiometricAuthenticatable(){
        return "AadhaarBiometricAuthenticatable for BankOfBaroda ";
    }
    @Override
    public String AadhaarOtpVerifiable() {
        return "AadhaarOtpVerifiable for BankOfBaroda";
    }
    @Override
    public String OfflineAadhaarXmlValidator() {
        return "OfflineAadhaarXmlValidator for BankOfBaroda";
    }
    @Override
    public String AadhaarAddressOverride() {
        return "AadhaarAddressOverride fro BankOfBaroda";
    }
    @Override
    public String AadhaarMaskingEnforcer() {
        return "AadhaarMaskingEnforcer for BankOfBaroda";
    }
    @Override
    public String PanCardOcrValidator() {
        return "PanCardOcrValidator for BankOfBaroda";
    }
    @Override
    public int MobileNumberLinkable() {
        return 0;
    }
    @Override
    public String MinorToMajorStatusConverter() {
        return "MinorToMajorStatusConverter for BankOfBaroda";
    }
    @Override
    public String DeceasedAccountSettlement() {
        return "DeceasedAccountSettlement for BankOfBaroda";
    }
    @Override
    public String RiskProfileEscalator() {
        return "RiskProfileEscalator for BankOfBaroda";
    }

    @Override
    public String InoperativeAccountFreezer() {
        return "InoperativeAccountFreezer for BankOfBaroda";
    }

    @Override
    public String PartialFreezeEnforcer() {
        return "PartialFreezeEnforcer for BankOfBaroda";
    }

    @Override
    public String DormantAccountReactivator() {
        return "DormantAccountReactivator for BankOfBaroda";
    }

    @Override
    public String LienMarkingManager() {
        return "LienMarkingManager for BankOfBaroda";
    }

    @Override
    public String UnclaimedDepositMigrator() {
        return "UnclaimedDepositMigrator for BankOfBaroda";
    }

    @Override
    public String DailyTransactionLimiter() {
        return " DailyTransactionLimiter for BankOfBaroda";
    }

    @Override
    public String CrossBorderRemittanceScanner() {
        return "CrossBorderRemittanceScanner for BankOfBaroda";
    }

    @Override
    public String HighValueCashReporter() {
        return "HighValueCashReporter for BankOfBaroda";
    }

    @Override
    public String CardLimitCustomizer() {
        return "CardLimitCustomizer for BankOfBaroda";
    }

    @Override
    public String DigitalWalletInteroperable() {
        return "DigitalWalletInteroperable for BankOfBaroda";
    }

    @Override
    public String AdvanceKycNotifier() {
        return "AdvanceKycNotifier for BankOfBaroda";
    }

    @Override
    public String FailedDispenseReverser() {
        return "FailedDispenseReverser for BankOfBaroda";
    }

    @Override
    public String FraudAlertDisseminator() {
        return "FraudAlertDisseminator for BankOfBaroda";
    }

    @Override
    public String ConsentRecordKeeper() {
        return "ConsentRecordKeeper for BankOfBaroda";
    }

    @Override
    public String AuditTrailArchiver() {
        return "AuditTrailArchiver for BankOfBaroda";
    }
}
