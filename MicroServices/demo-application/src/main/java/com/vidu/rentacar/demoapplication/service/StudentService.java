package com.vidu.rentacar.demoapplication.service;

import com.vidu.rentacar.demoapplication.model.Student;

public interface StudentService {
    Student save(Student student);

    Student fetchStudentById(int id);
}
