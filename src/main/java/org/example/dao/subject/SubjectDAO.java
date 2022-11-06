package org.example.dao.subject;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.example.dao.GenericDAO;
import org.example.domains.subject.Subject;
import org.hibernate.Session;

/**
 * @author "Khazratov Aslonbek"
 * @since 10/07/2022 00:58 (Monday)
 * quiz-app-console-master/IntelliJ IDEA
 */

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SubjectDAO extends GenericDAO<Subject, Long> {

    private static SubjectDAO instance;

    public static SubjectDAO getInstance() {
        if (instance == null) {
            instance = new SubjectDAO();
        }
        return instance;
    }

    public Subject findByName(String name) {
        Session session = getSession();
        session.beginTransaction();

        Subject result = session.createQuery("select t from Subject t where  lower(t.title) = lower(:name) and t.deleted=false ", Subject.class)
                .setParameter("name", name)
                .getSingleResultOrNull();

        session.close();
        return result;
    }

}
