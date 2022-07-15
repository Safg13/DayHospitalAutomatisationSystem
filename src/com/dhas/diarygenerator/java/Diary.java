package com.dhas.diarygenerator.java;

public class Diary {

    public static String getHeadOfDepartmentRounds() {
        return " ���������� ����� � ���. ���������� ������� �.�.";
    }

    public static void getAttendingPhysician() {
        System.out.println("���. ���� ���������� �.�.");
    }

    public static void getDiary() {
        var bodyTempMin = 36.5;
        var bodyTempMax = 36.9;
        var bodyTempScale = Math.pow(10, 1);
        var pulseMin = 64;
        var pulseMax = 78;
        var systolicPressureMax = 135;
        var systolicPressureMin = 110;
        var diastolicPressureMax = 85;
        var diastolicPressureMin = 70;
        String complaints = "������ �� ��������� ��������������. ";
        var bodyTemp = Math.ceil(((Math.random() * (bodyTempMax - bodyTempMin) + bodyTempMin)) * bodyTempScale) /
                bodyTempScale;
        var pulse = Math.round((Math.random() * (pulseMax - pulseMin)) + pulseMin);

        if (pulse % 2 != 0) {
            pulse = pulse + 1;
        }

        var systolicPressure = Math.round((Math.random() * (systolicPressureMax - systolicPressureMin)) +
                systolicPressureMin);

        while (systolicPressure % 5 != 0) {
            systolicPressure = systolicPressure + 1;
        }

        var diastolicPressure = Math.round((Math.random() * (diastolicPressureMax - diastolicPressureMin)) +
                diastolicPressureMin);

        while (diastolicPressure % 5 != 0) {
            diastolicPressure = diastolicPressure + 1;
        }

        System.out.println(complaints + "����� ��������� ������������������. ����������� ���� " + bodyTemp + " �." +
                " ����� " + pulse + " ��/���. �� " + systolicPressure + "/" + diastolicPressure + " �� ��. ��. " +
                "������� ������������� �� ���� �������, ������������, ������ ���. ���� ������ ����������, ���������. " +
                "������ ������� ������, ������� ������� � ���������. ����� ��� ��������� ������, ��������������. " +
                "���������� ������� ��� ������������� ������������� � ����� ������. �������������� ���������, " +
                "��������������, ������ �����������. ���� �����������. ������������ �����������.");
    }

    public static void getTherapy(int drugChoice) {
        switch (drugChoice) {
            case 1 ->
                    System.out.println("������� ������� ���� �������������� ������� ���������� ������������ 50 �� �/�, ���������� ��������� � ������� ������ 2 ����, ������� �����������������.");
            case 2 ->
                    System.out.println("������� ������� ���� �������������� ������� ���������� ������-��� 100 �� �/�, ���������� ��������� � ������� ������ 2 ����, ������� �����������������.");
            case 3 ->
                    System.out.println("������� ������� ���� �� ���������� ���������� 75 ��/�2 �/�, ������� �����������������.");
            case 4 ->
                    System.out.println("������� ������� ���� ��� ���������� ����������� 11,25 �� �/�, ������� �����������������.");
        }
    }

    public static void getDischarge() {
        System.out.println("������������ � ������������������ ���������. ������������ ��� ������� ����.");
    }

}
