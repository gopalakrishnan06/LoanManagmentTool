package LoanManagmentTool.LoanManagmentTool;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface LoanRepository extends JpaRepository<Loan, Integer>{
	
	Collection<Loan> findByLoanAmount(String loanAmount);
	
	Loan findById(int id);
	
	void deleteLoanById(int id);

}
