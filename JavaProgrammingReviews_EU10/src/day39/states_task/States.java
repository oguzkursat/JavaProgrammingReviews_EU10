package day39.states_task;

public class States {

    private String name, abbreviation, politicalParty, governor;
    private String senator;
    private int population;
    private double stateTax;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null){
            System.err.println("Invalid.");
            System.exit(1);
        }
        if (name.isEmpty()||name.isBlank()){
            System.err.println("Name can not be blank or empty.");
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation==null){
            System.err.println("Invalid.");
            System.exit(1);
        }
        if (abbreviation.isEmpty()||abbreviation.isBlank()){
            System.err.println("Abbreviation can not be blank or empty.");
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty==null){
            System.err.println("Invalid.");
            System.exit(1);
        }
        if (politicalParty.isEmpty()||politicalParty.isBlank()){
            System.err.println("Political party can not be blank or empty.");
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if (governor==null){
            System.err.println("Invalid.");
            System.exit(1);
        }
        if (governor.isEmpty()||governor.isBlank()){
            System.err.println("Governor party can not be blank or empty.");
        }
        this.governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator==null){
            System.err.println("Invalid.");
            System.exit(1);
        }
        if (senator.isEmpty()||senator.isBlank()){
            System.err.println("Senator party can not be blank or empty.");
        }
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if(population<0){
            System.err.println("Population can not be negative or zero.");
            System.exit(1);
        }
        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if(stateTax<0){
            System.err.println("State tax can not be negative.");
            System.exit(1);
        }
        this.stateTax = stateTax;
    }

    public States(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public String toString() {
        return "States{" +
                "name='" + getName() + '\'' +
                ", abbreviation='" + getAbbreviation() + '\'' +
                ", politicalParty='" + getPoliticalParty() + '\'' +
                ", governor='" + getGovernor() + '\'' +
                ", senator='" + getSenator() + '\'' +
                ", population=" + getPopulation() +
                ", stateTax=" + getStateTax() +
                '}';
    }
}
