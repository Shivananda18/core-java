package com.xworkz.Banks;

import com.xworkz.RbiBank.RbiBank;

public class SbiBank  extends RbiBank {


    @Override
    public String AadhaarBiometricAuthenticatable() {
        return "AadhaarBiometricAuthenticatable for sbiBank";
    }

    @Override
    public String AadhaarOtpVerifiable() {
        return "AadhaarOtpVerifiable for sbi Bank";
    }

    @Override
    public String OfflineAadhaarXmlValidator() {
        return "OfflineAadhaarXmlValidator for sbi bank";
    }

    @Override
    public String AadhaarAddressOverride() {
        return "AadhaarAddressOverride for Sbi Bank";
    }

    @Override
    public String AadhaarMaskingEnforcer() {
        return "AadhaarMaskingEnforcer for Sbi Bank";
    }

    @Override
    public String PanCardOcrValidator() {
        return "PanCardOcrValidator for Sbi Bank";
    }

    @Override
    public int MobileNumberLinkable() {
        return 0;
    }

    @Override
    public String MinorToMajorStatusConverter() {
        return "MinorToMajorStatusConverter for Sbi Bank";
    }

    @Override
    public String DeceasedAccountSettlement() {
        return "DeceasedAccountSettlement for Sbi bank";
    }

    @Override
    public String RiskProfileEscalator() {
        return "RiskProfileEscalator for Sbi Bank";
    }

    @Override
    public String InoperativeAccountFreezer() {
        return "InoperativeAccountFreezer for Sbi Bank";
    }

    @Override
    public String PartialFreezeEnforcer() {
        return "PartialFreezeEnforcer for Sbi Bank";
    }

    @Override
    public String DormantAccountReactivator() {
        return "DormantAccountReactivator for Sbi Bank";
    }

    @Override
    public String LienMarkingManager() {
        return "LienMarkingManager for Sbi Bank";
    }

    @Override
    public String UnclaimedDepositMigrator() {
        return "UnclaimedDepositMigrator for Sbi Bank";
    }

    @Override
    public String DailyTransactionLimiter() {
        return "DailyTransactionLimiter for Sbi Bank";
    }

    @Override
    public String CrossBorderRemittanceScanner() {
        return "CrossBorderRemittanceScanner for Sbi Bank";
    }

    @Override
    public String HighValueCashReporter() {
        return "HighValueCashReporter for Sbi Bank";
    }

    @Override
    public String CardLimitCustomizer() {
        return "CardLimitCustomizer for Sbi Bank";
    }

    @Override
    public String DigitalWalletInteroperable() {
        return "DigitalWalletInteroperable for Sbi Bank";
    }

    @Override
    public String AdvanceKycNotifier() {
        return "AdvanceKycNotifier For Sbi Bank";
    }

    @Override
    public String FailedDispenseReverser() {
        return "FailedDispenseReverser for Sbi Bank";
    }

    @Override
    public String FraudAlertDisseminator() {
        return "FraudAlertDisseminator for Sbi bank";
    }

    @Override
    public String ConsentRecordKeeper() {
        return "ConsentRecordKeeper for Sbi Bank";
    }

    @Override
    public String AuditTrailArchiver() {
        return " AuditTrailArchiver for Sbi Bank";
    }
}
