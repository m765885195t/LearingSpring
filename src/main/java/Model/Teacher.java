package Model;

public class Teacher {
    private int age;
    private String name;
    private mo mo;
    public Teacher(){
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Show(){
        System.out.println(age+" "+name + mo.b);
    }



    public String getN(){
//        return "nihao";
        return null;
    }

    public Model.mo getMo() {
        return mo;
    }

    public void setMo(Model.mo mo) {
        this.mo = mo;
    }
}
