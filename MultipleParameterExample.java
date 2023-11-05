package saaz1_01;

class MultipleParameterExample{

        //Example of multiple parameter
        static void carType(String make, int year){
            System.out.println("Hi, Your car is " + make + " made in "+ year);
        }

    public static void main(String[] args) {
        carType("honda", 2022);
        carType("toyota", 2020);
    }
}