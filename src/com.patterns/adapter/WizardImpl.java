package com.patterns.adapter;

public class WizardImpl implements Wizard{
    @Override
    public void castDestructionSpell() {
        System.out.println("Magic destruction spell: Bla-bla-bla...");
    }

    @Override
    public void shield() {
        System.out.println("Used a shield");
    }

    @Override
    public void portal() {
        System.out.println("Used a portal");
    }
}
