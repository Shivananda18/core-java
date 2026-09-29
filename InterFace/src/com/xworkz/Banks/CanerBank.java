package com.xworkz.Banks;

import com.xworkz.RbiBank.RbiBank;

public class CanerBank extends RbiBank {

    @Override
    public String AadhaarBiometricAuthenticatable(){
        return "AadhaarBiometricAuthenticatable for CanerBank ";
    }

    @Override
    public String AadhaarOtpVerifiable() {
        return "AadhaarOtpVerifiable for CanerBank";
    }
    @Override
    public String OfflineAadhaarXmlValidator() {
        return "OfflineAadhaarXmlValidator for CanerBank";
    }

    @Override
    public String AadhaarAddressOverride() {
        return "AadhaarAddressOverride for CanerBankCanerBank";
    }

    @Override
    public String AadhaarMaskingEnforcer() {
        return "AadhaarMaskingEnforcer for CanerBank";
    }

    @Override
    public String PanCardOcrValidator() {
        return "PanCardOcrValidator for CanerBank";
    }

    @Override
    public int MobileNumberLinkable() {
        return 0;
    }

    @Override
    public String MinorToMajorStatusConverter() {
        return "MinorToMajorStatusConverter for CanerBank";
    }

    @Override
    public String DeceasedAccountSettlement() {
        return "DeceasedAccountSettlement for CanerBank";
    }

    @Override
    public String RiskProfileEscalator() {
        return "RiskProfileEscalator for CanerBank";
    }

    @Override
    public String InoperativeAccountFreezer() {
        return "InoperativeAccountFreezer for CanerBank";
    }

    @Override
    public String PartialFreezeEnforcer() {
        return "PartialFreezeEnforcer for CanerBank";
    }

    @Override
    public String DormantAccountReactivator() {
        return "DormantAccountReactivator for CanerBank";
    }

    @Override
    public String LienMarkingManager() {
        return "LienMarkingManager for CanerBank";
    }

    @Override
    public String UnclaimedDepositMigrator() {
        return "UnclaimedDepositMigrator for CanerBank";
    }

    @Override
    public String DailyTransactionLimiter() {
        return "DailyTransactionLimiter for CanerBank";
    }

    @Override
    public String CrossBorderRemittanceScanner() {
        return "CrossBorderRemittanceScanner for CanerBank";
    }

    @Override
    public String HighValueCashReporter() {
        return "HighValueCashReporter for CanerBank";
    }

    @Override
    public String CardLimitCustomizer() {
        return "CardLimitCustomizer for CanerBank";
    }

    @Override
    public String DigitalWalletInteroperable() {
        return "DigitalWalletInteroperable for CanerBank";
    }

    @Override
    public String AdvanceKycNotifier() {
        return "AdvanceKycNotifier for CanerBank";
    }

    @Override
    public String FailedDispenseReverser() {
        return "FailedDispenseReverser for CanerBank";
    }

    @Override
    public String FraudAlertDisseminator() {
        return "FraudAlertDisseminator for CanerBank";
    }

    @Override
    public String ConsentRecordKeeper() {
        return "ConsentRecordKeeper for CanerBank";
    }

    @Override
    public String AuditTrailArchiver() {
        return "AuditTrailArchiver for CanerBank";
    }
}
