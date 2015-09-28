package com.atmecs.snakesladders;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.MarginLayoutParamsCompat;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.atmecs.snakesladders.model.User;
import com.atmecs.snakesladders.widgets.BoxGridLayout;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private static final String TRANSLATION_Y = "y" ;
    private static final String TRANSLATION_X = "x";
    CardView cardView;
    BoxGridLayout bLayout;
    ImageView img;
    public MainActivityFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    //    loadGameBoard();

    }





   /* public void loadGameBoard(){
    Properties prop = new Properties();
    try
    {
        prop.load(this.getActivity().getAssets().open("game.properties"));
    }
    catch (FileNotFoundException e)
    {
        e.printStackTrace();
    }
    catch (IOException e)
    {
        e.printStackTrace();
    }
    snakePointersSize = Integer.parseInt(prop.getProperty("snake.pointers.total"));

    ladderPointersSize = Integer.parseInt(prop.getProperty("ladder.pointers.total"));

    snakePointers = new int[snakePointersSize][2];

    ladderPointers = new int[ladderPointersSize][2];

    for (int i = 0; i < snakePointersSize; i++)
    {
        String a[] = prop.getProperty("snake.pointers." + (i + 1)).split(",");
        snakePointers[i][0] = Integer.parseInt(a[0]);
        snakePointers[i][1] = Integer.parseInt(a[1]);
    }

    for (int i = 0; i < ladderPointersSize; i++)
    {
        String a[] = prop.getProperty("ladder.pointers." + (i + 1)).split(",");
        ladderPointers[i][0] = Integer.parseInt(a[0]);
        ladderPointers[i][1] = Integer.parseInt(a[1]);
    }
    rows = Integer.parseInt(prop.getProperty("rows"));
    cols = Integer.parseInt(prop.getProperty("cols"));
}*/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        cardView = (CardView) root.findViewById(R.id.card_view);






        bLayout = new BoxGridLayout(getActivity(), 5,MainActivityFragment.this);
        //  bLayout.setmColumnCount(5);
        ViewGroup.LayoutParams lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT
        );



        for(int i=0; i<25;i++){
            int count = 0;
            View v = new View(getActivity());
            v.setLayoutParams(lp);

            if(i%2 == 0){
                v.setBackgroundColor(Color.WHITE);
            }else {
                v.setBackgroundColor(Color.GRAY);
            }

            bLayout.addView(v);




        }

       // Log.d("image values", " " + img.getX() + " " + img.getY());

//        img.setX(50);
    //    img.setY(100);

       Log.d("---------- ", " " + bLayout.getChildAt(4).getX());

              /*for(int i = 0 ; i<25; i++) {

          //  bLayout.getChildAt(0).draw(Canvas c);
            bLayout.getChildAt(i+1).setBackgroundResource(R.drawable.snakesladders);

        }*/


          /*  Animation animation = new TranslateAnimation(500, 0, 0, 0);
            bLayout.getChildAt(0).setAnimation(animation);
            animation.setDuration(2000);*/
            //animation.setRepeatCount(-1);


        img = new ImageView(getActivity());
        img.setImageResource(R.drawable.arow);

        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(50, 50);
        layoutParams.topMargin = 600;
        //layoutParams.leftMargin = 40;
        img.setLayoutParams(layoutParams);
        //LinearLayout.LayoutParams lp1 = new LinearLayout.LayoutParams(40, 40);
        //lp1.setMargins(50, 9000, 0,0);
      //  img.setLayoutParams(lp1);

        cardView.addView(bLayout);



        cardView.addView(img);

        return root;
    }


    public void CustomView(int w,int h){
       int width = w;
       int  height = h;
        int newWidth = w/5;
        int newHeight = h/5;

        /*FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(50, 50);
        layoutParams.topMargin = 600;
        //layoutParams.leftMargin = 40;
        img.setLayoutParams(layoutParams);*/


        System.out.println("inside customview" + w + h + " " + newWidth + newHeight);
/*

      Animation animation = new TranslateAnimation(0, 0, 0,600);


        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                System.out.print("start");
            }

            @Override
            public void onAnimationEnd(Animation animation) {


                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(50, 50);


                layoutParams.topMargin = 550;
                layoutParams.leftMargin = 40;
                img.setLayoutParams(layoutParams);

                System.out.println("end");

                    int boxno = 4;

                    int x = bLayout.getXPosOfBox(boxno);
                    int y = bLayout.getYPosOfBox(boxno);

                    System.out.print("synch");
                    anim(x, y);


            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                System.out.print("start");
            }


        });


        animation.setDuration(1000);
        img.setAnimation(animation);
*/

/*
    int boxno = 15;

        int x = bLayout.getXPosOfBox(boxno);
        int y = bLayout.getYPosOfBox(boxno);

         System.out.print("synch");
          // img.startAnimation(animation);
          Log.d(" ", "x and y---------" + x + " " + y);

    anim(x, y);

*/

       int  x = bLayout.getChildAt(4).getLeft();
        int y = bLayout.getChildAt(4).getTop();

        anim(x,y);

        Toast.makeText(getActivity(), "pos"+x+" "+y, Toast.LENGTH_SHORT).show();


    }

    public  void anim(int x,int y){
        System.out.print("anim"+x+" "+y);
        PropertyValuesHolder pvhX = PropertyValuesHolder.ofFloat(TRANSLATION_X, x);
        PropertyValuesHolder pvhY = PropertyValuesHolder.ofFloat(TRANSLATION_Y, y);
        ObjectAnimator animator = ObjectAnimator.ofPropertyValuesHolder(img, pvhX, pvhY);
        animator.setDuration(1000);
        animator.start();


    }

    @Override
    public void onResume() {
        super.onResume();
        TextView textView = new TextView(getActivity());
        textView.setText("14");
        Toast.makeText(getActivity(), "14:"+bLayout.getXPosOfBox(14), Toast.LENGTH_SHORT).show();
        System.out.println("Height " + bLayout.getHeight());
        System.out.println("Width " + bLayout.getWidth());

      /*  System.out.println("x and y " + bLayout.getChildAt(0).getX()+" "+bLayout.getChildAt(0).getY());
        System.out.println("x1 and y " + bLayout.getChildAt(1).getX() + " " + bLayout.getChildAt(1).getY());
        System.out.println("x2 and y " + bLayout.getChildAt(2).getX()+" "+bLayout.getChildAt(2).getY());
        System.out.println("x3 and y " + bLayout.getChildAt(3).getX()+" "+bLayout.getChildAt(3).getY());
*/



        cardView.addView(textView);
    }





}
