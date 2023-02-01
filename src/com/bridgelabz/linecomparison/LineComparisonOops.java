package com.bridgelabz.linecomparison;

public class LineComparisonOops {
    static double xy;
    static double ab;
    static double line(int x1, int y1, int x2, int y2)
    {
        return (xy=Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
    }
    static double line(double x1, double y1, double x2, double y2)
    {
        return (ab=Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
    }
    public static void main(String[] args)
    {
        System.out.println(LineComparisonOops.line(1,1,4,4));
        System.out.println(LineComparisonOops.line(2.5,2.5,4.5,4.5));
        Double lineOne = LineComparisonOops.xy;
        Double lineTwo = LineComparisonOops.ab;
        System.out.println(lineOne.equals(lineTwo));
        System.out.println(lineOne.compareTo(lineTwo));
        int compare = (lineOne.compareTo(lineTwo));
        if (compare == -1) {
            System.out.println("Line xy is Smaller than Line ab");
        } else if (compare == 1) {
            System.out.println("Line xy is Greater than Line ab");
        }else
            System.out.println("Line xy is Equal o Line ab");
    }
}