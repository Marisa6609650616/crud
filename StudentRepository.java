package com.example.crud;



import com.example.crud.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // คุณสามารถเพิ่ม method สำหรับค้นหาหรือกรองข้อมูลที่ต้องการได้
    // เช่น ค้นหาตามชื่อ
    Student findByEngName(String engName);
    
    // หรือค้นหาตามอีเมล
    Student findByEmail(String email);
}
