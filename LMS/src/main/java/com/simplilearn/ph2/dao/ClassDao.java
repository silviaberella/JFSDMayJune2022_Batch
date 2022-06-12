package com.simplilearn.ph2.dao;

//import required packages
import java.util.Set;

import com.simplilearn.ph2.dto.TrainingClass;

public interface ClassDao {
	boolean addClass(TrainingClass event);
	Set<TrainingClass> getAllClasses();
	Set<TrainingClass> getClassReport();
	public boolean assignTeacherForClass(TrainingClass trainingEvent, String teacherId);
}
