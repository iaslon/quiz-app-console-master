package org.example.dao.student;

import org.example.dao.GenericDAO;
import org.example.domains.QA.Question;
import org.example.domains.users.Student;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/**
 * @author "Khazratov Aslonbek"
 * @since 10/07/2022 21:58 (Monday)
 * quiz-app-console-master/IntelliJ IDEA
 */
public class StudentDAO extends GenericDAO<Student, Long> {

    private static StudentDAO instance;

    public static StudentDAO getInstance() {
        if (instance == null) {
            instance = new StudentDAO();
        }
        return instance;
    }

    public List<Student> findAllStudent(){
        Session session = getSession();
        session.beginTransaction();
        Query<Student> query = session.createQuery("select t from Student t", Student.class);
        List<Student> resultList = query.getResultList();
        return resultList;
    }


}
