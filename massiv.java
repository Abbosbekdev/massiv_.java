package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Massiv {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        Random tasodif = new Random();
        int [] a  = new int[20];
        int [] b = new int[20];
        int c [] = new int[20];
        int n = scanf.nextInt();
//       for (int i = 0; i < n; i++) {
//        a[i] = (int) Math.pow(2,i);
//            System.out.println(a[i]);
//        }

        // 3 - masala

//        a[0] = n;
//        for (int i = 1; i <=k; i++) {
//            a[i] = a[i-1]+m;
//            System.out.println(a[i]);
//        }

        // 4 - masala

//        a[0] = n;
//        for (int i = 1; i <= k; i++) {
//            a[i] = m*a[i-1];
//            System.out.println(a[i]);
//        }

        // 5 - masala

//        a[0] = 1;
//        a[1] = 1;
//        for (int i=2;i<=n;i++){
//            a[i] = a[i-1]+a[i-2];
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.println(a[i]);
//        }

        // 6 - masala

//        for (int i = 1; i < n; i++) {
//            a[0] = m;
//            a[1] = k;
//            yigindi+=a[i-1];
//            a[i] = yigindi;
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.println(a[i]);
//        }

        // 7 - masala

        // massiv elementlarini teskari tartibda chiqaradi

//        for (int i =0;i<n;i++){
//            a[i] = tasodif.nextInt(10);
//            System.out.print(a[i]+" ");
//        }
//        System.out.println();
//        for (int i = n-1; i >=0; i--) {
//            System.out.print(a[i]+" ");
//        }

            // 8 - masala

        // massivda juft elementlar sonini topadi

//        for (int i =0;i<n;i++) {
//            a[i] = scanf.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            if (a[i]%2==0) k++;
//        }
//        System.out.println(k);

        // 9-masala

        // massiv toq elementlari indexi va soni

//        for (int i = 0; i < n; i++) {
//            a[i] = scanf.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            if (a[i]%2!=0){
//                System.out.print(i+" ");
//                k++;
//            }
//        }
//        System.out.print("\n"+k);

        // 10 - masala

        // massiv juf elementi indexi o'sish tartibida toq index kamayish tartibida

//        for (int i = 0; i < n; i++) {
//            a[i] = scanf.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            if (a[i]%2==0) System.out.print(i+" ");
//        }
//        System.out.println();
//        for (int i = n-1; i >= 0; i--) {
//            if (a[i]%2!=0) System.out.print(i+" ");
//        }

        // 11 - masala

//        for (int i = 0; i < n; i++) {
//            a[i] = tasodif.nextInt(10);
//            System.out.print(a[i]+" ");
//        }
//        System.out.println("/n");
//        for (int i = n-1;i>=0;i--){
//            System.out.print(a[i]+" ");
//        }

        // 12-masala

//        for (int i = 0; i < n; i++) {
//            a[i] = tasodif.nextInt(10)+1;
//            System.out.print(a[i]+" ");
//        }
//        System.out.println();
//        for (int i = 0; i < n; i+=2) {
//            System.out.print(a[i]+" ");
//        }

        // 13 - masala

//        for (int i = 0; i < n; i++) {
//            a[i] = tasodif.nextInt(10)+1;
//            System.out.print(a[i]+" ");
//        }
//        System.out.println();
//        for (int i = n-1; i >=0; i-=2) {
//            System.out.print(a[i]+" ");
//        }

        // 14 - masala

//        for (int i = 0; i < n; i++) {
//            a[i] = tasodif.nextInt(10)+1;
//            System.out.print(a[i]+ " ");
//        }
//        System.out.println();
//        for (int i = 0;i<n;i+=2){
//            System.out.print(a[i]+" ");
//        }
//        for (int i=1;i<n;i++){
//            System.out.print(a[i]+" ");
//        }

        // 15 - masala

//        for (int i = 0; i < n; i++) {
//            a[i] = tasodif.nextInt(10);
//            System.out.print(a[i]+" ");
//        }
//        System.out.println();
//        if (n%2!=0){
//            for (int i = n-2; i >0; i-=2) {
//                System.out.print(a[i] + " ");
//            }
//            for (int i = n-1; i >0; i-=2) {
//                System.out.print(a[i] + " ");
//            }
//    }
//        else {
//            for (int i = n-1; i >0; i-=2) {
//                System.out.print(a[i] + " ");
//            }
//            for (int i = n-2; i >0; i-=2) {
//                System.out.print(a[i] + " ");
//            }
//    }

        // 16 - masala

//        for (int i = 0; i < n; i++) {
//            a[i] = scanf.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(a[i]+" ");
//            System.out.print(a[n-i]+" ");
//        }

        // 18 - masala

//        int k = scanf.nextInt();
//        for (int i = 0; i < n; i++) {
//            a[i] = scanf.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            if (k > a[i]){
//                System.out.print(a[i]);
//                break;
//            }
//        }

        // 20 - masala

//        int k = scanf.nextInt();
//        int l = scanf.nextInt();
//        int s = 0;
//        for (int i = 0; i < n; i++) {
//           a[i] = scanf.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            if (i > k && i<=l){
//                s+=a[i];
//            }
//        }
//        System.out.println(s);

        // 21 - masala

//        int k =scanf.nextInt();
//        int l = scanf.nextInt();
//        int s = 0;
//        for (int i = 0; i < n; i++) {
//            a[i] = scanf.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            if (i>=k && i<=l){
//                s +=a[i];
//            }
//        }
//        System.out.println( s/(l-k));

        // 22 -masala

//        int s2=0,s=0;
//        int k = scanf.nextInt();
//        int l = scanf.nextInt();
//        for (int i = 0; i < n; i++) {
//            a[i] = scanf.nextInt();
//        }
//        for (int i=0;i<n;i++){
//            s+=a[i];
//            if(i<l && i>k){
//                s2+=a[i];
//            }
//        }
//        System.out.println(s-s2);

        // 23 - masala

//          int s2=0,s=0;
//        int k = scanf.nextInt();
//        int l = scanf.nextInt();
//        for (int i = 0; i < n; i++) {
//            a[i] = scanf.nextInt();
//        }
//        for (int i=0;i<n;i++){
//            s+=a[i];
//            if(i<l && i>k){
//                s2+=a[i];
//            }
//        }
//        System.out.println((s-s2)/n-l-k);

        // 24 - masala


//        for (int i = 0; i < n; i++) {
//            a[i] = scanf.nextInt();
//        }
//        for (int i = 1; i < n; i++) {
//            if (a[i + 1] == a[i] + a[i - 1]) {
//                System.out.println(a[i]-a[i-1]);
//            } else {
//                System.out.println(0);
//                break;
//            }
//        }

        // 25 - masala

//        for (int i = 0; i < n; i++) {
//            a[i] = scanf.nextInt();
//        }
//        for (int i = n-1; i >= 0; i--) {
//            if (a[i]/a[i-1]==a[i-2]*a[i-3]){
//                System.out.println(a[2]/a[1]);
//            }
//            else {
//                System.out.println(0);
//                break;
//            }
//        }

        // 26  - masala

//        for (int i = 0; i < n; i++) {
//            a[i] = scanf.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            if (a[2*i]%2!=0 ){
//                System.out.println(i);
//                break;
//            }
//        }
//        for (int i=1;i<n;i+=2){
//            if (a[i]%2==0){
//                System.out.println(i);
//                break;
//            }
//        }

        // 28 - masala

//        int max;
//        for (int i = 0; i < n; i++) {
//            a[i]= scanf.nextInt();
//        }
//        max =a [0];
//        for (int i = 0; i < n; i+=2) {
//            if (max <a[i]) max = a[i];
//        }
//        System.out.println(max);

            // 29 - masala

//        int max = a[0];
//        for (int i=0;i<n; i++){
//            a[i] = scanf.nextInt();
//        }
//        for (int i = 1; i < n; i+=2) {
//            if (max < a[i]) max=a[i];
//        }
//        System.out.println(max);

        // 32 - masala

//        for (int i = 0; i < n; i++) {
//            a[i] = scanf.nextInt();
//        }
//        for (int i = 1; i < n; i++) {
//            if (a[i] < a[i-1] && a[i]<a[i+1]){
//                System.out.println(i);
//                break;
//            }
//        }

        // 33 - masala

//        for (int i=0;i<n;i++){
//            a[i] = scanf.nextInt();
//        }
//        for (int i = n-2; i >=0; i--) {
//            if (a[i+1]<a[i] && a[i] > a[i-1]){
//                System.out.println(i);
//                break;
//            }
//        }

        // 34 - masala

//        for (int i = 0; i < n; i++) {
//            a[i] = scanf.nextInt();
//        }int min = a[0];
//        for (int i = 1; i < n; i++) {
//            if (a[i]<a[i-1] && a[i] < a[i+1]){
//                if (min > a[i]) min=a[i];
//            }
//        }
//        System.out.println(min);

        // 35 - masala

//        for (int i=0;i<n;i++){
//            a[i] = scanf.nextInt();
//        }
//        for (int i = n-2; i >=0; i--) {
//            if (a[i + 1] < a[i] && a[i] > a[i - 1]) {
//                int min = a[0];
//                if (min > a[i]) min = a[i];
//                System.out.println(min);
//            }
//        }

        // 37 - masala

//        for (int i = 0; i < n; i++) {
//            a[i] = scanf.nextInt();
//        }
//        int m =0;
//        for (int i = 0; i < n-1; i++) {
//            if (a[i] < a[i+1]) m++;
//        }
//        System.out.println(m);

        // 38 - masala

//        for (int i = 0; i < n; i++) {
//            a[i] = scanf.nextInt();
//        }int m=0;
//        for (int i = 0; i < n-1; i++) {
//            if (a[i] > a[i+1]) m++;
//        }
//        System.out.println(m);

        // 39 - masala

//        for (int i = 0; i < n; i++) {
//            a[i] = scanf.nextInt();
//        }
//        int m = 0;
//        for (int i = 0; i < n - 1; i++) {
//            if (a[i] > a[i+1] || a[i] < a[i+1]) m++;
//        }
//        System.out.println(m);

            // 41 - masala

//        for (int i = 0; i < n; i++) {
//            a[i] = scanf.nextInt();
//        }
//        int max = a[0]+a[1];
//        for (int i = 0; i < n-1; i++) {
//            if (max < a[i]+a[i+1]) max = a[i]+a[i+1];
//        }
//        System.out.println(max);

        // 50 - masala

        int m = 0;
        for (int i =0;i<n;i++){
            a[i] = tasodif.nextInt(8)+1;
            System.out.print(a[i]+"\t");
        }
        System.out.println();
        for (int i =0; i <n;i++){
            for (int j = i+1; j < n; j++)
                if (a[i] > a[j]) {
                    int temp;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    m++;
                }
            System.out.print(a[i]+"\t");
        }
        System.out.println(m);

        // 51 - masala

//        for (int i = 0; i < n; i++) {
//            a[i] = scanf.nextInt();
//        }
//        for (int i =0; i<n;i++){
//            b[i] = scanf.nextInt();
//        }
//        for (int i =0;i<n;i++){
//            int temp = 0;
//            temp = a[i];
//            a[i] = b[i];
//            b[i] = temp;
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.println(" b["+i+"] = "+b[i]);
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.println(" a["+i+"] = "+a[i]);
//        }

        // 52 - masala

//        for (int i = 0; i < n; i++) {
//            a[i] = scanf.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            if (a[i] < 5) b[i] = 2*a[i];
//            else b[i] = a[i]/2;
//            System.out.print(" b["+i+"] = "+b[i]);
//        }

        // 53 - masala

//        for (int i = 0; i < n; i++) {
//            a[i] = scanf.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            b[i] = scanf.nextInt();
//        }
//        for (int i = 0;i<n;i++){
//            c[i] = Math.max(a[i],b[i]);
//            System.out.print(" c["+i+"] = "+c[i]);
//        }

        // 54 - masala

//        for (int i = 0; i < n; i++) {
//            a[i] = scanf.nextInt();
//        }
//        int m =0;
//        for (int i =0;i<n;i++ )
//            if (a[i]%2==0) {
//                b[i] = a[i];
//                m++;
//            }
//        for (int i = 0; i < n; i++) {
//            System.out.println(b[i]);
//        }
//        System.out.println(m);


            // 55 - masala

//        for (int i = 0; i < n; i++) {
//            a[i] = scanf.nextInt();
//        }
//        int m =0;
//        for (int i =0;i<n;i++ )
//            if (a[i]%2!=0) {
//                b[i] = a[i];
//                m++;
//            }
//        for (int i = 0; i < n; i++) {
//            System.out.println(b[i]);
//        }
//        System.out.println(m);


        // 56 - masala

//        for (int i = 0; i < n; i++) {
//            a[i] = scanf.nextInt();
//        }
//        int m =0;
//        for (int i =0;i<n;i++ )
//            if (a[i]%3==0) {
//                b[i] = a[i];
//                m++;
//            }
//        for (int i = 0; i < n; i++) {
//            System.out.println(b[i]);
//        }
//        System.out.println(m);
    }


    /*
    public static void massiv_qil(int[] b, int[] a){
        // 1-masala
        Random tasodif = new Random();
        Scanner scanf = new Scanner(System.in);
        int k = scanf.nextInt();
        for (int i =1;i<k;i++){
            a[i] = tasodif.nextInt(8);
            if (a[i]>0) b[i] = a[i];
        }
        for (int i = 0; i < k; i++) {
            System.out.println(b[i]);
        }
    }
    
}
