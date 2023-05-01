public class Wolf {
    String sex;
    String name;
    int weight;
    int age;
    String color;

    public String move() {
        return "идёт";
    }

    public String seat() {
        return "сидит" ;
    }

    public String run() {
        return "бежит";
    }

    public String howl() {
        return "воет";
    }

    public String hunt() {
        return "охотится";
    }

    public String getSex() {
            return sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}