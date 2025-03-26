package Assignment3;

public class Company {
    private String companyName;
    private Manager manager;

    public Company() {

    }

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public void manager(Manager manager){
        this.manager = manager;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }



    public void getInfo() {
        String managerName;
        managerName = manager.getName();

        String info = "Bedrijfsnaam: " + companyName + " - Manager: " + managerName;
        System.out.println(info);
    }
}
