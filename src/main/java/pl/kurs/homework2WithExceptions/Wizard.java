package pl.kurs.homework2WithExceptions;

import pl.kurs.homework2WithExceptions.exceptions.NotEnoughHealthException;
import pl.kurs.homework2WithExceptions.exceptions.WizardIsNullException;

public class Wizard {
    private String name;
    private double health = 200.0;
    private long age;
    private WizardType type;

    public Wizard(String name, long age, WizardType type) {
        this.name = name;
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


    public void throwSpell(String spellName, Wizard target) throws NotEnoughHealthException, WizardIsNullException {
        if (this.health <= 0) {
            throw new NotEnoughHealthException(this.name + " jest martwy i nie może rzucać zaklęć");
        }
        SpellType spell = type.getSpellByName(spellName);
        if (spell == null) {
            throw new WizardIsNullException(this.name + " nie zna takiego zaklęcia!");
        } else {
            executeSpell(spell, target);
        }
    }

    private void executeSpell(SpellType spell, Wizard target) {
        double maxHealth = 200.0;
        double minHealth = 0.0;
        if (spell.equals(SpellType.HEAL)) {

            if (target.health + 30.0 >= maxHealth) {
                target.health = maxHealth;
                System.out.println("Czarodziej " + target.getName() + " został uzdrowiony do maksymalnego poziomu: " + target.health);
            } else {
                target.health += 30.0;
                System.out.println("Czarodziej " + target.getName() + " został uzdorwiony do poziomu: " + target.health);
            }

        } else if (spell.equals(SpellType.LIGHTING_STRIKE)) {
            if (target.health - 20.0 <= minHealth) {
                target.health = minHealth;
                System.out.println("Czarodziej " + target.getName() + " został martwy");
            } else {
                target.health -= 20.0;
                System.out.println("Poziom zdrowia Czarodzieja " + target.getName() + " spadł do poziomu: " + target.health);
            }

        } else if (spell.equals(SpellType.FIREBALL)) {
            if (target.health - 25.0 <= minHealth) {
                target.health = minHealth;
                System.out.println("Czarodziej " + target.getName() + " został martwy");
            } else {
                target.health -= 25.0;
                System.out.println("Poziom zdrowia Czarodzieja " + target.getName() + " spał do poziomu: " + target.health);
            }
        }
    }
}





