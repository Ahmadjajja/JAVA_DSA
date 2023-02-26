// Calculate CGPA Java Program

// The formula for calculating CGPA (Cumulative Grade Point Average) at the University of Agriculture Faisalabad is as follows:

// CGPA = Total Grade Points Earned / Total Credit Hours Attempted
// Grading point sheet:   http://www.uaf.edu.pk/controller_office/con_quality_points.html

import java.util.*;

public class UAF_CGPA_Calculator45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double TotalCGPAPoints = 0;
        double TotalCreditHours = 0;
        while (true) {
            int creditHours = 0;
            int marksObtained = 0;

            while (true) {
                System.out.println("Enter credit hours of your subject(1 - 5): ");
                creditHours = input.nextInt();
                if (creditHours > 5 || creditHours < 1) {
                    System.out.println("Invalid Credit Hours!");
                    continue;
                }
                break;
            }

            while (true) {
                if (creditHours == 1) {
                    System.out.println("Enter obtained marks of your subject(0 - 20): ");
                    marksObtained = input.nextInt();
                    if (marksObtained < 0 || marksObtained > 20) {
                        System.out.println("Invalid Marks!");
                        continue;
                    }
                    TotalCreditHours += creditHours;
                    ArrayList<Object> OneCreditHourGradingPoints = new ArrayList<Object>(
                            Arrays.asList(1, 1.5, 2, 2.33, 2.67, 3, 3.33, 3.67));
                    if (marksObtained < 8) {
                        TotalCGPAPoints = TotalCGPAPoints + 0;
                    } else if (marksObtained > 15) {
                        TotalCGPAPoints = TotalCGPAPoints + 4;
                    } else {
                        // below line means that we can't store Object type to Double type, that's why
                        // used here type guard for handling each type situation
                        TotalCGPAPoints = TotalCGPAPoints
                                + (OneCreditHourGradingPoints.get(marksObtained - 8) instanceof Double
                                        ? (double) OneCreditHourGradingPoints.get(marksObtained - 8)
                                        : (int) OneCreditHourGradingPoints.get(marksObtained - 8));
                    }
                    break;
                } else if (creditHours == 2) {
                    System.out.println("Enter obtained marks of your subject(0 - 40): ");
                    marksObtained = input.nextInt();
                    if (marksObtained < 0 || marksObtained > 40) {
                        System.out.println("Invalid Marks!");
                        continue;
                    }
                    TotalCreditHours += creditHours;
                    ArrayList<Object> OneCreditHourGradingPoints = new ArrayList<Object>(
                            Arrays.asList(2, 2.5, 3, 3.5, 4, 4.33, 4.67, 5, 5.33, 5.67, 6, 6.33, 6.67, 7, 7.33, 7.67));
                    if (marksObtained < 16) {
                        TotalCGPAPoints = TotalCGPAPoints + 0;
                    } else if (marksObtained > 31) {
                        TotalCGPAPoints = TotalCGPAPoints + 8;
                    } else {
                        // below line means that we can't store Object type to Double type, that's why
                        // used here type guard for handling each type situation
                        TotalCGPAPoints = TotalCGPAPoints
                                + (OneCreditHourGradingPoints.get(marksObtained - 16) instanceof Double
                                        ? (double) OneCreditHourGradingPoints.get(marksObtained - 16)
                                        : (int) OneCreditHourGradingPoints.get(marksObtained - 16));
                    }
                    break;
                } else if (creditHours == 3) {
                    System.out.println("Enter obtained marks of your subject(0 - 60): ");
                    marksObtained = input.nextInt();
                    if (marksObtained < 0 || marksObtained > 60) {
                        System.out.println("Invalid Marks!");
                        continue;
                    }
                    TotalCreditHours += creditHours;
                    ArrayList<Object> OneCreditHourGradingPoints = new ArrayList<Object>(
                            Arrays.asList(3, 3.5, 4, 4.5, 5, 5.5, 6, 6.33, 6.67, 7, 7.33, 7.67, 8, 8.33, 8.67, 9, 9.33,
                                    9.67, 10, 10.33, 10.67, 11, 11.33, 11.67));
                    if (marksObtained < 24) {
                        TotalCGPAPoints = TotalCGPAPoints + 0;
                    } else if (marksObtained > 47) {
                        TotalCGPAPoints = TotalCGPAPoints + 12;
                    } else {
                        // below line means that we can't store Object type to Double type, that's why
                        // used here type guard for handling each type situation
                        TotalCGPAPoints = TotalCGPAPoints
                                + (OneCreditHourGradingPoints.get(marksObtained - 24) instanceof Double
                                        ? (double) OneCreditHourGradingPoints.get(marksObtained - 24)
                                        : (int) OneCreditHourGradingPoints.get(marksObtained - 24));
                    }
                    break;
                } else if (creditHours == 4) {
                    System.out.println("Enter obtained marks of your subject(0 - 80): ");
                    marksObtained = input.nextInt();
                    if (marksObtained < 0 || marksObtained > 80) {
                        System.out.println("Invalid Marks!");
                        continue;
                    }
                    TotalCreditHours += creditHours;
                    ArrayList<Object> OneCreditHourGradingPoints = new ArrayList<Object>(
                            Arrays.asList(4, 4.5, 5, 5.5, 6, 6.5, 7, 7.5, 8, 8.33, 8.67, 9, 9.33, 9.67, 10, 10.33,
                                    10.67, 11, 11.33, 11.67, 12, 12.33, 12.67, 13, 13.33, 13.67, 14, 14.33, 14.67, 15,
                                    15.33, 15.67));
                    if (marksObtained < 32) {
                        TotalCGPAPoints = TotalCGPAPoints + 0;
                    } else if (marksObtained > 63) {
                        TotalCGPAPoints = TotalCGPAPoints + 16;
                    } else {
                        // below line means that we can't store Object type to Double type, that's why
                        // used here type guard for handling each type situation
                        TotalCGPAPoints = TotalCGPAPoints
                                + (OneCreditHourGradingPoints.get(marksObtained - 32) instanceof Double
                                        ? (double) OneCreditHourGradingPoints.get(marksObtained - 32)
                                        : (int) OneCreditHourGradingPoints.get(marksObtained - 32));
                    }
                    break;
                } else if (creditHours == 5) {
                    System.out.println("Enter obtained marks of your subject(0 - 100): ");
                    marksObtained = input.nextInt();
                    if (marksObtained < 0 || marksObtained > 100) {
                        System.out.println("Invalid Marks!");
                        continue;
                    }
                    TotalCreditHours += creditHours;
                    ArrayList<Object> OneCreditHourGradingPoints = new ArrayList<Object>(
                            Arrays.asList(5, 5.5, 6, 6.5, 7, 7.5, 8, 8.5, 9, 9.5, 10, 10.33, 10.67, 11, 11.33, 11.67,
                                    12, 12.33, 12.67, 13, 13.33, 13.67, 14, 14.33, 14.67, 15, 15.33, 15.67, 16, 16.33,
                                    16.67, 17, 17.33, 17.67, 18, 18.33, 18.67, 19, 19.33, 19.67));
                    if (marksObtained < 40) {
                        TotalCGPAPoints = TotalCGPAPoints + 0;
                    } else if (marksObtained > 79) {
                        TotalCGPAPoints = TotalCGPAPoints + 20;
                    } else {
                        // below line means that we can't store Object type to Double type, that's why
                        // used here type guard for handling each type situation
                        TotalCGPAPoints = TotalCGPAPoints
                                + (OneCreditHourGradingPoints.get(marksObtained - 40) instanceof Double
                                        ? (double) OneCreditHourGradingPoints.get(marksObtained - 40)
                                        : (int) OneCreditHourGradingPoints.get(marksObtained - 40));
                    }
                    break;
                }
            }

            System.out.println("Would you like add marks of another subject? (TYPE YES / NO)");
            String permission = input.next().trim(); // .trim() will remove extra spaces around word store in permission
                                                     // variable
            if ((permission).equalsIgnoreCase("yes")) {
                continue;
            } else {
                System.out.println("You have got " + (Math.round((TotalCGPAPoints / TotalCreditHours) * 100.0) / 100.0)
                        + " CGPA from 4.0");
                break;
            }
        }

    }
}
