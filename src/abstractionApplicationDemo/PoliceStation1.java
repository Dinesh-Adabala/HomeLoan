package abstractionApplicationDemo;

public class PoliceStation1 extends DistCourt{

    @Override
    protected String fir() {
        String response="complaintFile";
        return response;
    }

    @Override
    protected String evidence() {
        String response="evidence Submitted";
        return response;
    }
}
