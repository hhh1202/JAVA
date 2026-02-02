package com.mjc.assignment02;
import java.time.LocalDate;

public class HospitalRecord {

    private LocalDate admissionDate;
    private LocalDate dischargeDate;
    private String doctorName;
    private String ownerName;

    public HospitalRecord(
            LocalDate admissionDate,
            String doctorName,
            String ownerName
    ) {
        this.admissionDate = admissionDate;
        this.doctorName = doctorName;
        this.ownerName = ownerName;
    }

    public void discharge(LocalDate date) {
        this.dischargeDate = date;
    }

    public String getOwnerName() {
        return ownerName;
    }
}

