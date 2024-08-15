package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@MyAnnotation
@RequestMapping("/app")
public class Main {
    @GetMapping("/{name}")
    public String test(@PathVariable String name){
        return "Congratulation.."+name+", you are selected for the role..!";
    }

    // even aithe 2 , odd aithe 1 , or 0
    // [1,1,2,4]
    public void find(int[] layer, int generation){



    }
    //SQL --- id, lnamw,fname, emaid
    // deal - prfl_id, date, amount top 3 in june
    // select fname,lname, total from profile p join deal d on p.id = d.prof_id and date like '%-06-2024'
    // group by profid having total as sum(d.amount)
    // orderby amount desc limit 3

    // arr[]
  //  2 palyers - a game starts -- 1st player picks 1 - even aithe reverse aithadi, then second player picks evn aithe reverse
  //


    public static void findWinner(int[] arr){

        int len = arr.length;
        int idx = 0;
        int plr1 =0;
        int plr2 = 0;
        boolean isFrontNow = true;
        int front = 1;
        int end = len-1;
        for(int i=0;i<len;i++){
                if(i%2 == 0 ){
                    plr1 += arr[idx];
                }else{
                    plr2 += arr[idx];
                }
                if(arr[idx] %2 == 0){
                    if(isFrontNow){
                        idx = end;
                        end -= 1;
                        isFrontNow = false;
                    }else{
                        idx = front;
                        front += 1;
                        isFrontNow = true;
                    }
                }else{
                    if(isFrontNow){
                        front++;
                        idx++;
                    }else{
                        end--;
                        idx--;
                    }
                }
        }

        if(plr1 > plr2)
            System.out.println("winner is player1 with points " + plr1 );
        else
            System.out.println("winner is player2 with points " + plr2 );


    }

    public static void main(String[] args) {
//        SpringApplication.run(Main.class);

        Main.findWinner(new int[]{1,2,3,4,5});

    }
}