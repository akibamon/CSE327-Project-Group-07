package receptionist;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class receptionistTest {

	String pname;
	String disease;
	private String admit_status;
	private String sex;
	private int age;
	private String pid;

	@Test
	void new_patient()
    {
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        pid = input.nextLine();
        System.out.print("name:-");
        pname = input.nextLine();
        System.out.print("disease:-");
        disease = input.nextLine();
        System.out.print("sex:-");
        sex = input.nextLine();
        System.out.print("admit_status:-");
        admit_status = input.nextLine();
        System.out.print("age:-");
        age = input.nextInt();
    }
    void patient_info()
    {
        System.out.println(pid + "\t" + pname + " \t" + disease + "     \t" + sex + "      \t" + admit_status + "\t" + age);
    }
}