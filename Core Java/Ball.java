public class Ball {
    String color;
    int size;
    String material;
    String game;

    static Ball b1 = new Ball("white", 180, "Rubber", "Football");
    static Ball b2 = new Ball("red", 80, "Rubber", "Cricket");

    // contructor -> a method of className
    public Ball(String color, int size, String material, String game) {
        this.color = color; // setting the value
        this.size = size;
        this.material = material;
        this.game = game;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "Ball [color=" + color + ", game=" + game + ", material=" + material + ", size=" + size + "]";
    }

    
    // Runner
    public static void main(String[] args) {
        System.out.println(b1.toString()); // it convert the object into String
        System.out.println(b2.toString());
    }
}
