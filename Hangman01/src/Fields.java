import java.util.ArrayList;
import java.util.List;

public class Fields {
    List<String> fieldsList = new ArrayList<>();
    String[] field = {
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

    public Fields(int wrongNumber){
        if(wrongNumber == 4){
            System.out.println(field4);
        }else if (wrongNumber == 3){
            System.out.println(field3);
        }else if (wrongNumber == 2){
            System.out.println(field2);
        } else if (wrongNumber == 1){
            System.out.println(field1);
        }else {
            System.out.println(field);
        }
    }
}
