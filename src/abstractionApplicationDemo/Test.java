package abstractionApplicationDemo;

public class Test {
    public static void main(String[] args) {
        DistCourt ps1 = new PoliceStation1();
        CourtInputs courtInputs= new CourtInputs("cctv footage & witness",
                "theft Case",2);
        System.out.println(ps1.courtCase(courtInputs));
        DistCourt  ps2= new PoliceStation2();
//        CourtInputs courtInputs1= new CourtInputs("videoTape","Hit and run",
//                1);
//        System.out.println(ps2.courtCase(courtInputs1));



    }
}