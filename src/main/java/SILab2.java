import java.util.*;

public class SILab2 {

    public static List<Integer> function(List<Time> timesList) {
        List<Integer> result = new ArrayList<>();
        //17:32:60
        for (int i = 0; i < timesList.size(); i++) {  //----------1
            int hr = timesList.get(i).getHours();
            int min = timesList.get(i).getMinutes();
            int sec = timesList.get(i).getSeconds();
            if (hr < 0 || hr > 24) { //--------2
                if (hr < 0) {  //-------3
                    throw new RuntimeException("The hours are smaller than the minimum"); //---------4
                } else {//--------5
                    throw new RuntimeException("The hours are grater than the maximum");
                }
            } else if (hr < 24) {//-------6
                if (min < 0 || min > 59) //-------7
                    throw new RuntimeException("The minutes are not valid!");//---------8
                else {//----------9
                    if (sec >= 0 && sec <= 59) //---------10
                        result.add(hr * 3600 + min * 60 + sec); //----------11
                    else//------------12
                        throw new RuntimeException("The seconds are not valid");
                }
            } else if (hr == 24 && min == 0 && sec == 0) {//-------------13
                result.add(hr * 3600 + min * 60 + sec);//---------14
            } else {
                throw new RuntimeException("The time is greater than the maximum");
            }
        }

        return result;  //--------15
    } //--------16
}