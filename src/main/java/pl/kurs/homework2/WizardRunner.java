package pl.kurs.homework2;

public class WizardRunner {
    public static void main(String[] args) {
        Wizard gandalf = new Wizard("Gandalf", 300, 150000000,WizardType.WIZARD_OF_WIND);
        Wizard saruman = new Wizard("Saruman", 400, 358645655,WizardType.WIZARD_OF_FIRE);

        System.out.println("Rozpoczynamy walkę pomiędzy " + gandalf.getName() + " a " + saruman.getName() + "!");

        saruman.throwSpell("FIREBALL", gandalf);
        gandalf.throwSpell("HEAL", gandalf);
        gandalf.throwSpell("LIGHTING_STRIKE", saruman);
        saruman.throwSpell("HEAL", saruman);
        saruman.throwSpell("FIREBALL", gandalf);
        gandalf.throwSpell("LIGHTING_STRIKE", saruman);
        saruman.throwSpell("FIREBALL", gandalf);
        saruman.throwSpell("FIREBALL", gandalf);
        gandalf.throwSpell("HEAL", gandalf);
        gandalf.throwSpell("LIGHTING_STRIKE", saruman);
    }
}
