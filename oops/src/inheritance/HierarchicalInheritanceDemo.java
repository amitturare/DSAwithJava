package day3_inheritance;

class Parent1 {
    protected int id;
    protected String name;

    public Parent1 (int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void show() {
        System.out.println("PARENT: " + id + " " + name);
    }
}

class Child1 extends Parent1 {
    protected int panCardNo;

    public Child1 (int id, String name, int panCardNo) {
        super(id, name);
        this.panCardNo = panCardNo;
    }

    public void show() {
        System.out.println("CHILD1 " + id + " " + name + " " + panCardNo);

        super.id = 110;
        super.name = "SRK";
        super.show();
    }
}

class Child2 extends Parent1 {
    protected int panCardNo;

    public Child2 (int id, String name, int panCardNo) {
        super(id, name);
        this.panCardNo = panCardNo;
    }

    public void show() {
        System.out.println("CHILD2 " + id + " " + name + " " + panCardNo);

        super.id = 110;
        super.name = "SRK";
        super.show();
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Child1 c1 = new Child1(101, "Aryan", 123);
        c1.show();

        Child2 c2 = new Child2(102, "Suhana", 231);
        c2.show();
    }
}
