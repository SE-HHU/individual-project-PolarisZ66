package Polaris01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("请输入题目数量：");
        int num=sc.nextInt();
        try {

            FileWriter fw1=new FileWriter("Exercises.txt");
            FileWriter fw2=new FileWriter("Answers.txt");
            BufferedWriter bw1=new BufferedWriter(fw1);
            BufferedWriter bw2=new BufferedWriter(fw2);
            int n=0;
            while(n<num) {
                int opt=(int)(Math.random()*2+1);
                if(opt==1) {
                    int b=(int)(Math.random()*100+1),c=(int)(Math.random()*100+1),
                            opt1=(int)(Math.random()*2+1),a=0;
                    if(opt1==1) {
                        a=b+c;
                        if(a<0||a>100) continue;

                        bw1.write(n+1+":"+b+"+"+c+"="+"\n");
                        bw1.flush();
                        bw2.write(a+"\n");
                        bw2.flush();
                    }
                    else {
                        a=b-c;
                        if(a<0||a>100) continue;

                        bw1.write(n+1+":"+b+"-"+c+"="+"\n");
                        bw1.flush();
                        bw2.write(a+"\n");
                        bw2.flush();
                    }

                }
                else{
                    int b=(int)(Math.random()*100+1),c=(int)(Math.random()*100+1),
                            d=(int)(Math.random()*100+1),opt1=(int)(Math.random()*2+1),
                            opt2=(int)(Math.random()*2+1),a=0;
                    int b1=b,c1=c,d1=d;
                    if(opt1==2) c1=-c1;
                    if(opt2==2) d1=-d1;
                    a=b1+c1+d1;
                    if(a<0||a>100) continue;
                    if(opt1==1&&opt2==1) {

                        bw1.write(n+1+":"+b+"+"+d+"+"+d+"="+"\n");
                        bw1.flush();
                        bw2.write(a+"\n");
                        bw2.flush();
                    }
                    else if(opt1==1&&opt2==2) {

                        bw1.write(n+1+":"+b+"+"+c+"-"+d+"="+"\n");
                        bw1.flush();
                        bw2.write(a+"\n");
                        bw2.flush();
                    }
                    else if(opt1==2&&opt2==1) {

                        bw1.write(n+1+":"+b+"-"+c+"+"+d+"="+"\n");
                        bw1.flush();
                        bw2.write(a+"\n");
                        bw2.flush();
                    }
                    else if(opt1==2&&opt2==2) {

                        bw1.write(n+1+":"+b+"-"+c+"-"+d+"="+"\n");
                        bw1.flush();
                        bw2.write(a+"\n");
                        bw2.flush();
                    }
                }
                n++;
            }

        }catch(Exception e1) {
            e1.printStackTrace();
        }
	}

}
