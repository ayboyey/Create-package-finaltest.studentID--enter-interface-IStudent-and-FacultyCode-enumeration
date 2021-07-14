package studentID;

public interface IStudent {
	public void addStudent();

	public void addStudents(int numberOfStudents);

	public void addStudent(String firstname, String lastname);

	public boolean findStudent(int id);

	public boolean updateStudent(int id, float gpa);

	public boolean deleteStudent(int id);

	public String toString();

	public void showFirtNameSort();

	public void showGPASort();

	public void showAgeSort();

	public void showLastNameAgeSort();

	public void showFirtNameGPASort();
}

