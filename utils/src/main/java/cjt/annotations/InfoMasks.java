package cjt.annotations;

import cjt.beans.IdCardInfoOperator;
import cjt.beans.PhoneInfoOperator;
import cjt.beans.RealNameInfoOperator;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface InfoMasks {
    //需要脱敏的信息类型对象数组
    InfoMask[] value() default {@InfoMask(PhoneInfoOperator.class),@InfoMask(RealNameInfoOperator.class),@InfoMask(IdCardInfoOperator.class)};
}
