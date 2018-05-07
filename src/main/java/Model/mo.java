package Model;

//单例类
public class mo {
    public int b = 1000;
    private mo(){ }
    private static class singmo{
        static mo a = new mo();
    }
    public static mo getIn(){
        return singmo.a;
    }
}
