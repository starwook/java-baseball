package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
    }

    public static List<Integer> reComputerNumber(){
        List<Integer> computer = new ArrayList<>();
        while(computer.size()<3){
            int randomNumber = Randoms.pickNumberInRange(1,9);
            if(!computer.contains(randomNumber)){
                computer.add(randomNumber);
            }
        }
        return computer;
    }

    public static boolean checkTwoNumbersAreSame(int num1,int num2){
        if(num1 ==num2){
            return true;
        }
        return false;
    }

    public static void checkUserInput(String userString){
        if(userString.charAt(0)=='0'){
            throw new IllegalStateException();
        }
        if(userString.length()!=3){ //이런 건 메소드로 나누는게 좋은가?
            throw new IllegalStateException();
        }
        for(int i=0;i<userString.length();i++){
            char c = userString.charAt(i);
            if(c<'0' || c >'9'){
                throw new IllegalStateException();
            }
        }
    }
}
