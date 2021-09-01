package patterns.adapter;

public class AdapterTest {

    public static void main(String[] args){
        Fighter fighter = new FighterImpl();
        fighter.attack();
        fighter.defend();
        fighter.escape();

        Wizard wizard = new WizardImpl();
        wizard.castDestructionSpell();
        wizard.shield();
        wizard.portal();

        Fighter wizardFighter = new WizardAdapter(wizard);
        wizardFighter.attack();
        wizardFighter.defend();
        wizardFighter.escape();
    }
}
