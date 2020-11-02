package com.example.demo2.mingling;

public abstract class Command {
    protected RequirementGroup rg = new RequirementGroup();

    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();

  //  protected RequirementGroup rg = new RequirementGroup();
    public abstract void execute();
}
