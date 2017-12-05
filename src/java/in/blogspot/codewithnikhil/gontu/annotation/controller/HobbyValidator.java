package in.blogspot.codewithnikhil.gontu.annotation.controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String>
{

    private String listOfValidHobbies;

    @Override
    public void initialize(IsValidHobby constraintAnnotation)
    {
        System.out.println("Initialize is called ");
        this.listOfValidHobbies = constraintAnnotation.listOfValidHobbies();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context)
    {
        if (value == null)
        {
            return false;
        }

        if (value.toLowerCase().matches(listOfValidHobbies))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
