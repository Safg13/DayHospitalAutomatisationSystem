package dhas.diary.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class IntravesicalScheme {

    public static void getSchemeMonday14(String dateOfHospitalisation, int drugChoice) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendarOf2ndDiary = Calendar.getInstance(); //������� ������ ���������
        calendarOf2ndDiary.setTime(sdf.parse(dateOfHospitalisation)); //������ ��� � ������
        Calendar calendarOf3rdDiary = Calendar.getInstance();
        calendarOf3rdDiary.setTime(sdf.parse(dateOfHospitalisation));
        Calendar calendarOf4thDiary = Calendar.getInstance();
        calendarOf4thDiary.setTime(sdf.parse(dateOfHospitalisation));
        Calendar calendarOf5thDiary = Calendar.getInstance();
        calendarOf5thDiary.setTime(sdf.parse(dateOfHospitalisation));
        Calendar calendarOf6thDiary = Calendar.getInstance();
        calendarOf6thDiary.setTime(sdf.parse(dateOfHospitalisation));
        Calendar calendarOf7thDiary = Calendar.getInstance();
        calendarOf7thDiary.setTime(sdf.parse(dateOfHospitalisation));

        calendarOf2ndDiary.add(Calendar.DATE, 2);  // number of days to add
        calendarOf3rdDiary.add(Calendar.DATE, 4);
        calendarOf4thDiary.add(Calendar.DATE, 7);
        calendarOf5thDiary.add(Calendar.DATE, 9);
        calendarOf6thDiary.add(Calendar.DATE, 11);
        calendarOf7thDiary.add(Calendar.DATE, 14);

        String dateOf2ndDiary = sdf.format(calendarOf2ndDiary.getTime());
        String dateOf3rdDiary = sdf.format(calendarOf3rdDiary.getTime());
        String dateOf4thDiary = sdf.format(calendarOf4thDiary.getTime());
        String dateOf5thDiary = sdf.format(calendarOf5thDiary.getTime());
        String dateOf6thDiary = sdf.format(calendarOf6thDiary.getTime());
        String dateOf7thDiary = sdf.format(calendarOf7thDiary.getTime());

        System.out.println(dateOfHospitalisation);
        Diary.getIntravesicalTherapyDiary(drugChoice);
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf2ndDiary);
        Diary.getDiary();
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf3rdDiary + Diary.getHeadOfDepartmentRounds());
        Diary.getDiary();
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf4thDiary);
        Diary.getIntravesicalTherapyDiary(drugChoice);
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf5thDiary);
        Diary.getDiary();
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf6thDiary + Diary.getHeadOfDepartmentRounds());
        Diary.getDiary();
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf7thDiary);
        Diary.getIntravesicalTherapyDischargeDiary(drugChoice);
        Diary.getAttendingPhysician();
    }

    public static void getSchemeTuesday14(String dateOfHospitalisation, int drugChoice) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendarOf2ndDiary = Calendar.getInstance(); //������� ������ ���������
        calendarOf2ndDiary.setTime(sdf.parse(dateOfHospitalisation)); //������ ��� � ������
        Calendar calendarOf3rdDiary = Calendar.getInstance();
        calendarOf3rdDiary.setTime(sdf.parse(dateOfHospitalisation));
        Calendar calendarOf4thDiary = Calendar.getInstance();
        calendarOf4thDiary.setTime(sdf.parse(dateOfHospitalisation));
        Calendar calendarOf5thDiary = Calendar.getInstance();
        calendarOf5thDiary.setTime(sdf.parse(dateOfHospitalisation));
        Calendar calendarOf6thDiary = Calendar.getInstance();
        calendarOf6thDiary.setTime(sdf.parse(dateOfHospitalisation));
        Calendar calendarOf7thDiary = Calendar.getInstance();
        calendarOf7thDiary.setTime(sdf.parse(dateOfHospitalisation));
        Calendar calendarOf8thDiary = Calendar.getInstance();
        calendarOf8thDiary.setTime(sdf.parse(dateOfHospitalisation));
        Calendar calendarOf9thDiary = Calendar.getInstance();
        calendarOf9thDiary.setTime(sdf.parse(dateOfHospitalisation));

        calendarOf2ndDiary.add(Calendar.DATE, 1);  // number of days to add
        calendarOf3rdDiary.add(Calendar.DATE, 3);
        calendarOf4thDiary.add(Calendar.DATE, 6);
        calendarOf5thDiary.add(Calendar.DATE, 7);
        calendarOf6thDiary.add(Calendar.DATE, 8);
        calendarOf7thDiary.add(Calendar.DATE, 10);
        calendarOf8thDiary.add(Calendar.DATE, 13);
        calendarOf9thDiary.add(Calendar.DATE, 14);

        String dateOf2ndDiary = sdf.format(calendarOf2ndDiary.getTime());
        String dateOf3rdDiary = sdf.format(calendarOf3rdDiary.getTime());
        String dateOf4thDiary = sdf.format(calendarOf4thDiary.getTime());
        String dateOf5thDiary = sdf.format(calendarOf5thDiary.getTime());
        String dateOf6thDiary = sdf.format(calendarOf6thDiary.getTime());
        String dateOf7thDiary = sdf.format(calendarOf7thDiary.getTime());
        String dateOf8thDiary = sdf.format(calendarOf8thDiary.getTime());
        String dateOf9thDiary = sdf.format(calendarOf9thDiary.getTime());

        System.out.println(dateOfHospitalisation);
        Diary.getIntravesicalTherapyDiary(drugChoice);
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf2ndDiary);
        Diary.getDiary();
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf3rdDiary + Diary.getHeadOfDepartmentRounds());
        Diary.getDiary();
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf4thDiary);
        Diary.getDiary();
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf5thDiary);
        Diary.getIntravesicalTherapyDiary(drugChoice);
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf6thDiary);
        Diary.getDiary();
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf7thDiary + Diary.getHeadOfDepartmentRounds());
        Diary.getDiary();
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf8thDiary);
        Diary.getDiary();
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf9thDiary);
        Diary.getIntravesicalTherapyDischargeDiary(drugChoice);
        Diary.getAttendingPhysician();
    }

    public static void getSchemeWednesday14(String dateOfHospitalisation, int drugChoice) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendarOf2ndDiary = Calendar.getInstance(); //������� ������ ���������
        calendarOf2ndDiary.setTime(sdf.parse(dateOfHospitalisation)); //������ ��� � ������
        Calendar calendarOf3rdDiary = Calendar.getInstance();
        calendarOf3rdDiary.setTime(sdf.parse(dateOfHospitalisation));
        Calendar calendarOf4thDiary = Calendar.getInstance();
        calendarOf4thDiary.setTime(sdf.parse(dateOfHospitalisation));
        Calendar calendarOf5thDiary = Calendar.getInstance();
        calendarOf5thDiary.setTime(sdf.parse(dateOfHospitalisation));
        Calendar calendarOf6thDiary = Calendar.getInstance();
        calendarOf6thDiary.setTime(sdf.parse(dateOfHospitalisation));
        Calendar calendarOf7thDiary = Calendar.getInstance();
        calendarOf7thDiary.setTime(sdf.parse(dateOfHospitalisation));

        calendarOf2ndDiary.add(Calendar.DATE, 2);  // number of days to add
        calendarOf3rdDiary.add(Calendar.DATE, 5);
        calendarOf4thDiary.add(Calendar.DATE, 7);
        calendarOf5thDiary.add(Calendar.DATE, 9);
        calendarOf6thDiary.add(Calendar.DATE, 12);
        calendarOf7thDiary.add(Calendar.DATE, 14);

        String dateOf2ndDiary = sdf.format(calendarOf2ndDiary.getTime());
        String dateOf3rdDiary = sdf.format(calendarOf3rdDiary.getTime());
        String dateOf4thDiary = sdf.format(calendarOf4thDiary.getTime());
        String dateOf5thDiary = sdf.format(calendarOf5thDiary.getTime());
        String dateOf6thDiary = sdf.format(calendarOf6thDiary.getTime());
        String dateOf7thDiary = sdf.format(calendarOf7thDiary.getTime());

        System.out.println(dateOfHospitalisation);
        Diary.getIntravesicalTherapyDiary(drugChoice);
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf2ndDiary + Diary.getHeadOfDepartmentRounds());
        Diary.getDiary();
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf3rdDiary);
        Diary.getDiary();
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf4thDiary);
        Diary.getIntravesicalTherapyDiary(drugChoice);
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf5thDiary + Diary.getHeadOfDepartmentRounds());
        Diary.getDiary();
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf6thDiary);
        Diary.getDiary();
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf7thDiary);
        Diary.getIntravesicalTherapyDischargeDiary(drugChoice);
        Diary.getAttendingPhysician();
    }

    public static void getSchemeThursday14(String dateOfHospitalisation, int drugChoice) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendarOf2ndDiary = Calendar.getInstance(); //������� ������ ���������
        calendarOf2ndDiary.setTime(sdf.parse(dateOfHospitalisation)); //������ ��� � ������
        Calendar calendarOf3rdDiary = Calendar.getInstance();
        calendarOf3rdDiary.setTime(sdf.parse(dateOfHospitalisation));
        Calendar calendarOf4thDiary = Calendar.getInstance();
        calendarOf4thDiary.setTime(sdf.parse(dateOfHospitalisation));
        Calendar calendarOf5thDiary = Calendar.getInstance();
        calendarOf5thDiary.setTime(sdf.parse(dateOfHospitalisation));
        Calendar calendarOf6thDiary = Calendar.getInstance();
        calendarOf6thDiary.setTime(sdf.parse(dateOfHospitalisation));
        Calendar calendarOf7thDiary = Calendar.getInstance();
        calendarOf7thDiary.setTime(sdf.parse(dateOfHospitalisation));
        Calendar calendarOf8thDiary = Calendar.getInstance();
        calendarOf8thDiary.setTime(sdf.parse(dateOfHospitalisation));
        Calendar calendarOf9thDiary = Calendar.getInstance();
        calendarOf9thDiary.setTime(sdf.parse(dateOfHospitalisation));

        calendarOf2ndDiary.add(Calendar.DATE, 1);  // number of days to add
        calendarOf3rdDiary.add(Calendar.DATE, 4);
        calendarOf4thDiary.add(Calendar.DATE, 6);
        calendarOf5thDiary.add(Calendar.DATE, 7);
        calendarOf6thDiary.add(Calendar.DATE, 8);
        calendarOf7thDiary.add(Calendar.DATE, 11);
        calendarOf8thDiary.add(Calendar.DATE, 13);
        calendarOf9thDiary.add(Calendar.DATE, 14);

        String dateOf2ndDiary = sdf.format(calendarOf2ndDiary.getTime());
        String dateOf3rdDiary = sdf.format(calendarOf3rdDiary.getTime());
        String dateOf4thDiary = sdf.format(calendarOf4thDiary.getTime());
        String dateOf5thDiary = sdf.format(calendarOf5thDiary.getTime());
        String dateOf6thDiary = sdf.format(calendarOf6thDiary.getTime());
        String dateOf7thDiary = sdf.format(calendarOf7thDiary.getTime());
        String dateOf8thDiary = sdf.format(calendarOf8thDiary.getTime());
        String dateOf9thDiary = sdf.format(calendarOf9thDiary.getTime());

        System.out.println(dateOfHospitalisation);
        Diary.getIntravesicalTherapyDiary(drugChoice);
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf2ndDiary + Diary.getHeadOfDepartmentRounds());
        Diary.getDiary();
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf3rdDiary);
        Diary.getDiary();
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf4thDiary);
        Diary.getDiary();
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf5thDiary);
        Diary.getIntravesicalTherapyDiary(drugChoice);
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf6thDiary + Diary.getHeadOfDepartmentRounds());
        Diary.getDiary();
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf7thDiary);
        Diary.getDiary();
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf8thDiary);
        Diary.getDiary();
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf9thDiary);
        Diary.getIntravesicalTherapyDischargeDiary(drugChoice);
        Diary.getAttendingPhysician();
    }

    public static void getSchemeFriday14(String dateOfHospitalisation, int drugChoice) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendarOf2ndDiary = Calendar.getInstance(); //������� ������ ���������
        calendarOf2ndDiary.setTime(sdf.parse(dateOfHospitalisation)); //������ ��� � ������
        Calendar calendarOf3rdDiary = Calendar.getInstance();
        calendarOf3rdDiary.setTime(sdf.parse(dateOfHospitalisation));
        Calendar calendarOf4thDiary = Calendar.getInstance();
        calendarOf4thDiary.setTime(sdf.parse(dateOfHospitalisation));
        Calendar calendarOf5thDiary = Calendar.getInstance();
        calendarOf5thDiary.setTime(sdf.parse(dateOfHospitalisation));
        Calendar calendarOf6thDiary = Calendar.getInstance();
        calendarOf6thDiary.setTime(sdf.parse(dateOfHospitalisation));
        Calendar calendarOf7thDiary = Calendar.getInstance();
        calendarOf7thDiary.setTime(sdf.parse(dateOfHospitalisation));

        calendarOf2ndDiary.add(Calendar.DATE, 3);  // number of days to add
        calendarOf3rdDiary.add(Calendar.DATE, 5);
        calendarOf4thDiary.add(Calendar.DATE, 7);
        calendarOf5thDiary.add(Calendar.DATE, 10);
        calendarOf6thDiary.add(Calendar.DATE, 12);
        calendarOf7thDiary.add(Calendar.DATE, 14);

        String dateOf2ndDiary = sdf.format(calendarOf2ndDiary.getTime());
        String dateOf3rdDiary = sdf.format(calendarOf3rdDiary.getTime());
        String dateOf4thDiary = sdf.format(calendarOf4thDiary.getTime());
        String dateOf5thDiary = sdf.format(calendarOf5thDiary.getTime());
        String dateOf6thDiary = sdf.format(calendarOf6thDiary.getTime());
        String dateOf7thDiary = sdf.format(calendarOf7thDiary.getTime());

        System.out.println(dateOfHospitalisation);
        Diary.getIntravesicalTherapyDiary(drugChoice);
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf2ndDiary);
        Diary.getDiary();
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf3rdDiary);
        Diary.getDiary();
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf4thDiary + Diary.getHeadOfDepartmentRounds());
        Diary.getIntravesicalTherapyDiary(drugChoice);
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf5thDiary);
        Diary.getDiary();
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf6thDiary);
        Diary.getDiary();
        Diary.getAttendingPhysician();

        System.out.println("\n" + dateOf7thDiary + Diary.getHeadOfDepartmentRounds());
        Diary.getIntravesicalTherapyDischargeDiary(drugChoice);
        Diary.getAttendingPhysician();
    }

}