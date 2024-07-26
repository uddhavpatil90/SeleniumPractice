package assignments;

public class PlacementEligibilityChecker_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double candidate10thMarks = 76;
		double candidate12thMarks = 76;
		int candidateDegreeMarks = 89;
		int candidateExp = 2;

		if (candidate10thMarks >= 75 && candidate12thMarks >= 75 && 
			candidateDegreeMarks >= 75 && candidateExp >= 2) {
			System.out.println("Eligible");
		} else {
			System.out.println("Ineligible for placement");
		}
	}

}
