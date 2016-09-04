package LoanManagmentTool.LoanManagmentTool;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanManagmentController {

	@Autowired
	LoanRepository loanRepository;
	
	@CrossOrigin(origins = "http://localhost:8081")
	@RequestMapping("/Loan/")
	ResponseEntity<List<Loan>> fetchLoan() {
		List<Loan> loans = loanRepository.findAll();
		return new ResponseEntity<List<Loan>>(loans, HttpStatus.OK);
	}
	

	@CrossOrigin(origins = "http://localhost:8081")
	@RequestMapping(value = "/Loan/", method = RequestMethod.POST)
	public ResponseEntity<List<Loan>> createUser(@RequestBody Loan loan) {
		loanRepository.save(loan);
		List<Loan> loans = loanRepository.findAll();
		return new ResponseEntity<List<Loan>>(loans, HttpStatus.OK);
	}
	
	
	@CrossOrigin(origins = "http://localhost:8081")
	@RequestMapping(value = "/Loan/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Loan> deleteUser(@PathVariable("id") int id) {
        loanRepository.deleteLoanById(id);
        return new ResponseEntity<Loan>(HttpStatus.NO_CONTENT);
    }
	
	@CrossOrigin(origins = "http://localhost:8081")
	@RequestMapping(value = "/Loan/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Loan> updateLoan(@PathVariable("id") int id, @RequestBody Loan loan) {
        Loan currentLoan=loanRepository.findById(id);
        if (currentLoan==null) {
            System.out.println("User with id " + id + " not found");
            return new ResponseEntity<Loan>(HttpStatus.NOT_FOUND);
        }
        currentLoan.setLoanAddress(loan.getLoanAddress());
        currentLoan.setLoanAmount(loan.getLoanAmount());
        currentLoan.setLoanName(loan.getLoanName());
        loanRepository.save(currentLoan);
        return new ResponseEntity<Loan>(currentLoan, HttpStatus.OK);
    }

}
