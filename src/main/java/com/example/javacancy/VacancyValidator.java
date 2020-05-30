package com.example.javacancy;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

public class VacancyValidator implements org.springframework.validation.Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return Vacancy.class.equals(aClass);
    }

    @Override
    public void validate(Object object, Errors errors) {
        Vacancy app = (Vacancy) object;

        ValidationUtils.rejectIfEmpty(errors, "jobTitle", "text.empty");
        ValidationUtils.rejectIfEmpty(errors, "companyName", "companyName.empty");
        ValidationUtils.rejectIfEmpty(errors, "location", "location.empty");
        ValidationUtils.rejectIfEmpty(errors, "experience", "experience.empty");
        ValidationUtils.rejectIfEmpty(errors, "salary", "salary.empty");
        ValidationUtils.rejectIfEmpty(errors, "jobDescription", "jobDescription.empty");

        if(app.getJobTitle().length() < 2 && app.getJobTitle().length() < 40) {
            errors.rejectValue("jobTitle", "Title must be between 2 and 40 characters");
        }

        if(app.getCompanyName().length() < 2 && app.getCompanyName().length() < 40) {
            errors.rejectValue("companyName", "Company name must be between 2 and 40 characters");
        }

        if(app.getSalary() < 0) {
            errors.rejectValue("salary", "Salary can not be negative");
        }

        if(app.getJobDescription().length() < 5 && app.getJobDescription().length() < 5000) {
            errors.rejectValue("jobDescription", "Job description must be between 5 and 5000 characters");
        }
    }
}
