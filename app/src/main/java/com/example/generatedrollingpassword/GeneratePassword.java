package com.example.generatedrollingpassword;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class GeneratePassword {



//    public static void main(String[] args){
//        DatabaseReference dbRef = FirebaseDatabase.getInstance().getReferenceFromUrl("https://runwayproject-b5853-default-rtdb.europe-west1.firebasedatabase.app/");
//        ComputePwd computedP = new ComputePwd();
//        Timer t = new Timer();
//        TimerTask tt = new TimerTask(){
//            @Override
//            public void run(){
//                String pwd = computedP.computeGen();
//                System.out.println(pwd);
//                dbRef.child("voucher").setValue(pwd);
//
//            }
//        };
//
//        Calendar startDate = Calendar.getInstance();
//        startDate.set(Calendar.DAY_OF_MONTH, 14);
//        startDate.set(Calendar.MONTH, 10);
//        startDate.set(Calendar.YEAR, 2022);
//        startDate.set(Calendar.HOUR_OF_DAY, 11);
//        startDate.set(Calendar.MINUTE, 0);
//        startDate.set(Calendar.SECOND, 0);
//        startDate.set(Calendar.MILLISECOND, 0);
//
//        // 2 week period
//        long period = 1000L * 60L * 60L * 24L * 14L;
//
//        System.out.println(startDate.getTime());
//
////            t.scheduleAtFixedRate(tt, 0, 2000L);
//        t.scheduleAtFixedRate(tt, startDate.getTime(), period);
//    }
//
//
//

}
