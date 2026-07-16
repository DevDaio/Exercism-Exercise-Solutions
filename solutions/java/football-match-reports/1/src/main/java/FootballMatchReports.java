import java.awt.DefaultFocusTraversalPolicy;

public class FootballMatchReports {    
    public static String onField(int shirtNum) {
        switch (shirtNum){
            case 1 : return "goalie".toString(); 
            case 2 : return "left back".toString();
            case 3, 4 : return "center back".toString();
            case 5 : return "right back".toString();
            case 6,7,8 : return "midfielder".toString();
            case 9 : return "left wing".toString(); 
            case 10 : return "striker".toString();
            case 11 : return "right wing".toString();
            default : return "invalid".toString();
        }
    }
}
