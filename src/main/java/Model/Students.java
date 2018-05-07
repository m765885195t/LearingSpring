package Model;

import ImpServer.Song;

public class Students{
    private int age=3;
    private Song s;
    private mo mo;
    public Students(){}

    public Students(int age,Song s,mo mo){
        this.age = age;
        this.s = s;
        this.mo = mo;
    }

    public void showAge(){
        System.out.println(age);
        s.pring();
        System.out.println(mo.b);
    }
    public void init(){
        System.out.println("开始");
    }
}
