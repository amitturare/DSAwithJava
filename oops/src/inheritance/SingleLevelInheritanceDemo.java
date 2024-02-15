package day3_inheritance;

class GrandParent {
    protected int id;
    protected String name;
    protected int panCardId;

    public GrandParent(int id, String name, int panCardId) {
        this.id = id;
        this.name = name;
        this.panCardId = panCardId;
    }

    // toString
    public void show() {
        System.out.println("GrandParent: " + id + " " + name + " " + panCardId);
    }
}

class MiddleParent extends GrandParent {
    protected int aadharCardNumber;

    public MiddleParent(int id, String name, int panCardId, int aadharCardNumber) {
        super(id, name, panCardId);
        this.aadharCardNumber = aadharCardNumber;
    }

    public void show() {
        System.out.println("MiddleParent: " + id + " " + name + " " + panCardId + " " + aadharCardNumber);

        super.id = 121;
        super.name = "Dharmendar";
        super.panCardId = 12345;
        super.show(); // super., helps to show parent details also
    }
}

public class SingleLevelInheritanceDemo {
    public static void main(String[] args) {
//        Parent p = new Parent();
//        p.setValues(121, "Dharmendra Paji", 12345);
//        p.show();

        MiddleParent c = new MiddleParent(131, "Sunny Deol", 5678, 12345687);
        c.show();
    }
}
