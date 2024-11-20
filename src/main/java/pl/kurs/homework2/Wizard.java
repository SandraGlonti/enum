package pl.kurs.homework2;

public class Wizard {
    private String name;
    private double health = 200.00;
    private long age;
    private WizardType type;

    public Wizard(String name, double health, long age, WizardType type) {
        this.name = name;
        this.health = health;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public long getAge() {
        return age;
    }

    public WizardType getType() {
        return type;
    }

    public void throwSpell(String spellName, Wizard target) {
        if (this.health <= 0) {
            System.out.println(this.name + " jest martwy i nie może rzucać zaklęć!");
        }
        SpellType spell = getSpellByName(spellName);
        if (spell == null) {
            System.out.println(this.name + " nie zna zaklęcia");
        }
        switch (spell){
            case HEAL -> {
                heal(target);
                break;
            }
            case FIREBALL -> {
                damage(target, 25.0);
                break;
            }
            case LIGHTING_STRIKE -> {
                damage(target,20.0);
                break;
            }


        }
    }

    private SpellType getSpellByName(String spellName) {
        for (SpellType spell : type.getSpells()) {
            if (spell.name().equalsIgnoreCase(spellName)) {
                return spell;
            }
        }return null;
    }
    private void heal(Wizard target) {
        if (target.health <= 0) {
            System.out.println(this.name +" próbuje wskrzesić " + target.name + " !");
            target.health = 50.00;
            System.out.println(target.name + " został wskrzeszony i ma teraz " + target.health + " punktów życia");
        }else {
            double healedHealth = Math.min(200.00, target.health+30);
            System.out.println(this.name + " leczy " + target.name + " o 30 punktów życia");
            target.health = healedHealth;
        }
    }
    private void damage(Wizard target, double damage){
        if(target.health <= 0){
            System.out.println("Nie można atakować martwego zawodnika");
        }
        target.health = Math.max(0.0,target.health-damage);
        System.out.println(this.name + " rzuca zaklęcie na " + target.name + " zadając " + damage + " punktów obrażeń.");
        if (target.health <= 0){
            System.out.println(target.name + " został pokonany!");
        }
    }
}



