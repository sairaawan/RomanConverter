public class Convert {
    public String number(int num){
        String[] thousands=new String[]{"", "M", "MM", "MMM"};
        String[] hundreds= {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "DM"};
        String[] tens={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        return thousands[num/1000]+
                hundreds[(num%1000)/100]+
                tens[(num%100)/10]+
                units[num%10];
    }
}
