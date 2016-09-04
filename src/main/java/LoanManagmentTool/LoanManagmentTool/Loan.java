package LoanManagmentTool.LoanManagmentTool;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Loan {
	
	@Id 
	@GeneratedValue
	private int id;

	private String loanAmount;

	private String loanAddress;
	
	private String loanName;

	public Loan(String loanAmount, String loanAddress, String loanName) {
		super();
		this.loanAmount = loanAmount;
		this.loanAddress = loanAddress;
		this.loanName = loanName;
	}

	public Loan() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}
	

	public String getLoanAddress() {
		return loanAddress;
	}

	public void setLoanAddress(String loanAddress) {
		this.loanAddress = loanAddress;
	}

	public String getLoanName() {
		return loanName;
	}

	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}

	@Override
	public String toString() {
		return "Loan [id=" + id + ", loanAmount=" + loanAmount + ", loanAddress=" + loanAddress + ", loanName="
				+ loanName + "]";
	}

}
