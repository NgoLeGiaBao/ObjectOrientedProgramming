public class Person {
    protected String name;
    protected int birthyear;

    public Person (String name, int birthyear) {
        this.name = name;
        this.birthyear = birthyear;
    }
    public String getName (){
        return this.name;
    }
    public void setName (String name) {
        this.name = name;
    }
    public int getBirthyear () {
        return this.birthyear;
    }
    public void setBirthyear (int birthyear) {
        this.birthyear = birthyear;
    }
    public String toString () {
        return "Person[" + this.name + "-" + this.birthyear + "]";
    }
}