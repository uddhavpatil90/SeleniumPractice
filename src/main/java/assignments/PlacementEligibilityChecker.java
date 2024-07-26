package assignments;

public class PlacementEligibilityChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double candidate10thMarks = 76.64;
		double candidate12thMarks = 76.75;
		double candidateDegreeMarks = 75.98;
		double candidateExp = 2.6;

		if (candidate10thMarks >= 75) {
			if (candidate12thMarks >= 75) {
				if (candidateDegreeMarks >= 75) {
					if (candidateExp >= 2) {
						System.out.println("Eligible");
					} else {
						System.out.println("Ineligible for placement");
					}
				} else {
					System.out.println("Ineligible for placement");
				}

			} else {
				System.out.println("Ineligible for placement");
			}

		}

		else {
			System.out.println("Ineligible for placement");
		}

	}

}
