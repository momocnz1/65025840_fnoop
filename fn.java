import java.util.*;

public class fn {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Tom", 32, "UX/UI", "001");
        Project project1 = new Project("Web A", "Developing a web");
        Project project2 = new Project("Mobile A", "Developing a web");

        Employee employee2 = new Employee("Tom", 32, "FontEnd", "002");
        Project project3 = new Project("Web A", "Developing a web");

        employee1.addProject(project1);
        employee1.addProject(project2);
        employee2.addProject(project3);


    }
}

interface Person {
    String getName();

    void setName(String Name);

    double getAge();

    void setAge(int Age);
}

interface Job {
    String getPosition();

    void setPosition(String Position);

    String getEmpID();

    void setEmpId(String EnpID);
}

 class Employee implements Person, Job {
    String Position;
    String Name;
    double Age;
    String EmpId;
    protected ArrayList<Project> MyProject;

    Employee(String Name, double Age, String Position, String EmpId) {
        this.Name = Name;
        this.Age = Age;
        this.EmpId = EmpId;
        this.Position = Position;
        this.MyProject = new ArrayList<>();
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPosition() {
        return Position;
    }

    public double getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public String getEmpID() {
        return EmpId;
    }

    public void setEmpId(String EnpID) {
        this.EmpId = EnpID;
    }

    public void addProject(Project MyProject) {
        this.MyProject.add(MyProject);
    }

    public void ShowDetail() {
        System.out.println("************");
        System.out.println("Name : " + this.getName());
        System.out.println("Name : " + this.getPosition());
        System.out.println("Name : " + this.getEmpID());
        System.out.println("************");
        for (int i = 0; i < this.MyProject.size(); i++) {
            System.out.println(this.MyProject.get(i).getProject()+" : " + this.MyProject.get(i).getDescription());
        }

    }
}

class Project {
    public String ProjectName;
    public String Description;

    Project(String Description, String ProjectName) {
        this.ProjectName = ProjectName;
        this.Description = Description;
    }

    public String getProject() {
        return ProjectName;
    }
    public String getDescription(){
        return  Description;
    }
}
