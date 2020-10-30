package com.example.demo2.zhuangshiqi1;


public class MainTest {
    public static void main(String[] args) {
       /* SchoolReport schoolReport = new SugarFouthGradeSchoolReport();
        FouthGradeSchoolReport s = new SugarFouthGradeSchoolReport();
        schoolReport.report();
        schoolReport.sign();
        s.report();
        s.sign();*/
        SchoolReport sr;
        sr = new FouthGradeSchoolReport();
        sr = new HighScoreDecorator(sr);
        sr = new SortDecorator(sr);
        sr.report();
        sr.sign();
    }
}
