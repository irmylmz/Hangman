import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Fields {

    String[] field0 = {
            "  |-----------------|" ,
            "  |                 |" ,
            "  |              " ,
            "  |              " ,
            "  |              " ,
            "  |              " ,
            "  |              " ,
            "  |              " ,
            "  |              " ,
            "  |              " ,
            "__|__  "
    };
    String[] field1 = {
            "  |-----------------|" ,
            "  |                 |" ,
            "  |                /\\" ,
            "  |               |   |" ,
            "  |              " ,
            "  |              " ,
            "  |              " ,
            "  |              " ,
            "  |              " ,
            "  |              " ,
            "__|__  "
    };
    String[] field2 = {
            "  |-----------------|" ,
            "  |                 |" ,
            "  |                /\\" ,
            "  |               |   |" ,
            "  |                \\/" ,
            "  |                 |" ,
            "  |              " ,
            "  |              " ,
            "  |              " ,
            "  |              " ,
            "__|__  "
    };
    String[] field3 = {
            "  |-----------------|" ,
            "  |                 |" ,
            "  |                /\\" ,
            "  |               |   |" ,
            "  |                \\/" ,
            "  |                 |" ,
            "  |                /\\|" ,
            "  |                 |" ,
            "  |              " ,
            "  |              " ,
            "__|__  "
    };
    String[] field4 = {
            "  |-----------------|" ,
            "  |                 |" ,
            "  |                /\\" ,
            "  |               |   |" ,
            "  |                \\/" ,
            "  |                 |" ,
            "  |                /\\|" ,
            "  |                 |" ,
            "  |                /\\" ,
            "  |              " ,
            "__|__  "
    };

    // Switch - Case must use


    String[][] fieldList = {
            field0,
            field1,
            field2,
            field3,
            field4
    };

    /*String[] field = fieldList[wrongNumber];
        for (String row : field) {
        System.out.println(row);
    }*/
    public void printField(int wrongNumber) {
        switch (wrongNumber) {
            case 0:
                String[] field0 = fieldList[0];
                for (String row : field0) {
                    System.out.println(row);
                }
                break;
            case 1:
                String[] field1 = fieldList[1];
                for (String row : field1) {
                    System.out.println(row);
                }
                break;
            case 2:
                String[] field2 = fieldList[wrongNumber];
                for (String row : field2) {
                    System.out.println(row);
                }
                break;
            case 3:
                String[] field3 = fieldList[wrongNumber];
                for (String row : field3) {
                    System.out.println(row);
                }
                break;
            case 4:
                String[] field4 = fieldList[wrongNumber];
                for (String row : field4) {
                    System.out.println(row);
                }
                break;
        }
    }
    public boolean isGameContinue(int wrongNumber){
        boolean isGameContinue = false;
        if(wrongNumber == 4){
            isGameContinue = false;
            this.printField(4);
        }
        else {
            isGameContinue = true;
        }
        return isGameContinue;
    }
}
