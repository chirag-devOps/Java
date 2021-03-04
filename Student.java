//==================================
// Foundations of Computer Science
// Student: Prateek Kumar Mondal
// id: a1789674
// Semester: 1
// Year: 1
//===================================

public class Student {
	String name;
	int physic, chemistry, math;
	float average;

	public Student(String name, int physic, int chemistry, int math) {
		this.name = name;
		this.physic = physic;
		this.chemistry = chemistry;
		this.math = math;
		this.average = ((float) (physic + chemistry + math)) / 3;
		this.average = Math.round(this.average * 100.0) / 100.0f; // calculating the average marks and rounding till 2
																	// decimal places
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhysic() {
		return physic;
	}

	public void setPhysic(int physic) {
		this.physic = physic;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public float getAverage() {
		return average;
	}

	public void setAverage(float average) {
		this.average = average;
	}

}
