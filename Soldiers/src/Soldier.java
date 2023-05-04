public class Soldier {
    String name;
    String soldier;
    int age;

    public Soldier(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void age(){

        if(this.age >= 18){
            this.soldier = "Private (E-2)";
        }
        if(this.age >= 19){
            this.soldier = "Private First Class (E-3)";
        }
        if(this.age >= 20){
            this.soldier = "Specialist/Corporal (E-4)";
        }
        else if(this.age >= 22){
            this.soldier = "Sergeant (E-5)";
        }
    }

    public void print(){
        System.out.println(this.soldier + ", " + this.name + " " + this.age + " years old.");
    }
}
