package factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        List<PeriodicElement> list = PeriodicElementImporter.loadCSV("PeriodicElements.csv");
        list.forEach(System.out::println);

        int num;
        do {
            System.out.println("검색 옵션을 설정해주세요.");
            System.out.println("1:number, 2:name, 3:symbol, 4:period, 5:group");
            num = Integer.parseInt(br.readLine());
        }while(num > 5 || num <1 );

        if(num == 1){
            while(true) {
                System.out.println("1~118사이의 숫자를 입력해주세요.");
                int number = Integer.parseInt(br.readLine());
                if(number < 1 || number > 118) continue;
                PeriodicElement element = list.stream().filter(e -> e.getNumber() == number).findAny().orElse(null);
                System.out.println(element.toString());
                break;
            }
        }else if(num == 2){
            while(true) {
                System.out.println("이름을 입력해주세요.");
                String name = br.readLine().toLowerCase();
                // [추가코드]
                List<PeriodicElement> elements = list.stream().filter(e -> KMP.kmp(e.getName().toLowerCase().toCharArray(),name.toCharArray())).collect(Collectors.toList());
                if(elements == null){
                    System.out.println("해당 이름을 찾을 수 없습니다.");
                    continue;
                }
                for(PeriodicElement p : elements){
                    System.out.println(p.toString());
                }
                break;
            }
        }else if(num == 3){
            while(true) {
                System.out.println("기호를 입력해주세요.");
                String symbol = br.readLine().toLowerCase();
                PeriodicElement element = list.stream().filter(e -> e.getSymbol().toLowerCase().equals(symbol)).findAny().orElse(null);
                if(element == null){
                    System.out.println("해당 기호를 찾을 수 없습니다.");
                    continue;
                }
                System.out.println(element.toString());
                break;
            }
        }else if(num == 4){
            while(true) {
                System.out.println("주기를 입력해주세요. (1~7)");
                int period = Integer.parseInt(br.readLine());
                List<PeriodicElement> elements = list.stream().filter(e -> e.getPeriod() == period).collect(Collectors.toList());
                if(elements.isEmpty()){
                    System.out.println("주기를 찾을 수 없습니다.");
                    continue;
                }
                for(PeriodicElement p : elements){
                    System.out.println(p.toString());
                }
                break;
            }
        }else if(num == 5){
            while(true) {
                System.out.println("그룹을 입력해주세요. (1~18)");
                int group = Integer.parseInt(br.readLine());
                List<PeriodicElement> elements = list.stream().filter(e -> e.getGroup() == group).collect(Collectors.toList());
                if(elements.isEmpty()){
                    System.out.println("그룹을 찾을 수 없습니다.");
                    continue;
                }
                for(PeriodicElement p : elements){
                    System.out.println(p.toString());
                }
                break;
            }
        }

    }
}
