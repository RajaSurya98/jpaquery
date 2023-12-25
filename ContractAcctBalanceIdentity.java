package in.sis.frco.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class ContractAcctBalanceIdentity implements Serializable{
	private static final long serialVersionUID = 1L;
	
    @Column(name = "COMPANY_CODE")
    private String companyCode;

    @Column(name = "CONTRACT_NO")
    private String contractNo;

}
