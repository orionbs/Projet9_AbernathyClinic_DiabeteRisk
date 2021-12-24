package com.abernathyclinic.MediscreenDiabetesRisk.proxy;

import com.abernathyclinic.MediscreenDiabetesRisk.models.PatientNote;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(url = "http://localhost:8082/patHistory")
public interface NotesHistoryProxy {

    @RequestMapping(method = RequestMethod.GET)
    List<PatientNote> readNotesHistoryByPatientId(@RequestParam Integer patientId);

}