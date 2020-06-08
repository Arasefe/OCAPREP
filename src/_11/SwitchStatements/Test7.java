package _11.SwitchStatements;

public class Test7 {
    public static void main(String[] args) {

    }
    private int getSortOrder(String firstName, final String lastName){
        String middleName="Aras Efe";
        final String suffix="Jr.";
        int ID=0;

        switch (firstName){
            case "Tulpar":
                return 34;
            /**
            case middleName:
                ID=5;
                break;
            case suffix:
                ID=12;
             case lastName:
                ID=8;
                break;
             case 5:
                ID=7;
                break;
             case 'C';
                ID=10;
                break;
             case DayOfWeek.SUNDAY:
                ID=15;
                break;
             */

        }
        return ID;
    }

}
