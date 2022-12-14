package org.example.dao.variant;

import org.example.dao.GenericDAO;
import org.example.domains.QA.Variant;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Objects;

/**
 * @author "Khazratov Aslonbek"
 * @since 10/07/2022 00:23 (Monday)
 * quiz-app-console-master/IntelliJ IDEA
 */
public class VariantDAO extends GenericDAO<Variant, Long> {

    private static VariantDAO instance;

    public static VariantDAO getInstance(){
        if (Objects.isNull(instance)){
            instance = new VariantDAO();
        }
        return instance;
    }


    public List<Variant> findAllVariantsByUserId(Long id){
        Session session = getSession();
        session.beginTransaction();
        Query<Variant> query = session.createQuery("select t from Variant t where t.student_id=:id", Variant.class);
        query.setParameter("id", id);
        List<Variant> resultList = query.getResultList();
        session.close();
        return resultList;
    }


}
