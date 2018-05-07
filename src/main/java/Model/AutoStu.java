package Model;

import ImpServer.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("autoStu") //指定Bean的id
public class AutoStu {
    @Value("4")//为int String 等基本方法引入的装配注解
    private int age;
    //可以标注到任意方法上   构造器方法上    标注属性上
    //当Autowried标注多个构造器时 将会选择参数最多的那个构造器注入
    //该注解有强契约性  必须存在可以装配的bean  按照byType装配
    //required属性表明  当找不到存在的bean时可以将值设置为null

    @Autowired
    @Qualifier("song2")//当存在多个bean时  限定id为song2来注入  byName方式
    private Song s;

    @Autowired
    private mo mo;

    public AutoStu() { }
    public  AutoStu (Song s ,mo mo){
        this.mo = mo;
        this.s =s;
    }
    public void show(){
        System.out.println(age);
        System.out.println(mo.b);
        s.pring();
    }
}
