package abstractionApplicationDemo;

public abstract class DistCourt {
    public String courtCase(CourtInputs courtInputs){
        fir();
        if(fir().equals("complaintFiled")){

            //System.out.println(" evidence are not provide ");
            if(evidence().equals("evidence Submitted")) {
                System.out.println(" evidence submitted successfully");
                return "you are sentenced to a three-year jail term";
            }
            else {
                System.out.println("evidence is not provided");
                return "submit evidence on next hearing";
            }
        }
        else{
            return "you free from imprisonment";
        }
    }
    protected abstract String fir();
    protected abstract String evidence();
}
