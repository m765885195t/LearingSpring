package Model;

import org.springframework.stereotype.Component;

//单例类
public class mo {
    public static int b = 1000;
    private mo(){ }
    private static class singmo{
        static mo a = new mo();
    }
    public static mo getIn(){
        return singmo.a;
    }
}
