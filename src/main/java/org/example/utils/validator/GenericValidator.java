package org.example.utils.validator;

import org.example.exception.ValidationException;
import org.example.vo.BaseVO;
import org.example.vo.GenericVO;
import org.example.vo.auth.AuthCreateVO;

import java.io.Serializable;

/**
 * @author "Khazratov Aslonbek"
 * @since 11/07/2022 01:58 (Monday)
 * quiz-app-console-master/IntelliJ IDEA
 */
public abstract class GenericValidator<CreateVO extends BaseVO, UpdateVO extends GenericVO, K extends Serializable> implements BaseValidator {

    public abstract void validateKey(K id) throws ValidationException;

    public abstract void validOnCreate(CreateVO vo) throws ValidationException;

    public abstract void validOnUpdate(UpdateVO vo) throws ValidationException;


}
