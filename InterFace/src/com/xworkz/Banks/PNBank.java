package com.xworkz.Banks;

import com.xworkz.RbiBank.RbiBank;

public class PNBank extends RbiBank {

    @Override
    public  String AadhaarBiometricAuthenticatable(){
        return "AadhaarBiometricAuthenticatable for PNBank ";
    }
    @Override
    public String AadhaarOtpVerifiable() {
        return "AadhaarOtpVerifiable for PNBank";
    }
    @Override
    public String OfflineAadhaarXmlValidator() {
        return "OfflineAadhaarXmlValidator for PNBank";
    }
    @Override
    public String AadhaarAddressOverride() {
        return "AadhaarAddressOverride fro PNBank";
    }
    @Override
    public String AadhaarMaskingEnforcer() {
        return "AadhaarMaskingEnforcer for PNBank";
    }
    @Override
    public String PanCardOcrValidator() {
        return "PanCardOcrValidator for PNBank";
    }
    @Override
    public int MobileNumberLinkable() {
        return 0;
    }
    @Override
    public String MinorToMajorStatusConverter() {
        return "MinorToMajorStatusConverter for PNBank";
    }
    @Override
    public String DeceasedAccountSettlement() {
        return "DeceasedAccountSettlement for PNBank";
    }
    @Override
    public String RiskProfileEscalator() {
        return "RiskProfileEscalator for PNBank";
    }

    @Override
    public String InoperativeAccountFreezer() {
        return "InoperativeAccountFreezer for PNBank";
    }

    @Override
    public String PartialFreezeEnforcer() {
        return "PartialFreezeEnforcer for PNBank";
    }

    @Override
    public String DormantAccountReactivator() {
        return "DormantAccountReactivator for PNBank";
    }

    @Override
    public String LienMarkingManager() {
        return "LienMarkingManager for KarnatakaGraPNBankmeenaBank";
    }

    @Override
    public String UnclaimedDepositMigrator() {
        return "UnclaimedDepositMigrator for PNBank";
    }

    @Override
    public String DailyTransactionLimiter() {
        return " DailyTransactionLimiter for PNBank";
    }

    @Override
    public String CrossBorderRemittanceScanner() {
        return "CrossBorderRemittanceScanner for PNBank";
    }

    @Override
    public String HighValueCashReporter() {
        return "HighValueCashReporter for PNBank";
    }

    @Override
    public String CardLimitCustomizer() {
        return "CardLimitCustomizer for PNBank";
    }

    @Override
    public String DigitalWalletInteroperable() {
        return "DigitalWalletInteroperable for PNBank";
    }

    @Override
    public String AdvanceKycNotifier() {
        return "AdvanceKycNotifier for PNBank";
    }

    @Override
    public String FailedDispenseReverser() {
        return "FailedDispenseReverser for PNBank";
    }

    @Override
    public String FraudAlertDisseminator() {
        return "FraudAlertDisseminator for PNBank";
    }

    @Override
    public String ConsentRecordKeeper() {
        return "ConsentRecordKeeper for PNBank";
    }

    @Override
    public String AuditTrailArchiver() {
        return "AuditTrailArchiver for PNBank";
    }
}
