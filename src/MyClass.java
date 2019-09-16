public class MyClass {
    //Lokale variabler til vores klasse
    int x;
    boolean lukket = false;

    public static void main(String[] args) {
        MyClass dummy = new MyClass();

        //Vi kalder vores metoder på vores test objekt
        dummy.voidMetode();
        dummy.talMetode();
        dummy.voidMetode();
        dummy.doorStatus();
        dummy.doorStatus();


    }

    //Vi retunere ikke en værdi men vi kan udføre opgaver alligevel
    void voidMetode() {
        System.out.println("Jeg retunere ikke en værdi men jeg kan stadig gøre ting");
        System.out.println("X = " + x);
    }

    //Vi retunere en værdi som kan vi kan sætte til vores klasse variable
    int talMetode() {
        return x = 12;
    }

    //Vi retunere en boolean værdi til vores klasse variable. Denne er lavet public så vi kan tilgå den
    public boolean cloeDoor() {
        return lukket = true;
    }

    //Vi retunere ikke en værdi men vi udføre et stykke arbejde
    void doorStatus() {
        System.out.print("Døren er nu: ");
        if (lukket) {
            System.out.println("Lukket");
        }
        else{
            System.out.println("Åben");
        }
        cloeDoor();
    }
}
