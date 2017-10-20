package java.solution;

import java.util.HashMap;

public class LC166_Fraction_to_Recurring_Decimal {
	public String fractionToDecimal(int numerator, int denominator) {
        StringBuilder res = new StringBuilder();
        if(numerator == 0) return "0";
        if(numerator < 0 ^ denominator < 0){
            res.append("-");
        }
        long n = Math.abs((long)numerator);
        long d = Math.abs((long)denominator);
        long intPart = n / d;
        long fracPart = n % d;
        res.append(intPart);
        if(fracPart == 0){
            return res.toString();
        }
        res.append(".");
        HashMap<Long, Integer> remain = new HashMap<Long, Integer>();
        HashMap<Long, Long> div = new HashMap<Long, Long>();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(fracPart != 0){
            fracPart *= 10;
            long r = fracPart / d;
            sb.append(r);
            fracPart %= d;
            if(remain.containsKey(fracPart) && r == div.get(fracPart)){
                sb.insert(remain.get(fracPart), "(");
                sb.deleteCharAt(sb.length()-1).append(")");
                break;
            } else {
                remain.put(fracPart, i);
                div.put(fracPart, r);
            }
            i++;
        }
        return res.append(sb).toString();
    }
}
