package com.example.javacancy;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

public class ApplicationValidator implements org.springframework.validation.Validator {

    boolean isValidNumber = true;


    @Override
    public boolean supports(Class<?> aClass) {
        return Application.class.equals(aClass);
    }

    @Override
    public void validate(Object object, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "firstName", "firstName.empty");
        ValidationUtils.rejectIfEmpty(errors, "lastName", "lastName.empty");
        ValidationUtils.rejectIfEmpty(errors, "email", "email.empty");
        ValidationUtils.rejectIfEmpty(errors, "phoneNumber", "phoneNumber.empty");
        ValidationUtils.rejectIfEmpty(errors, "applicationText", "applicationText.empty");

        Application application = (Application) object;

        if (application.getFirstName().length() < 2 || application.getFirstName().length() > 24) {
            errors.rejectValue("firstName", "firstName.length");
        }
        if (application.getLastName().length() < 2 || application.getLastName().length() > 24) {
            errors.rejectValue("lastName", "lastName.length");
        }
        if (application.getApplicationText().length() < 5 || application.getApplicationText().length() > 5000) {
            errors.rejectValue("applicationText", "applicationText.length");
        }
        if (application.getPhoneNumber().length() < 8 || application.getPhoneNumber().length() > 15) {
            errors.rejectValue("phoneNumber", "phoneNumber.length");
        }

        if (!validNumber(application, isValidNumber)) {
            errors.rejectValue("phoneNumber", "phoneNumber.digit");
        }

        if (application.getEmail().length() > 40 || !application.getEmail().contains("@")) {
            errors.rejectValue("email", "NotValid.customer.email");
        }
    }

    public boolean validNumber(Application application, boolean isValidNumber) {
        if (application.getPhoneNumber().matches(".*[a-z].*")) {
            isValidNumber = false;
        }
        return isValidNumber;
    }
}

