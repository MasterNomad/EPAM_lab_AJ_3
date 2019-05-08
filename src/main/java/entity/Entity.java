package entity;

import annotations.SecondAnnotation;
import annotations.Secured;

public class Entity {

    @Secured(1)
    public void firstMethod() {

    }

    @SecondAnnotation
    @Secured(value = 2, property = "weak")
    private void secondMethod() {

    }

    public void thirdMethod() {

    }

}
