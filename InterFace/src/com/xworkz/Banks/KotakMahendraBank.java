package com.xworkz.Banks;

import com.xworkz.RbiBank.RbiBank;

public class KotakMahendraBank extends RbiBank {

    @Override
    public  String AadhaarBiometricAuthenticatable(){
        return "AadhaarBiometricAuthenticatable for KotakMahendraBank ";
    }
    @Override
    public String AadhaarOtpVerifiable() {
        return "AadhaarOtpVerifiable for KotakMahendraBank";
    }
    @Override
    public String OfflineAadhaarXmlValidator() {
        return "OfflineAadhaarXmlValidator for KotakMahendraBank";
    }
    @Override
    public String AadhaarAddressOverride() {
        return "AadhaarAddressOverride fro KotakMahendraBank";
    }
    @Override
    public String AadhaarMaskingEnforcer() {
        return "AadhaarMaskingEnforcer for KotakMahendraBank";
    }
    @Override
    public String PanCardOcrValidator() {
        return "PanCardOcrValidator for KotakMahendraBank";
    }
    @Override
    public int MobileNumberLinkable() {
        return 701913654;
    }
    @Override
    public String MinorToMajorStatusConverter() {
        return "MinorToMajorStatusConverter for KotakMahendraBank";
    }
    @Override
    public String DeceasedAccountSettlement() {
        return "DeceasedAccountSettlement for KotakMahendraBank";
    }
    @Override
    public String RiskProfileEscalator() {
        return "RiskProfileEscalator for KotakMahendraBank";
    }

    @Override
    public String InoperativeAccountFreezer() {
        return "InoperativeAccountFreezer for KotakMahendraBank";
    }

    @Override
    public String PartialFreezeEnforcer() {
        return "PartialFreezeEnforcer for KotakMahendraBank";
    }

    @Override
    public String DormantAccountReactivator() {
        return "DormantAccountReactivator for KotakMahendraBank";
    }

    @Override
    public String LienMarkingManager() {
        return "LienMarkingManager for KotakMahendraBank";
    }

    @Override
    public String UnclaimedDepositMigrator() {
        return "UnclaimedDepositMigrator for KotakMahendraBank";
    }

    @Override
    public String DailyTransactionLimiter() {
        return " DailyTransactionLimiter for KotakMahendraBank";
    }

    @Override
    public String CrossBorderRemittanceScanner() {
        return "CrossBorderRemittanceScanner for KotakMahendraBank";
    }

    @Override
    public String HighValueCashReporter() {
        return "HighValueCashReporter for KotakMahendraBank";
    }

    @Override
    public String CardLimitCustomizer() {
        return "CardLimitCustomizer for KotakMahendraBank";
    }

    @Override
    public String DigitalWalletInteroperable() {
        return "DigitalWalletInteroperable for KotakMahendraBank";
    }

    @Override
    public String AdvanceKycNotifier() {
        return "AdvanceKycNotifier for KotakMahendraBank";
    }

    @Override
    public String FailedDispenseReverser() {
        return "FailedDispenseReverser for KotakMahendraBank";
    }

    @Override
    public String FraudAlertDisseminator() {
        return "FraudAlertDisseminator for KotakMahendraBank";
    }

    @Override
    public String ConsentRecordKeeper() {
        return "ConsentRecordKeeper for KotakMahendraBank";
    }

    @Override
    public String AuditTrailArchiver() {
        return "AuditTrailArchiver for KotakMahendraBank";
    }
}
