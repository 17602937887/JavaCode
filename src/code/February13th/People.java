package code.February13th;

public class People {

    // 静态变量
    private static int nextId;

    // 实例域
    private String name;
    private int age;
    private int id;

    /**
     * @see <a href='www.hangcc.cn'>这是一个链接<a/>
     */
    public People() {
        System.out.println("无参构造函数执行!");
    }

    public People(String name, int age) {
        System.out.println("全参构造函数执行!");
        this.name = name;
        this.age = age;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        People.nextId = nextId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // 代码块
    {
        System.out.println("代码块1执行");
        this.name = "代码块";
        this.age = 1;
        this.id = ++nextId;
    }

    // 代码块3
    {
        System.out.println("代码块3执行!!!");
    }

    public void show(){
        System.out.println("name = " + this.name + "  age = " + this.age + "   id = " + this.id);
    }

    /**
     * 返回a+b
     * @param a 一个加数
     * @param b 另一个加数
     * @return 返回和
     */
    public int add(int a, int b){
        return a + b;
    }
}
