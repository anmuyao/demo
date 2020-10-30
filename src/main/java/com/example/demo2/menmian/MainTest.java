package com.example.demo2.menmian;

public class MainTest {

    public static void main(String[] args) {
       /* LetterProcessImpl letterProcess = new LetterProcessImpl();
        letterProcess.writeContext("嘿嘿嘿");
        letterProcess.fillEnvelope("beijing");
        letterProcess.letterInotoEnvelope();
        letterProcess.sendLetter();*/
        ModenPostOffice modenPostOffice = new ModenPostOffice();
        modenPostOffice.sendLetter("嘿嘿嘿","beijing");
    }
}
