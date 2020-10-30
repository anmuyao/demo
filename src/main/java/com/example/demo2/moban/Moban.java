package com.example.demo2.moban;

public abstract class Moban {

    public abstract void start();

   public abstract  void stop();

   public abstract void alarm();

   public final void run(){
       this.start();
       if(this.isAlarm()) {
           this.alarm();
       }
       this.stop();


   }
  private   Boolean flag ;
    private int i = 1;
   public  Boolean isAlarm(){
       i=1;
      return flag ;
   }
}
