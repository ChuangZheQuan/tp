package seedu.plannermd.testutil;

import static seedu.plannermd.testutil.appointment.TypicalAppointments.getTypicalAppointments;
import static seedu.plannermd.testutil.doctor.TypicalDoctors.getTypicalDoctors;
import static seedu.plannermd.testutil.patient.TypicalPatients.getTypicalPatients;

import seedu.plannermd.model.PlannerMd;
import seedu.plannermd.model.appointment.Appointment;
import seedu.plannermd.model.doctor.Doctor;
import seedu.plannermd.model.patient.Patient;
//import seedu.plannermd.testutil.appointment.AppointmentBuilder;

public class TypicalPlannerMd {

    /**
     * Returns an {@code PlannerMd} with all the typical appointment, patients and doctors.
     */
    public static PlannerMd getTypicalPlannerMd() {
        PlannerMd pm = new PlannerMd();
        for (Patient patient : getTypicalPatients()) {
            pm.addPatient(patient);
        }

        for (Doctor doctor : getTypicalDoctors()) {
            pm.addDoctor(doctor);
        }

        for (Appointment appointment: getTypicalAppointments()){

        }
        return pm;
    }

    /**
     * Returns an {@code PlannerMd} with all the typical patients.
     */
    public static PlannerMd getTypicalPatientsPlannerMd() {
        PlannerMd pm = new PlannerMd();
        for (Patient patient : getTypicalPatients()) {
            pm.addPatient(patient);
        }
        return pm;
    }

    /**
     * Returns an {@code PlannerMd} with all the typical doctors.
     */
    public static PlannerMd getTypicalDoctorsPlannerMd() {
        PlannerMd pm = new PlannerMd();
        for (Doctor doctor : getTypicalDoctors()) {
            pm.addDoctor(doctor);
        }
        return pm;
    }

    /**
     * Returns an {@code PlannerMd} with all the typical appointments.
     */
    public static PlannerMd getTypicalAppointmentsPlannerMd() {
        PlannerMd pm = new PlannerMd();
        for (Appointment doctor : getTypicalAppointments()) {

        }
        return pm;
    }
}
