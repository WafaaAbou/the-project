import java.util.SplittableRandom;

public class Container {
     int IdNumber;
     int Weight;
     String RemitentCompany;
     String ReceiverCompany;
     int Priority;
     String Description;
     String Country;
     boolean CustomInspection;




    public void setIdNumber(int idNumber) {
        IdNumber = idNumber;
    }

    public void setWeight(int weight){
        weight=weight;
    }
    public void setRemitentCompany(String remitentCompany) {
        RemitentCompany = remitentCompany;
    }

    public void setReceiverCompany(String receiverCompany) {
        ReceiverCompany = receiverCompany;
    }

    public void setPriority(int priority) {
        Priority = priority;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public void setCustomInspection(boolean customInspection) {
        CustomInspection = customInspection;
    }

    public int getIdNumber() {
        return IdNumber;
    }

    public int getWeight() {
        return Weight;
    }

    public String getRemitentCompany() {
        return RemitentCompany;
    }

    public String getReceiverCompany() {
        return ReceiverCompany;
    }

    public int getPriority() {
        return Priority;
    }

    public String getDescription() {
        return Description;
    }

    public String getCountry() {
        return Country;
    }

    public boolean isCustomInspection() {
        return CustomInspection;
    }

    public Container(int idNumber, int weight, String remitentCompany, String receiverCompany, int priority, String description, String country, boolean customInspection) {
        IdNumber = idNumber;
        Weight = weight;
        RemitentCompany = remitentCompany;
        ReceiverCompany = receiverCompany;
        Priority = priority;
        Description = description;
        Country = country;
        CustomInspection = customInspection;
    }
    Container(){

    }
}
