package com.simplilearn.ph2.service;

//import required packages
import java.util.Set;

import com.simplilearn.ph2.dto.TrainingClass;
public interface ClassService {
	boolean addClass(TrainingClass event);
	Set<TrainingClass> getAllClasses();
	Set<TrainingClass> getClassReport();
	public boolean assignTeacherForClass(TrainingClass trainingEvent, String teacherId);
}
