package statisticker;

import java.util.*;

public class Statistics 
{
    static class Stats{
        public Float average=Float.NaN;
        public Float min= Float.NaN;
        public Float max= Float.NaN;
      }
    
 public static Stats getStatistics(List<Float> numbers) {
      Statistics.Stats s=new Stats();
        if(!numbers.isEmpty())
        {
            s.min= Collections.min(numbers);
            s.max= Collections.max(numbers);
            Float sum=0.0f;
            for(Float num:numbers){
                sum+=num;
            }
            s.average=(Float)sum/numbers.size();
            
        }
        return s;

    }
}
