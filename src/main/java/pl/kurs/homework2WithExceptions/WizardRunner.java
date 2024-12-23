package pl.kurs.homework2WithExceptions;

import pl.kurs.homework2WithExceptions.exceptions.NotEnoughHealthException;
import pl.kurs.homework2WithExceptions.exceptions.WizardIsNullException;

public class WizardRunner {
    public static void main(String[] args)throws NotEnoughHealthException, WizardIsNullException {
        Wizard gandalf = new Wizard("Gandalf", 150000000, WizardType.WIZARD_OF_WIND);
        Wizard saruman = new Wizard("Saruman", 358645655, WizardType.WIZARD_OF_FIRE);

        System.out.println("Rozpoczynamy walkę pomiędzy " + gandalf.getName() + " a " + saruman.getName() + "!");
        try {
            saruman.throwSpell("FIREBALL", gandalf);
            gandalf.throwSpell(null, gandalf);
            gandalf.throwSpell("LIGHTING_STRIKE", saruman);
            saruman.throwSpell("HEAL", saruman);
            saruman.throwSpell("FIREBALL", gandalf);
            gandalf.throwSpell("LIGHTING_STRIKE", saruman);
            saruman.throwSpell("FIREBALL", gandalf);
            saruman.throwSpell("FIREBALL", gandalf);
            gandalf.throwSpell("HEAL", gandalf);
            gandalf.throwSpell("LIGHTING_STRIKE", saruman);
        }catch (NotEnoughHealthException | WizardIsNullException e){
            System.out.println(e.getMessage());
        }
    }
}
