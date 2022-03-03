// This is a Parent Class 

/*
 *  step.1 Create four private fields as memberType, memberID, name and Fees of type char, int, string and double 
 *  step.2 Create constructor for fields created
 *  step.3 Create methods 
 */

public class Member {
	char memberType;
	int memberID;
	String name;
	double fees;

	Member(char pmemberType, int pmemberID, String pname, double pFees) {
		memberType = pmemberType;
		memberID = pmemberID;
		name = pname;
		fees = pFees;
	}

	public void setMemberType(char pmemberType) {
		memberType = pmemberType;
	}

	public char getMemberType() {
		return memberType;
	}

	public void setMemberID(int pMembeerID) {
		memberID = pMembeerID;
	}

	public int getMemberID() {
		return memberID;
	}

	public void setName(String pName) {
		name = pName;
	}

	public String getName() {
		return name;
	}

	public void setFees(Double pFees) {
		fees = pFees;
	}

	public double getFees() {
		return fees;
	}

	@Override
	public String toString() {
		return memberType + " " + memberID + " " + name + " " + fees + " ";
	}
}
