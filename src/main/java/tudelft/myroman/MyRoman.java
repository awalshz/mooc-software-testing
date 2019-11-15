package tudelft.myroman;

import java.lang.String;

public class MyRoman {

    private int _toInt(String s, int acc){
        s = s.toUpperCase();
        if (s.isEmpty())
            return acc;
        else if (s.charAt(0) == 'I'){
            int d = acc % 10;
            if (d < 3 || (d < 9 && d > 4))
                return _toInt(s.substring(1), acc + 1);
            else throw new ArithmeticException("Wrong configuration: the string is not a roman number");
        }
        else if (s.charAt(0) == 'V'){
            int d = acc % 10;
            if (d == 0)
                return _toInt(s.substring(1), acc + 5);
            else if(d == 1)
                return _toInt(s.substring(1), acc + 3);
            else throw new ArithmeticException("Wrong configuration: the string is not a roman number");
        }
        else if (s.charAt(0) == 'X'){
            int d = acc % 100;
            if (d == 0 || d == 10 || d == 20 || d == 50 || d == 60 || d == 70)
                return _toInt(s.substring(1), acc + 10);
            else if(d % 10 == 1)
                return _toInt(s.substring(1), acc + 8);
            else throw new ArithmeticException("Wrong configuration: the string is not a roman number");
        }
        else if (s.charAt(0) == 'L'){
            int d = acc % 100;
            if (d == 0)
                return _toInt(s.substring(1), acc + 50);
            else if(d == 10)
                return _toInt(s.substring(1), acc + 30);
            else throw new ArithmeticException("Wrong configuration: the string is not a roman number");
        }
        else if (s.charAt(0) == 'C'){
            int d = acc % 1000;
            if (d == 0 || d == 100 || d == 200 || d == 500 || d == 600 || d == 700)
                return _toInt(s.substring(1), acc + 100);
            else if(d % 100== 10)
                return _toInt(s.substring(1), acc + 80);
            else throw new ArithmeticException("Wrong configuration: the string is not a roman number");
        }
        else if (s.charAt(0) == 'D'){
            int d = acc % 1000;
            if (d == 0)
                return _toInt(s.substring(1), acc + 500);
            else if(d == 100)
                return _toInt(s.substring(1), acc + 300);
            else throw new ArithmeticException("Wrong configuration: the string is not a roman number");
        }
        else if (s.charAt(0) == 'M'){
            int d = acc % 1000;
            if (d == 0)
                return _toInt(s.substring(1), acc + 1000);
            else if (d == 100)
                return _toInt(s.substring(1), acc + 800);
            else throw new ArithmeticException("Wrong configuration: the string is not a roman number");
        }
        else throw new ArithmeticException("Wrong configuration: the string is not a roman number");
    }

    public int toInt(String s){
        return _toInt(s, 0);
    }

}
