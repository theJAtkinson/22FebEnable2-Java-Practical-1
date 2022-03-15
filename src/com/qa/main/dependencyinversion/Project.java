package com.qa.main.dependencyinversion;

public class Project {
    private BackEndDeveloper back = new BackEndDeveloper();
    private FrontEndDeveloper front = new FrontEndDeveloper();

    public void implement() {
        back.writeCode();
        front.writeCode();
    }
}
