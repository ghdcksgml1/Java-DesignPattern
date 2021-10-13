package factory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class PeriodicElementImporter {
    public static PeriodicElement parse(String[] items){
        try{
            int number = Integer.parseInt(items[0]);
            String name = items[1];
            String symbol = items[2];
            double weight = Double.parseDouble(items[3]);
            int period = Integer.parseInt(items[4]);
            int group;
            try{
                group = Integer.parseInt(items[5]);
            }catch (Exception e){
                group = 0;
            }
            State state = State.valueOf(items[6]);
            String type;
            try{
                type = items[7];
            }catch (Exception e){
                type = "";
            }

            return PeriodicElementFactory.getInstance(number,name,symbol,weight,period,group,state,type);
        }catch (Exception e){
            System.out.println("Exception1");
        }
        return null;
    }
    public static List<PeriodicElement> loadCSV(String filename){
        List<PeriodicElement> list = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            br.readLine(); // 열 부분 날리기
            String line;
            while((line = br.readLine())!=null) {
                String[] items = line.split(",");
                PeriodicElement p = parse(items);
                list.add(p);
            }
        }catch(Exception e){
            System.out.println("Exception2");
        }
        return list;
    }
}
