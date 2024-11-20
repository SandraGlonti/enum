package pl.kurs.homework1.model;

public enum Position {
    SZEREGOWY(3000),
    KAPRAL(3500),
    SIERŻANT(4000),
    PORUCZNIK(4500),
    KAPITAN(5000),
    MAJOR(5500);

    private final int baseSalary;


    Position(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

}
