package ru.kbadashvili.part3;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by KBadashvili on 031 31.03.17.
 */
public class DoctorTest {
    /**
     *
     */
    @Test
    public void examine() {
        Doctor doctor = new Doctor();
        doctor.setName("Николай Василльевич Склифосоввский");

        Patient patient = new Patient();
        patient.setName("Вася");

        assertThat(doctor.examine(patient), is(doctor.getName() + " began to examine " + patient.getName()));
    }

    /**
     *
     */
    @Test
    public void treat() {
        Doctor doctor = new Doctor();
        doctor.setName("Николай Василльевич Склифосоввский");

        Patient patient = new Patient();
        patient.setName("Вася");

        assertThat(doctor.treat(patient), is(doctor.getName() + " began to treat " + patient.getName()));
    }

}