package Shared.Models;

public class User {
    private String currentAge;
    private String employmentStatus;
    private String annualIncome;
    private String kiwiSaverMemberContribution;
    private String kiwiSaverBalance;
    private String voluntaryContributions;
    private String frequency;
    private String riskProfile;
    private String savingsGoal;

    public User(String currentAgeNew,
                String employmentStatusNew,
                String annualIncomeNew,
                String kiwiSaverMemberContributionNew,
                String kiwiSaverBalanceNew,
                String voluntaryContributionsNew,
                String frequencyNew,
                String riskProfileNew,
                String savingsGoalNew) {
        this.currentAge = currentAgeNew;
        this.employmentStatus = employmentStatusNew;
        this.annualIncome = annualIncomeNew;
        this.kiwiSaverMemberContribution = kiwiSaverMemberContributionNew;
        this.kiwiSaverBalance = kiwiSaverBalanceNew;
        this.voluntaryContributions = voluntaryContributionsNew;
        this.frequency = frequencyNew;
        this.riskProfile = riskProfileNew;
        this.savingsGoal = savingsGoalNew;
    }

    public String getCurrentAge() {
        return currentAge;
    }

    public void setCurrentAge(String currentAge) {
        this.currentAge = currentAge;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public String getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(String annualIncome) {
        this.annualIncome = annualIncome;
    }

    public String getKiwiSaverMemberContribution() {
        return kiwiSaverMemberContribution;
    }

    public void setKiwiSaverMemberContribution(String kiwiSaverMemberContribution) {
        this.kiwiSaverMemberContribution = kiwiSaverMemberContribution;
    }

    public String getKiwiSaverBalance() {
        return kiwiSaverBalance;
    }

    public void setKiwiSaverBalance(String kiwiSaverBalance) {
        this.kiwiSaverBalance = kiwiSaverBalance;
    }

    public String getVoluntaryContributions() {
        return voluntaryContributions;
    }

    public void setVoluntaryContributions(String voluntaryContributions) {
        this.voluntaryContributions = voluntaryContributions;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getRiskProfile() {
        return riskProfile;
    }

    public void setRiskProfile(String riskProfile) {
        this.riskProfile = riskProfile;
    }

    public String getSavingsGoal() {
        return savingsGoal;
    }

    public void setSavingsGoal(String savingsGoal) {
        this.savingsGoal = savingsGoal;
    }
}
