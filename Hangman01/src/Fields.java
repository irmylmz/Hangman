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
            "  |               |  |" ,
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
            "  |               |  |" ,
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
            "  |               |  |" ,
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
            "  |               |  |" ,
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
        String[] field = fieldList[wrongNumber];
        for (String row : field) {
            System.out.println(row);
        }
    }

}
