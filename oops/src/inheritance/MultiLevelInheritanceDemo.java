package day3_inheritance;

class Parent {
    protected int id;
    protected String name;
    protected  int panCardNo;

    public Parent(int id, String name, int panCardNo) {
        this.id = id;
        this.name = name;
        this.panCardNo = panCardNo;
    }

    // Methods
    public void show() {
        System.out.println("PARENT: " + id + " " + name + " " + panCardNo);
    }
}

class MiddleChild extends Parent {
    protected int aadharCardNo;

    public MiddleChild(int id, String name, int panCardNo, int aadharCardNo) {
        super(id, name, panCardNo);
        this.aadharCardNo = aadharCardNo;
    }

    public void show() {
        System.out.println("MIDDLE CHILD: " + id + " " + name + " " + panCardNo + " " + aadharCardNo);

        super.id = 120;
        super.name = "Mahesh Bhatt";
        super.panCardNo = 789;
        super.show();
    }
}

class Child extends MiddleChild {
    protected int passportNo;

    public Child(int id, String name, int panCardNo, int aadharCardNo, int passportNo) {
        super(id, name, panCardNo, aadharCardNo);
        this.passportNo = passportNo;
    }

    public void show() {
        System.out.println("CHILD: " + id + " " + name + " " + panCardNo + " " + aadharCardNo + " " + passportNo);

        super.id = 110;
        super.name = "Alia Bhatt";
        super.panCardNo = 456;
        super.aadharCardNo = 456;
        super.show();
    }
}

public class MultiLevelInheritanceDemo {
    public static void main(String[] args) {
        Child c = new Child(100, "Raha", 123, 123, 123);
        c.show();
    }
}
