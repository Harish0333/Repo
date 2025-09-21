package association.weakRefer;

import java.util.Date;

public class Aadhar {
	  private long aadharNumber;
	  private Date issueDate;
	  private String issuingAuthority;
	  
		public Aadhar(long aadharNumber, Date issueDate, String issuingAuthority) {
			super();
			this.aadharNumber = aadharNumber;
			this.issueDate = issueDate;
			this.issuingAuthority = issuingAuthority;
		}

		@Override
		public String toString() {
			return "Aadhar [aadharNumber=" + aadharNumber + ", issueDate=" + issueDate + ", issuingAuthority="	+ issuingAuthority + "]";
		}   

}
