package association.weakRefer;

public class Organisation {
	private int organisationId;
	  private String organisationName;
	  private String organisationAddress;
	  
	  
	public int getOrganisationId() {
		return organisationId;
	}


	public void setOrganisationId(int organisationId) {
		this.organisationId = organisationId;
	}


	public String getOrganisationName() {
		return organisationName;
	}


	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}


	public String getOrganisationAddress() {
		return organisationAddress;
	}


	public void setOrganisationAddress(String organisationAddress) {
		this.organisationAddress = organisationAddress;
	}


	public Organisation(int organisationId, String organisationName, String organisationAddress) {
		super();
		this.organisationId = organisationId;
		this.organisationName = organisationName;
		this.organisationAddress = organisationAddress;
	}


	@Override
	public String toString()
	{
		return "Organisation [organisationId=" + organisationId + ", organisationName=" + organisationName
				+ ", organisationAddress=" + organisationAddress + "]";
	}
	  


}
