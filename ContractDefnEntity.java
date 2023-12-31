package in.sis.frco.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Entity
@Table(name = "PS_TB_LN_CONTRACT_DEFN")
@Data
public class ContractDefnEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    @EmbeddedId
	    private ContractDefnIdentity contDefnId;
	    	    
	    @Column(name = "CUSTOMER_CODE")
	    private String customerCode;

	    @Column(name = "GUARANTOR_CODE")
	    private String guarantorCode;

	    @Column(name = "BRANCH_CODE")  
	    private String branchCode;
	    
	    @Column(name = "BU_BRANCH_CODE")	    
	    private String buBranchCode;

	    @Column(name = "CONTRACT_TYPE")	    
	    private Integer contractType;

	    @Column(name = "BU_ACTIVITY_CODE", nullable = false)	    
	    private String buActivityCode;
	    
	    @Column(name = "INSUR_BY_IND")	    
	    private String insurByInd;

	    @Column(name = "STMT_CODE")	    
	    private Integer stmtCode;

	    @Column(name = "CONTRACT_STATUS")	    
	    private String contractStatus;
	    
	    @JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
	    @Column(name = "CONFIG_DATE")
	    private LocalDate configDate;
	    
	    @JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
	    @Column(name = "AGREE_DATE")	    
	    private LocalDate agreeDate;
	    
	    @JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
	    @Column(name = "PYMT_DATE")	    
	    private LocalDate pymtDate;
	    
	    @JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
	    @Column(name = "TXN_DATE")	    
	    private LocalDate txnDate;
	    
	    @JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
	    @Column(name = "CONFIG_TXN_DATE")	    
	    private LocalDate configTxnDate;

	    @Column(name = "CONFIGURED_BY")	    
	    private String configuredBy;
	    
	    @JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
	    @Column(name = "APPROVAL_DATE")	    
	    private LocalDate approvalDate;

	    @Column(name = "APPROVED_BY")  
	    private String approvedBy;
	    
	    @JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
	    @Column(name = "CLOSURE_DATE")   
	    private LocalDate closureDate;

	    @Column(name = "CLOSED_BY")	    
	    private String closedBy;

	    @Column(name = "ACTION_TYPE_CODE")	    
	    private String actionTypeCode;

	    @Column(name = "AUDIT_LOG")	    
	    private String auditLog;

	    @Column(name = "APPLICATION_NO")	    
	    private String applicationNo;

	    @Column(name = "SANCTION_HDR_ID")	    
	    private Long sanctionHdrId;

	    @Column(name = "FIN_BY_SF")	    
	    private String finBySf;

	    @Column(name = "BASE_CONTRACT_NO")	    
	    private String baseContractNo;

	    @Column(name = "VEHICLE_REGN_NO")	    
	    private String vehicleRegnNo;

	    @Column(name = "CONFIRMED_BY")	    
	    private String confirmedBy;

}
