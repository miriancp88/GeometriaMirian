import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Circulo_MRCPTest {

    @Test
    void area() {
        Circulo_MRCP r1 = new Circulo_MRCP(7,"circulo");
                System.out.println("Area de radio 7 es: "+r1.area());

        Circulo_MRCP r2 = new Circulo_MRCP(0,"circulo");
        System.out.println("Area de radio 0 es: "+r2.area());

        Circulo_MRCP r3 = new Circulo_MRCP(-3,"circulo");
        System.out.println("Area de radio -3 es: "+r3.area());
    }


    @Test
    void perimetro() {
        Circulo_MRCP p1 = new Circulo_MRCP(7,"circulo");
        System.out.println("Perimetro de radio 7 es: "+p1.perimetro());

        Circulo_MRCP p2 = new Circulo_MRCP(0,"circulo");
        System.out.println("Perimetro de radio 0 es: "+p2.perimetro());

        Circulo_MRCP p3 = new Circulo_MRCP(-3,"circulo");
        System.out.println("Perimetro de radio -3 es: "+p3.perimetro());
    }
}