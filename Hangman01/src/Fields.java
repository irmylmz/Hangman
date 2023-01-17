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

    boolean isRunning = true;
    int stage=0;
    public void printField() {
            String[] fields = fieldList[this.stage];
            for (String row : fields) {
                System.out.println(row);
            }
    }
}
