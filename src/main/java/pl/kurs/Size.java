package pl.kurs;

public enum Size {
    EXTRA_SMALL("XS"), SMALL("S"), MEDIUM("M"),
    LARGE("L") {
        @Override
        public void printSomething() {
            System.out.println("Hello LARGE!");
        }
    }, EXTRA_LARGE("XL");

    private final String abbreviation;

    Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void printSomething() {
        System.out.println("Hello!");
    }
}
