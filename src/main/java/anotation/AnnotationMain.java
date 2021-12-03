package anotation;

import anotation.anotationExam.InsertIntData;
import anotation.anotationExam.InsertStringData;

public class AnnotationMain {
    public static void main(String[] args) {

        AnnotationHandler handler = new AnnotationHandler();
        AnnotationExam01 annotationExam01 = handler.getInstance(AnnotationExam01.class, InsertIntData.class)
                .map(o -> (AnnotationExam01) o)
                .orElse(new AnnotationExam01());

        AnnotationExam02 annotationExam02 = handler.getInstance(AnnotationExam02.class, InsertStringData.class)
                .map(o -> (AnnotationExam02) o)
                .orElse(new AnnotationExam02());

        System.out.println("myAge = " + annotationExam01.getMyAge());
        System.out.println("defaultAge = " + annotationExam01.getDefaultAge());

        System.out.println("myData = " + annotationExam02.getMyData());
        System.out.println("defaultData = " + annotationExam02.getDefaultData());

    }
}
