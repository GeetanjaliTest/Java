package package6;

//interface would define the specifications of how the class would act
//they can contain constants, default methods, static methods, method signatures, nested types
//The implementation of the interface is to be provided by the child class
//interface will force to declare and initialize the variables as public static final

interface Bicycle {
    void applyBrake(int decrement);
    void speedUp(int increment);
}
