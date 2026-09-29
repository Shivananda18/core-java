package com.xworkz.Banks;

import com.xworkz.RbiBank.RbiBank;

public class AxisBank extends RbiBank {

    @Override
    public  String AadhaarBiometricAuthenticatable(){
        return "AadhaarBiometricAuthenticatable for AxisBank ";
    }
    @Override
    public String AadhaarOtpVerifiable() {
        return "AadhaarOtpVerifiable for AxisBank";
    }
    @Override
    public String OfflineAadhaarXmlValidator() {
        return "OfflineAadhaarXmlValidator for AxisBank";
    }
    @Override
    public String AadhaarAddressOverride() {
        return "AadhaarAddressOverride fro AxisBank";
    }
    @Override
    public String AadhaarMaskingEnforcer() {
        return "AadhaarMaskingEnforcer for AxisBank";
    }
    @Override
    public String PanCardOcrValidator() {
        return "PanCardOcrValidator for AxisBank";
    }
    @Override
    public int MobileNumberLinkable() {
        return 0;
    }
    @Override
    public String MinorToMajorStatusConverter() {
        return "MinorToMajorStatusConverter for AxisBank";
    }
    @Override
    public String DeceasedAccountSettlement() {
        return "DeceasedAccountSettlement for AxisBank";
    }
    @Override
    public String RiskProfileEscalator() {
        return "RiskProfileEscalator for AxisBank";
    }

    @Override
    public String InoperativeAccountFreezer() {
        return "InoperativeAccountFreezer for AxisBank";
    }

    @Override
    public String PartialFreezeEnforcer() {
        return "PartialFreezeEnforcer for AxisBank";
    }

    @Override
    public String DormantAccountReactivator() {
        return "DormantAccountReactivator for AxisBank";
    }

    @Override
    public String LienMarkingManager() {
        return "LienMarkingManager for AxisBank";
    }

    @Override
    public String UnclaimedDepositMigrator() {
        return "UnclaimedDepositMigrator for AxisBank";
    }

    @Override
    public String DailyTransactionLimiter() {
        return " DailyTransactionLimiter for AxisBank";
    }

    @Override
    public String CrossBorderRemittanceScanner() {
        return "CrossBorderRemittanceScanner for AxisBank";
    }

    @Override
    public String HighValueCashReporter() {
        return "HighValueCashReporter for AxisBank";
    }

    @Override
    public String CardLimitCustomizer() {
        return "CardLimitCustomizer for AxisBank";
    }

    @Override
    public String DigitalWalletInteroperable() {
        return "DigitalWalletInteroperable for AxisBank";
    }

    @Override
    public String AdvanceKycNotifier() {
        return "AdvanceKycNotifier for AxisBank";
    }

    @Override
    public String FailedDispenseReverser() {
        return "FailedDispenseReverser for AxisBank";
    }

    @Override
    public String FraudAlertDisseminator() {
        return "FraudAlertDisseminator for AxisBank";
    }

    @Override
    public String ConsentRecordKeeper() {
        return "ConsentRecordKeeper for AxisBank";
    }

    @Override
    public String AuditTrailArchiver() {
        return "AuditTrailArchiver for AxisBank";
    }
}
