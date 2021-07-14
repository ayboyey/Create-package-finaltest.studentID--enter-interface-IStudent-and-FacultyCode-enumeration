package studentID;

public class main {

	public static void main(String[] args) {
		Student S = new Student();
		S.addStudents(10);
		
		S.showAgeSort();
		S.showFirtNameGPASort();
		S.showFirtNameSort();
		S.showGPASort();
		S.showLastNameAgeSort();
		
		System.out.println("Avg age: " + String.valueOf(S.avgAge()));
		System.out.println("Avg gpa: " + String.valueOf(S.avgGPA()));

		
		
		
	}

}