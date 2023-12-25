package in.sis.frco.entity;

import javax.persistence.*;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "PS_TB_LN_CONTRACT_FINANCE_DTLS")
@Data
public class ContractFinanceDtlsEntity  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ContractFinanceDtlsIdentity contFinDtlsId;
	
    @Column(name = "ASSET_TYPE_ID")
    private Long assetTypeId;

    @Column(name = "MODEL")
    private Integer model;

    @Column(name = "UNITS_COUNT")
    private Integer unitsCount;

    @Column(name = "HIRE_PERIOD")
    private Integer hirePeriod;

    @Column(name = "REPAY_FREQ")
    private char repayFreq;

    @Column(name = "INSTALLMENTS")
    private Integer installments;

    @Column(name = "FIXED_BILLING_DAY")
    private Integer fixedBillingDay;

    @Column(name = "DUES_IN_ADVANCE")
    private Integer duesInAdvance;

    @Column(name = "BASE_AMOUNT_FINANCE")
    private Double baseAmountFinance;

    @Column(name = "BODY_CHARGES")
    private Double bodyCharges;

    @Column(name = "IMPL_AMOUNT_FINANCE")
    private Double implAmountFinance;

    @Column(name = "SCP_AMOUNT_FINANCE")
    private Double scpAmountFinance;

    @Column(name = "ORG_AMOUNT_FINANCE")  
    private Double orgAmountFinance;

    @Column(name = "CURR_AMOUNT_FINANCE")
    private Double currAmountFinance;

    @Column(name = "ORG_AMOUNT_REPAY")
    private Double orgAmountRepay;

    @Column(name = "CURR_AMOUNT_REPAY")
    private Double currAmountRepay;

    @Column(name = "ORG_FINANCE_CHGS")
    private Double orgFinanceChgs;

    @Column(name = "CURR_FINANCE_CHGS")
    private Double currFinanceChgs;

    @Column(name = "FLOAT_RATE_IND")
    private char floatRateInd;

    @Column(name = "DEALER_CODE")
    private String dealerCode;

    @Column(name = "DEFERRED_PYMT_IND")
    private char deferredPymtInd;

    @Column(name = "CREDIT_DAYS")
    private Integer creditDays;

    @Column(name = "PYMT_ADJ_IND")
    private char pymtAdjInd;

    @Column(name = "DMA_PAYOUT_APPL")
    private char dmaPayoutAppl;

    @Column(name = "FLAT_RATE")
    private Double flatRate;

    @Column(name = "AFC_RATE")
    private Double afcRate;

    @Column(name = "SHORT_TERM_RATE")
    private Double shortTermRate;

    @Column(name = "ACCOUNTING_IRR")
    private Double accountingIrr;

    @Column(name = "COMPANY_IRR")
    private Double companyIrr;

    @Column(name = "VAR_NET_IRR")
    private Double varNetIrr;

    @Column(name = "VAR_NET_EXC_COMM_IRR")
    private Double varNetExcCommIrr;

    @Column(name = "SUBVENTION_IRR")
    private Double subventionIrr;

    @Column(name = "PPR_RATE")
    private Double pprRate;

    @Column(name = "PPR_AMT")
    private Double pprAmt;

    @Column(name = "FIRST_INSTL_DATE")
    private Date firstInstlDate;

    @Column(name = "DISBURSEMENT_TYPE")
    private String disbursementType;

    @Column(name = "INSUR_COMPANY_CODE")
    private Integer insurCompanyCode;

    @Column(name = "INSUR_BRANCH_CODE")
    private Long insurBranchCode;

    @Column(name = "ASSET_STRUCT_ID")
    private Long assetStructId;

    @Column(name = "HOLIDAY_MONTHS")
    private Integer holidayMonths;

    @Column(name = "CONTRACT_SCHEME_CODE")
    private String contractSchemeCode;

    @Column(name = "TCS_AMOUNT")
    private Double tcsAmount;

    @Column(name = "TRACTOR_INSUR_AMOUNT")
    private Double tractorInsurAmount;

    @Column(name = "LOAN_END_DATE")
    private Date loanEndDate;

    @Column(name = "INTEREST_RATE")
    private Double interestRate;

    @Column(name = "EIR_ORG_AMOUNT_FINANCE")
    private Double eirOrgAmountFinance;

    @Column(name = "EIR_CURR_AMOUNT_FINANCE")
    private Double eirCurrAmountFinance;

    @Column(name = "EIR_ORG_FINANCE_CHGS")
    private Double eirOrgFinanceChgs;

    @Column(name = "EIR_CURR_FINANCE_CHGS")
    private Double eirCurrFinanceChgs;

    @Column(name = "EFFECTIVE_IRR")
    private Double effectiveIrr;

    @Column(name = "SANCTIONED_LIMIT")
    private Double sanctionedLimit;

    @Column(name = "UTILIZED_AMOUNT")
    private Double utilizedAmount;

    @Column(name = "REPAY_MODE")
    private String repayMode;

    @Column(name = "INTEREST_PERIOD")
    private Integer interestPeriod;

    @Column(name = "DELIVERY_DEALER")
    private String deliveryDealer;

    @Column(name = "INSURANCE_TYPE")
    private String insuranceType;

    @Column(name = "INSURANCE_COMPANY_REASON")
    private String insuranceCompanyReason;

    @Column(name = "SELLER_CODE")
    private String sellerCode;

    @Column(name = "COMPANY_IRR_EXCL_PPR")
    private Double companyIrrExclPpr;

    @Column(name = "INTEREST_TYPE")
    private String interestType;

    @Column(name = "FRR_TYPE")
    private String frrType;

    @Column(name = "FRR_RATE")
    private Double frrRate;

    @Column(name = "MARKUP")
    private Double markup;

    @Column(name = "RESET_TYPE_CODE")
    private String resetTypeCode;

    @Column(name = "RESET_FREQUENCY")
    private Integer resetFrequency;

    @Column(name = "NEXT_REVISION_DATE")  
    private Date nextRevisionDate;

}
