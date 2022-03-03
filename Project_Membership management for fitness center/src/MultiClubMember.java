
public class MultiClubMember extends Member {
	private int MembershipPoints;

	MultiClubMember(char pMemberType, int pMemberID, String pName, double pFees, int pMembershipPoints) {
		super(pMemberType, pMemberID, pName, pFees);
		MembershipPoints = pMembershipPoints;
	}

	public void setMembershipPoints(int pMembershipPoints) {
		MembershipPoints = pMembershipPoints;
	}

	public int getMembershipPoints() {
		return MembershipPoints;
	}

	@Override
	public String toString() {
		return super.toString() + " , " + MembershipPoints;
	}
}
