
class GenericClass<T>{
    T x;
    T y;
    public void display() {
        System.out.println("The values of x "+ x  +" and y " + y);
    }
}

public class GenericSource {

    public static void main(String[] args) {
        GenericClass<Integer> obj=new GenericClass();
        obj.x=34;
        obj.y=45;

        GenericClass<Float> objF=new GenericClass();
        objF.x=45.6F;

    }
}



