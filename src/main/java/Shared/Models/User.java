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

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public String getAnnualIncome() {
        return annualIncome;
    }

    public String getKiwiSaverMemberContribution() {
        return kiwiSaverMemberContribution;
    }

    public String getKiwiSaverBalance() {
        return kiwiSaverBalance;
    }

    public String getVoluntaryContributions() {
        return voluntaryContributions;
    }

    public String getFrequency() {
        return frequency;
    }

    public String getRiskProfile() {
        return riskProfile;
    }

    public String getSavingsGoal() {
        return savingsGoal;
    }
}
