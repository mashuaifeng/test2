package com.example.administrator.permissiontest;

import java.lang.reflect.Array;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/12/29.
 */
public class ReflectTest {
    public static void  main(String[] args)throws Exception{
      /*  Date str2 = new Date();
        Date str =new Date();
        Class cls1 = str.getClass();
        Class cls2 = str2.getClass();
        Class cls3= Class.forName("java.util.Date");
        System.out.println(cls1 == cls2);
        System.out.println(cls1 == cls3);*/

       /* Constructor constructor = String.class.getConstructor(StringBuffer.class);
        String str = (String)constructor.newInstance(new StringBuffer("asd"));
        System.out.println(str.charAt(2));

        Points points1 = new Points(3,4);
        // Field field = points1.getClass().getField("x");
        Field field = points1.getClass().getDeclaredField("x");
        field.setAccessible(true);//访问私有变量要加这个
        int s = (int)field.get(points1);

        System.out.println(s);*/
        String str ="abc";
        Method method = String.class.getMethod("charAt", int.class);
       // System.out.println(method.invoke(str,1));
        //Integer[] a = new Integer[]{1,2,3};
        int[] a = new int[]{1,2,3};
        int b = a[0];
      //  String[] s = new String[2];
        //Object[] obj = new Integer[]{1,2};
       // System.out.println(Arrays.asList(a)+" "+b);
        //prints(a);
    //    System.out.println(s.getClass().getName());
        Object o = new Object();
        System.out.println(Integer.toHexString(o.hashCode()));

       String s2 ="123";
        String s = new String("3");
s2.contains(s);
        System.out.println(o);
       // s.equals()
   //     System.out.println(s.hashCode());
    //    System.out.println(s2.hashCode());
     //   System.out.println(s==s2);

    }

    private static void prints(Object obj){
        Class mclass = obj.getClass();

        if (mclass.isArray()){
            int len = Array.getLength(obj);
            for (int i = 0; i < len; i++) {
                System.out.println(Array.get(obj,i));
            }
        }else
            System.out.println(obj);
    }


}
