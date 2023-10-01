package Environments;

public abstract class Environment {
    public String environmentName;
    public String geographyLocation;

    public Environment(String environmentName, String geographyLocation) {
        this.environmentName = environmentName;
        this.geographyLocation = geographyLocation;
    }
}
