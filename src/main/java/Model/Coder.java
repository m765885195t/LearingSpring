package Model;

public class Coder {
    private String name;
    private String sex;
    private Double age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public void Show(){
        System.out.println(name+"  "+age +"  "+sex);
    }

    public void setAge(Double age) {
        this.age = age;
    }
}
