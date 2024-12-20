package DSA.second_trimester.oops;

public class MyFloat {
    // Define properties here
    int integer;
    int decimal;


    // Define constructor here
    public MyFloat(int integer, int decimal){
        this.integer = integer;
        this.decimal = decimal;
    }

    public MyFloat add(MyFloat other) {
        this.integer = this.integer + other.integer;
        this.decimal = this.decimal + other.decimal;
        if(this.decimal > 9){
            int carry = this.decimal/10;
            this.decimal = this.decimal % 10;
            this.integer = this.integer + carry;
        }
        return this;
    }

    public void printMyFloat(){
        System.out.println(this.integer + "." + this.decimal);
    }
}
/*
MyFloat num1 = new MyFloat(1, 2);
MyFloat num2 = new MyFloat(3, 4);

MyFloat result = num1.add(num2);

System.out.println(result); // Output: 4.6
*/