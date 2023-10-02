package Environments;

public abstract class Environment {
    public String environmentName;
    public String typeOfEnvironment;

    public Environment(String environmentName, String typeOfEnvironment) {
        this.environmentName = environmentName;
        this.typeOfEnvironment = typeOfEnvironment;
    }
}
