package cc.caigunag.cai.event;

public class TestEnum {
    public static void main(String[] args) {
        Code code=Code.ENTER;
        System.out.println(code.getName());
    }
}
enum Code{
    ENTER(13,"Enter",1),
    ESCAPE(14,"escape",2)
    ;
    private int code;
    private String name;
    private int mask;
    Code(int code,String name,int mask){
        this.code=code;
        this.name=name;
        this.mask=mask;
        System.out.println("调用了构造方法："+name);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMask() {
        return mask;
    }

    public void setMask(int mask) {
        this.mask = mask;
    }
}
