public class TimeCalc {
    public static void main(String[] args) {
        // extract hour and minutes from the time string 
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minAdd = Integer.parseInt(args[1]);
        int totalMin = (hours * 60) + minutes + minAdd; //calculate total minutes
        int totalHours = totalMin/60; //calculate total hours
        int newHours = totalHours%24; //mod24 the total hours so the answer is between 0 and 23
        int newMin = totalMin - (totalHours*60); //calculate new total minutes
        //add leading 0 if number is single digit
        String hourString = (newHours<10) ? "0" + newHours : "" + newHours;
        String minuteString = (newMin<10) ? "0" + newMin : "" + newMin;
        System.out.println(hourString + ":" + minuteString);
    }
}
