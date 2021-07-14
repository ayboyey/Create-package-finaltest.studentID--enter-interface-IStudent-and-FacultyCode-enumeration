package studentID;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Student implements IStudent {
private int studentID;
private String firstName;
private String lastName;
private FacultyCode fal_code = FacultyCode.NOT_KNOWN;
private int age;
private float gpa; //Grade Point Average ranges from 0 to 10
private List<Student> lststudents = new ArrayList<>();


public Student() {
	Random rand = new Random(); 
	studentID = rand.nextInt(100);
	firstName = "fName" + String.valueOf(studentID);
	lastName = "lName" + String.valueOf(studentID);
	age = rand.nextInt(100);
	gpa = rand.nextFloat()*5;
}
public Student(String fName, String lName) {
	studentID = 0;
	firstName = fName;
	lastName = lName;
	age = 0;
	gpa = 5;
}

public int getID() {
	return studentID;
}

public String getFName() {
	return firstName;
}
public String getLName() {
	return lastName;
}
public float getGPA() {
	return gpa;
}
public int getAge() {
	return age;
}
public void setGPA(float Gpa) {
	gpa = Gpa;
}
public void setFName(String name) {
	firstName = name;
}


public void addStudent() {
	lststudents.add(new Student());
	
}

public void addStudents(int numberOfStudents) {
	
	for(int i = 0; i< numberOfStudents; i++) {
		addStudent();
	}
	
}

public void addStudent(String firstname, String lastname) {
	lststudents.add(new Student(firstname, lastname));
	
}

public boolean findStudent(int id) {
	for (int i = 0; i< lststudents.size(); i++) {
		if (lststudents.get(i).getID() == id) {
			return true;
		}
	}
	return false;
}


public boolean updateStudent(int id, float gpa) {
	for (int i = 0; i< lststudents.size(); i++) {
		if (lststudents.get(i).getID() == id) {
			lststudents.get(i).setGPA(gpa);
		}
	}
	return false;
}
public boolean deleteStudent(int id) {
	for (int i = 0; i< lststudents.size(); i++) {
		if (lststudents.get(i).getID() == id) {
			lststudents.remove(i);
		}
	}
	return false;
}

public void print() {
	for (int i = 0; i< lststudents.size(); i++) {
		System.out.println(String.valueOf(i+1) + lststudents.get(i).toString());
	}
}


public String toString() {
	return firstName + " " + lastName + " " + String.valueOf(age) + " " + String.valueOf(gpa);
	
}


public void showFirtNameSort() {
	
	System.out.println("\n\nshowFirtNameSort");
	int b = lststudents.size(); 
    for (int i = 0; i < b-1; i++) 
        for (int j = 0; j < b-i-1; j++) 
            if (lststudents.get(i).getFName().compareTo(lststudents.get(j+1).getFName()) > 0) 
            { 
                Student temp = lststudents.get(j); 
                lststudents.set(j, lststudents.get(j+1));
                lststudents.set(j+1, temp);
            } 
    print();
}


public void showGPASort() {
	System.out.println("\n\nshowGPASort");

	int b = lststudents.size(); 
    for (int i = 0; i < b-1; i++) 
        for (int j = 0; j < b-i-1; j++) 
            if (lststudents.get(i).getGPA() > lststudents.get(j+1).getGPA()) 
            { 
                Student temp = lststudents.get(j); 
                lststudents.set(j, lststudents.get(j+1));
                lststudents.set(j+1, temp);
            } 
    print();
	
}


public void showAgeSort() {
	System.out.println("\n\nshowAgeSort");
	int b = lststudents.size(); 
    for (int i = 0; i < b-1; i++) 
        for (int j = 0; j < b-i-1; j++) 
            if (lststudents.get(i).getAge() > lststudents.get(j+1).getAge())
            { 
                String temp = lststudents.get(j).getFName(); 
                lststudents.get(j).setFName(lststudents.get(j+1).getFName());
                lststudents.get(j+1).setFName(temp);
            } 
    print();
	
}


public void showLastNameAgeSort() {
	System.out.println("\n\nshowLastNameAgeSort");
	int b  = lststudents.size(); 
    for (int i = 0; i < b-1; i++) 
        for (int j = 0; j < b-i-1; j++) 
            if (lststudents.get(i).getLName().compareTo(lststudents.get(j+1).getLName()) > 0) 
            { 
            	Student temp = lststudents.get(j); 
                lststudents.set(j, lststudents.get(j+1));
                lststudents.set(j+1, temp);
            } 
    print();
	
}


public void showFirtNameGPASort() {
	System.out.println("\n\nshowFirtNameGPASort");
	showFirtNameSort();
	
}

public int avgAge() {
	System.out.println("\n\nshowLastNameAgeSort");
	int b = lststudents.size(); 
	int sum = 0;
    for (int i = 0; i < b-1; i++) 
        sum += lststudents.get(i).getAge();
    
    return sum/lststudents.size();
	
}

public float avgGPA() {
	System.out.println("\n\nshowLastNameAgeSort");
	int b = lststudents.size(); 
	float sum = 0;
    for (int i = 0; i < b-1; i++) 
        sum += lststudents.get(i).getGPA();
    
    return sum/lststudents.size();
	
}

}
