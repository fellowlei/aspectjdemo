package com.mark;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by lulei on 2018/1/24.
 */
@Aspect
public class MyAspect {
    /**
     * ǰ��֪ͨ
     */
    @Before("execution(* com.mark.UserDao.addUser(..))")
    public void before(){
        System.out.println("MyAspect.before");
    }



    /**
     * ����֪ͨ
     * returnVal,�е㷽��ִ�к�ķ���ֵ
     */
    @AfterReturning(value = "execution(* com.mark.UserDao.addUser(..))",returning = "val")
    public void afterRetuning(Object val){
        System.out.println("MyAspect.afterRetuning: " + val);
    }

    /**
     * ����֪ͨ
     * @param joinPoint ������ִ���е����
     * @return
     * @throws Throwable
     */
    @Around("execution(* com.mark.UserDao.addUser(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("MyAspect.around before");
        Object obj = joinPoint.proceed();
        System.out.println("MyAspect.around after");
        return obj;
    }

    /**
     * �׳�֪ͨ
     * @param e
     */
    @AfterThrowing(value="execution(* com.mark.UserDao.addUser(..))",throwing = "e")
    public void afterThrowable(Throwable e){
        System.out.println("MyAspect.afterThrowable: " + e.getMessage());
    }

    /**
     * ����ʲô����¶���ִ�еķ���
     */
    @After(value="execution(* com.mark.UserDao.addUser(..))")
    public void after(){
        System.out.println("MyAspect.after");
    }

//    /**
//     * ʹ��Pointcut�����е�
//     */
//    @Pointcut("execution(* com.mark.UserDao.addUser(..))")
//    private void myPointcut(){}
//
//    /**
//     * Ӧ������㺯��
//     */
//    @After(value="myPointcut()")
//    public void afterDemo(){
//        System.out.println("����֪ͨ....");
//    }

}
