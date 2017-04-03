package com.example.administrator.permissiontest.anotation;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/1/15.
 */
@MyAnnotation(value = "hehe",array = {1,2,3})
public class AnnotationTest {

    public static void main(String[] args){
        if (AnnotationTest.class.isAnnotationPresent(MyAnnotation.class)){
            MyAnnotation myAnnotation = AnnotationTest.class.getAnnotation(MyAnnotation.class);
            System.out.println(myAnnotation.color());
            System.out.println(myAnnotation.array().length);
            System.out.println(Arrays.asList(myAnnotation.array()).toString());

        }
       String[] s = new String[]{};
    }
}
