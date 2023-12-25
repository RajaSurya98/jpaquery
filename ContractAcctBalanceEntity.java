package in.sis.frco.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "PS_TB_LN_CONTRACT_ACCT_BALANCE")
@Data
public class ContractAcctBalanceEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
    @EmbeddedId
    private ContractAcctBalanceIdentity contAccBalId; 
	
	@Column(name = "HM_BAL")
    private Double hmBal;
	 
	@Column(name = "INCI_BAL")
    private Double inciBal;
	
	@Column(name = "DLR_BAL")
    private Double dlrBal;
	
	@Column(name = "INS_BAL")
    private Double insBal;

}
