package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class kegiatan2aps {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan batas antrean");
        int batas_antre = scan.nextInt();
        kegiatan2 obj = new kegiatan2(batas_antre) {};

        System.out.println("Silahkan ambil nomor antreannya");
        for(int i = 0; i<batas_antre; i++){
            obj.enqueue(i+1);
        }

        if(obj.size() !=1){
           do{
            System.out.println("No Antrean Paling depan saat ini adalah: " + obj.peek());
            System.out.println("Silahkan no antrean dengan nomor " + obj.peek() + " Maju kedepan");

            //Antrean depan sudah selesai , gunakan method deque untuk mengeluarkan antrean paling depan
            obj.dequeue();
            if(obj.isEmpty()){
                System.out.println("Antrean sudah habis");
            }
           }while(obj.size() != 0);
        }

        //Check jika antrean sudah selesai/habis dengan method




    }


}
