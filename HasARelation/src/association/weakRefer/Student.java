package association.weakRefer;

public class Student {

	  private int studentId;  //111
	  private String studentName;
	  private long mobileNumber; 
	  
		public Student(int studentId, String studentName, long mobileNumber) {
			super();
			this.studentId = studentId;
			this.studentName = studentName;
			this.mobileNumber = mobileNumber;
		}
		  
		@Override
		public String toString() {
			return "Student [studentId=" + studentId + ", studentName=" + studentName + ", mobileNumber=" + mobileNumber + "]";
		}

		public int getStudentId() {
			return studentId;
		}

		public String getStudentName() {
			return studentName;
		}

		public long getMobileNumber() {
			return mobileNumber;
		}	
		
	}
