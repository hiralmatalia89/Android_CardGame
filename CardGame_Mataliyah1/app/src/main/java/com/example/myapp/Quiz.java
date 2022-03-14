package com.example.gameapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class Quiz extends AppCompatActivity {

    private TextView questionTV, questionNumberTv;
    private Button option1Btn, option2Btn, option3Btn, option4Btn;
    private ArrayList<QuizModal> quizModalArrayList;
    Random random;
    int CurrentScore = 0, questionAttempted = 0,currentPos;
    SharedPreferences sharedPreferences;
    LinearLayout linearLayoutCheckbox;
    CheckBox Checkbox1,Checkbox2,Checkbox3,Checkbox4;
    Button idbtnCheckbox;
    Date c;
    String formattedDate;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        questionTV = findViewById(R.id.idTVQuestion);
        questionNumberTv = findViewById(R.id.idTVQuestionAttempted);
        option1Btn = findViewById(R.id.idbtnOption1);
        option2Btn = findViewById(R.id.idbtnOption2);
        option3Btn = findViewById(R.id.idbtnOption3);
        option4Btn = findViewById(R.id.idbtnOption4);
        quizModalArrayList = new ArrayList<>();
        sharedPreferences =  getSharedPreferences("file_quizdata",MODE_PRIVATE);
        linearLayoutCheckbox = findViewById(R.id.idCheckBoxLayout);
        random = new Random();
        idbtnCheckbox = findViewById(R.id.idbtnCheckbox);
        idbtnCheckbox.setVisibility(View.INVISIBLE);
        getQuizQuestion(quizModalArrayList);
        currentPos = random.nextInt(quizModalArrayList.size());
        setDatatoViews(currentPos);
        Checkbox1 = findViewById(R.id.idCheckBox1);
        Checkbox2 = findViewById(R.id.idCheckBox2);
        Checkbox3 = findViewById(R.id.idCheckBox3);
        Checkbox4 = findViewById(R.id.idCheckBox4);
        linearLayoutCheckbox.setVisibility(View.INVISIBLE);
        c = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy", Locale.getDefault());
        formattedDate = df.format(c);

        option1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder alertDialogue = new AlertDialog.Builder(Quiz.this);
                alertDialogue.setTitle("Are you sure?") ;
                alertDialogue.setCancelable(false);
                alertDialogue.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option1Btn.getText().toString().trim().toLowerCase())){
                            CurrentScore++;
                        }
                        questionAttempted++;
                        currentPos = random.nextInt(quizModalArrayList.size());
                        setDatatoViews(currentPos);
                    }
                });
                alertDialogue.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog dialog = alertDialogue.create();
                dialog.show();

            }
        });
        option2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder alertDialogue = new AlertDialog.Builder(Quiz.this);
                alertDialogue.setTitle("Are you sure?") ;
                alertDialogue.setCancelable(false);
                alertDialogue.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option2Btn.getText().toString().trim().toLowerCase())){
                            CurrentScore++;
                        }
                        questionAttempted++;
                        currentPos = random.nextInt(quizModalArrayList.size());
                        setDatatoViews(currentPos);
                    }
                });
                alertDialogue.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog dialog = alertDialogue.create();
                dialog.show();

            }
        });

        option3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder alertDialogue = new AlertDialog.Builder(Quiz.this);
                alertDialogue.setTitle("Are you sure?") ;
                alertDialogue.setCancelable(false);
                alertDialogue.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option3Btn.getText().toString().trim().toLowerCase())){
                            CurrentScore++;
                        }
                        questionAttempted++;
                        currentPos = random.nextInt(quizModalArrayList.size());
                        setDatatoViews(currentPos);
                    }
                });
                alertDialogue.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog dialog = alertDialogue.create();
                dialog.show();

            }
        });

        option4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder alertDialogue = new AlertDialog.Builder(Quiz.this);
                alertDialogue.setTitle("Are you sure?") ;
                alertDialogue.setCancelable(false);
                alertDialogue.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option4Btn.getText().toString().trim().toLowerCase())){
                            CurrentScore++;
                        }
                        questionAttempted++;
                        currentPos = random.nextInt(quizModalArrayList.size());
                        setDatatoViews(currentPos);
                    }
                });
                alertDialogue.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog dialog = alertDialogue.create();
                dialog.show();

            }
        });

        idbtnCheckbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder alertDialogue = new AlertDialog.Builder(Quiz.this);
                alertDialogue.setTitle("Are you sure?") ;
                alertDialogue.setCancelable(false);
                alertDialogue.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if(Checkbox1.isChecked() && Checkbox3.isChecked())
                        {
                            CurrentScore++;
                        }
                        if (Checkbox1.isChecked() || Checkbox3.isChecked())
                        {
                            CurrentScore = (int) (CurrentScore + 0.5);
                        }
                        questionAttempted = 0;
                        showBottomSheet();
                    }
                });
                alertDialogue.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog dialog = alertDialogue.create();
                dialog.show();

            }
    });
    }

    private void showBottomSheet(){
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(Quiz.this);
        View bottomsheet = LayoutInflater.from(getApplicationContext()).inflate(R.layout.score_bottom_sheet,(LinearLayout)findViewById(R.id.idLLScore));
        TextView scoreTV = bottomsheet.findViewById(R.id.TVScore);
        Button btnRestartQuiz =  bottomsheet.findViewById(R.id.btnRestartQuiz);
        scoreTV.setText("Your Score is \n" + CurrentScore + "/5");
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("Score", String.valueOf(CurrentScore));
        editor.putString("DateTime", String.valueOf(formattedDate));
        editor.commit();
        Checkbox1.setChecked(false);
        Checkbox2.setChecked(false);
        Checkbox3.setChecked(false);
        Checkbox4.setChecked(false);
        btnRestartQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentPos = random.nextInt(quizModalArrayList.size());
                setDatatoViews(currentPos);
                questionAttempted = 0;
                CurrentScore = 0;
                bottomSheetDialog.dismiss();
                idbtnCheckbox.setVisibility(View.INVISIBLE);
                linearLayoutCheckbox.setVisibility(View.INVISIBLE);
                return;
            }
        });
        bottomSheetDialog.setCancelable(false);
        bottomSheetDialog.setContentView(bottomsheet);
        bottomSheetDialog.show();
    }

    private void setDatatoViews(int currentPos) {
        questionNumberTv.setText("Questions Attempted : " + questionAttempted + "/5");
        if (questionAttempted == 4) {
            linearLayoutCheckbox.setVisibility(View.VISIBLE);
            idbtnCheckbox.setVisibility(View.VISIBLE);
            questionTV.setText("Please check all the traits that make fragments useful?");
            Checkbox1.setText("Build a flexible UI");
            Checkbox2.setText("Same lifecycle as their host activity");
            Checkbox3.setText("Dynamically add or remove them at runtime");
            Checkbox4.setText("All of Above");
            //showBottomSheet();
            //questionAttempted = 0;
        } else {
            questionTV.setText(quizModalArrayList.get(currentPos).getQuestion());
            option1Btn.setText(quizModalArrayList.get(currentPos).getOption1());
            option2Btn.setText(quizModalArrayList.get(currentPos).getOption2());
            option3Btn.setText(quizModalArrayList.get(currentPos).getOption3());
            option4Btn.setText(quizModalArrayList.get(currentPos).getOption4());
        }
    }
    private void getQuizQuestion(ArrayList<QuizModal> quizModalArrayList) {
        quizModalArrayList.add(new QuizModal("What types of fragments are in Android?","Dynamic, Static","Connected, Sparse","Sync, Async","Homologous, Heterogeneous","Dynamic, Static"));
        quizModalArrayList.add(new QuizModal("For a single fragment in an activity, what lifecycle callback is called right after it’s host activity is created?","onSaveInstanceState","onCreateView","onResume","onCreate","onCreate"));
        quizModalArrayList.add(new QuizModal("In what version of Android was the concept of a Fragment introduced?","Android 4.0","Android 3.0","Android 2.3","Android 3.4","Android 3.0"));
        quizModalArrayList.add(new QuizModal("What must a Fragment be hosted within?","A View class","The <uses-configuration> tag","An Activity class","The <uses-sdk> tag","An Activity class"));
        quizModalArrayList.add(new QuizModal("An update or modification to a Fragment is performed using what?","A FragmentEdit","A FragmentActivity","A FragmentView","A FragmentTransaction","A FragmentTransaction"));

    }
}