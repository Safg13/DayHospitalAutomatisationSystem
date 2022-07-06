package dhas.diary.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import org.apache.commons.io.output.TeeOutputStream;

public class Main {
    public static void main(String[] args) throws ParseException, IOException {

        System.out.println("������� ���� �������������� � ������� dd-MM-yyyy ");
        Scanner scanner = new Scanner(System.in);
        String inputedDateOfHospitalisation = scanner.nextLine();

        System.out.println("�������� ��������, 1 - ������������, 2 - ���������, 3 - ����������, 4 - ����������� ");
        Scanner scannerDrug = new Scanner(System.in);
        int drugChoice = scannerDrug.nextInt();

        if (drugChoice != 1 && drugChoice != 2 && drugChoice != 3 && drugChoice != 4) {
            System.out.println("������ ��� ������ ���������");
        }

        System.out.println("�������� ����������������� ����� 1, 7 ��� 14 ���� ");
        Scanner scannerChemotherapyDuration = new Scanner(System.in);
        int ChemotherapyDuration = scannerChemotherapyDuration.nextInt();

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        OutputStream teeStream = new TeeOutputStream(System.out, buffer);
        //����� ���� ������ ���� ����� �������� � buffer
        System.setOut(new PrintStream(teeStream));

        //���������� ���� ������, �������������� ��������� � Date
        Date dateOfWeekToDateParser = new SimpleDateFormat("dd-MM-yyyy").parse(inputedDateOfHospitalisation);
        Calendar c = Calendar.getInstance();
        c.setTime(dateOfWeekToDateParser);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        if (ChemotherapyDuration == 1) {
            ChemotherapyScheme.getScheme1(inputedDateOfHospitalisation, drugChoice);
        } else if (ChemotherapyDuration == 7) {
            switch (dayOfWeek) {
                case 2 -> ChemotherapyScheme.getSchemeMonday7(inputedDateOfHospitalisation, drugChoice);
                case 3 -> ChemotherapyScheme.getSchemeTuesday7(inputedDateOfHospitalisation, drugChoice);
                case 4 -> ChemotherapyScheme.getSchemeWednesday7(inputedDateOfHospitalisation, drugChoice);
                case 5 -> ChemotherapyScheme.getSchemeThursday7(inputedDateOfHospitalisation, drugChoice);
                case 6 -> ChemotherapyScheme.getSchemeFriday7(inputedDateOfHospitalisation, drugChoice);
                case 1, 7 -> System.out.println("�� ����� ���� ��������� ���.");
            }
        } else if (ChemotherapyDuration == 14) {
            switch (dayOfWeek) {
                case 2 -> ChemotherapyScheme.getSchemeMonday14(inputedDateOfHospitalisation, drugChoice);
                case 3 -> ChemotherapyScheme.getSchemeTuesday14(inputedDateOfHospitalisation, drugChoice);
                case 4 -> ChemotherapyScheme.getSchemeWednesday14(inputedDateOfHospitalisation, drugChoice);
                case 5 -> ChemotherapyScheme.getSchemeThursday14(inputedDateOfHospitalisation, drugChoice);
                case 6 -> ChemotherapyScheme.getSchemeFriday14(inputedDateOfHospitalisation, drugChoice);
                case 1, 7 -> System.out.println("�� ����� ���� ��������� ���.");
            }
        }
        //��������� buffer � ����
        try (OutputStream fileStream = new FileOutputStream("diary.txt")) {
            buffer.writeTo(fileStream);
        }
    }
}
