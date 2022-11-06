package org.example.dao.teacher;

import org.example.dao.GenericDAO;
import org.example.domains.users.Teacher;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Objects;

/**
 * @author "Khazratov Aslonbek"
 * @since 10/07/2022 00:58 (Monday)
 * quiz-app-console-master/IntelliJ IDEA
 */
public class TeacherDAO extends GenericDAO<Teacher,Long> {

    private static TeacherDAO instance;

    public static TeacherDAO getInstance(){
        if (Objects.isNull(instance)){
            instance = new TeacherDAO();
        }
        return instance;
    }


    public Teacher findByUserId(Long userId) {
        Session session = getSession();
        session.beginTransaction();

        Teacher teacherEntity = session.createQuery("select t from Teacher t where t.user.id=:userId", Teacher.class)
                .setParameter("userId", userId)
                .getSingleResultOrNull();

        session.getTransaction().commit();
        session.close();
        return teacherEntity;

    }

}
