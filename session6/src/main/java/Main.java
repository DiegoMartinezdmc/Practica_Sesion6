import Universidad.Faculty;
import Universidad.Professor;

public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor();
        Faculty faculty = new Faculty();

        prof.setId("002");
        prof.setName("Maria");
        prof.setLastname("Lopez");
        prof.setTitle("Head of Computer Science Department");
        prof.setCoordination(2000, "Computer Science");

        faculty.setId(2020);
        faculty.setName("Science Faculty");
        faculty.setBuilding("West building");
        faculty.addCoordination(prof.m_Coordination.getCode(), prof.m_Coordination.getName());
        faculty.addCoordination(2030, "Biology");
        faculty.addCoordination(2040, "Physics");

        System.out.println(faculty);
    }
}
