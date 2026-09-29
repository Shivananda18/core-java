package com.xworkz.Banks;

import com.xworkz.RbiBank.RbiBank;

public class UnionBank extends RbiBank {

    @Override
    public  String AadhaarBiometricAuthenticatable(){
        return "AadhaarBiometricAuthenticatable for UnionBank ";
    }
    @Override
    public String AadhaarOtpVerifiable() {
        return "AadhaarOtpVerifiable for UnionBank";
    }
    @Override
    public String OfflineAadhaarXmlValidator() {
        return "OfflineAadhaarXmlValidator for UnionBank";
    }
    @Override
    public String AadhaarAddressOverride() {
        return "AadhaarAddressOverride fro UnionBank";
    }
    @Override
    public String AadhaarMaskingEnforcer() {
        return "AadhaarMaskingEnforcer for UnionBank";
    }
    @Override
    public String PanCardOcrValidator() {
        return "PanCardOcrValidator for UnionBank";
    }
    @Override
    public int MobileNumberLinkable() {
        return 776029188;
    }
    @Override
    public String MinorToMajorStatusConverter() {
        return "MinorToMajorStatusConverter for UnionBank";
    }
    @Override
    public String DeceasedAccountSettlement() {
        return "DeceasedAccountSettlement for UnionBank";
    }
    @Override
    public String RiskProfileEscalator() {
        return "RiskProfileEscalator for UnionBank";
    }

    @Override
    public String InoperativeAccountFreezer() {
        return "InoperativeAccountFreezer for UnionBank";
    }

    @Override
    public String PartialFreezeEnforcer() {
        return "PartialFreezeEnforcer for UnionBank";
    }

    @Override
    public String DormantAccountReactivator() {
        return "DormantAccountReactivator for UnionBank";
    }

    @Override
    public String LienMarkingManager() {
        return "LienMarkingManager for UnionBank";
    }

    @Override
    public String UnclaimedDepositMigrator() {
        return "UnclaimedDepositMigrator for UnionBank";
    }

    @Override
    public String DailyTransactionLimiter() {
        return " DailyTransactionLimiter for UnionBank";
    }

    @Override
    public String CrossBorderRemittanceScanner() {
        return "CrossBorderRemittanceScanner for UnionBank";
    }

    @Override
    public String HighValueCashReporter() {
        return "HighValueCashReporter for UnionBank";
    }

    @Override
    public String CardLimitCustomizer() {
        return "CardLimitCustomizer for HSBCBank";
    }

    @Override
    public String DigitalWalletInteroperable() {
        return "DigitalWalletInteroperable for UnionBank";
    }

    @Override
    public String AdvanceKycNotifier() {
        return "AdvanceKycNotifier for UnionBank";
    }

    @Override
    public String FailedDispenseReverser() {
        return "FailedDispenseReverser for UnionBank";
    }

    @Override
    public String FraudAlertDisseminator() {
        return "FraudAlertDisseminator for UnionBank";
    }

    @Override
    public String ConsentRecordKeeper() {
        return "ConsentRecordKeeper for UnionBank";
    }

    @Override
    public String AuditTrailArchiver() {
        return "AuditTrailArchiver for UnionBank";
    }
}
