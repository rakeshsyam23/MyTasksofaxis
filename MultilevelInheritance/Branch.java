package MultilevelInheritance;

public class Branch extends College{
	String branchName;
	int branchId;
	int branchTotalStaff;
	

public Branch(String branchName,int branchId,int branchTotalStaff,String collegeName,int collegeId, String collegePlace){
	super(collegeName,collegeId,collegePlace);
	this.branchName = branchName;
	this.branchId = branchId;
	this.branchTotalStaff = branchTotalStaff;
	
  }
}

