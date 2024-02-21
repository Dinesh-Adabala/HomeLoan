package abstractionApplicationDemo;

public class PoliceStation2 extends DistCourt{
    @Override
    protected String fir() {
        String response="complaintFiled";
        return response;
    }

    @Override
    protected String evidence() {
        String response="evidence Submitted";
        return response;
    }
}
