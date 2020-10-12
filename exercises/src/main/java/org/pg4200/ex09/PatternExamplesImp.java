package org.pg4200.ex09;

public class PatternExamplesImp implements PatternExamples {

    @Override
    public String dnaRegex() {
        return "[CGAT]+";
    }

    @Override
    public String telephoneNumberRegex() {
        return "((00|\\+)[0-9]{2})?[0-9]{8}";
    }

    @Override
    public String emailRegex() {
        return "[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*(\\.[a-zA-Z]{2,})";
    }
}
