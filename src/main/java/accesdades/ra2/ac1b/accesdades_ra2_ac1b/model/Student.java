package accesdades.ra2.ac1b.accesdades_ra2_ac1b.model;

public class Student{
    
    private Long id;
    private String name;
    private String cognom;
    private int age;
    private String cicle;
    private int any;
    
    public Student() {
    }

    public Student(Long id, String name, String cognom, int age, String cicle, int any) {
        this.id = id;
        this.name = name;
        this.cognom = cognom;
        this.age = age;
        this.cicle = cicle;
        this.any = any;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCicle() {
        return cicle;
    }

    public void setCicle(String cicle) {
        this.cicle = cicle;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    
    
}