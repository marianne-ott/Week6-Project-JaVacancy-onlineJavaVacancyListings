package com.example.javacancy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.concurrent.ThreadLocalRandom;

@Entity
public class Vacancy implements Comparable<Vacancy> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String jobTitle;
    private String companyName;
    private Location location;
    private Experience experience;
    private Integer salary;
    private String jobDescription;
    private String jobId;
    private int searchRelevance;

    public Vacancy() {
    }

    public Vacancy(String jobTitle, String companyName, Location location, Experience experience, Integer salary, String jobDescription) {
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.location = location;
        this.experience = experience;
        this.salary = salary;
        this.jobDescription = jobDescription;
        this.searchRelevance = 0;

        // Add random job ID
        ThreadLocalRandom random = ThreadLocalRandom.current();
        this.jobId = String.valueOf(random.nextInt(100000, 999999));

        //applicants = new ArrayList<>();
    }

    public Vacancy(String job_id, String job_title, String company_name, String location, String experience, int salary, String job_description) {
        this.jobId = job_id;
        this.jobTitle = job_title;
        this.companyName = company_name;
        this.location = Location.valueOf(location);
        this.experience = Experience.valueOf(experience);
        this.salary = salary;
        this.jobDescription = job_description;

    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Location getLocation() {
        return location;
    }

    public Experience getExperience() {
        return experience;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public String getJobId() {
        return jobId;
    }

    public void setSearchRelevance(int searchRelevance) {
        this.searchRelevance = searchRelevance;
    }

    public int getSearchRelevance() {
        return searchRelevance;
    }

    @Override
    public int compareTo(Vacancy v) {
        return Integer.compare(v.getSearchRelevance(), searchRelevance);
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

}
