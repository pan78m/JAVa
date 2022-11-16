@SuperpressWarnings("Unchecked")

private void jButton1ActionPerformed(java.awt.event.actionEvent.evt)
{
    String math,history,english,biology;
   double total_credit=3*4;
    double average;
    double cgpa;
    history=historyTF.getText();
    math=mathTF.getText();
    english=englishTF.getText();
    biology=biologyTF.getText();
    double history=Double.parseDouble(history);
    double math=Double.parseDouble(math);
    double biology=Double.parseDouble(biology);
    double english=Double.parseDouble(english);
    average=((math+history+biology+english)/5);
    if(history>=90){
    hletterTF.setText("A");
    cgpa=cgpa+4.0;
    }else if(history<90&& history>=80){
        hletterTF.setText("B");
    cgpa=cgpa+3.5;
    }else if(history<80&& history>=70){
        hletterTF.setText("B+");
    cgpa=cgpa+3.0;
    }else if(history<70&& history>=60){
        hletterTF.setText("C");
    cgpa=cgpa+2.5;
    }else if(history<600&& history>=50){
        hletterTF.setText("C+");
    cgpa=cgpa+2.0;
    }else if(history<50&& history>=40){
        hletterTF.setText("D");
    cgpa=cgpa+1.5;
    }else if(history<40&& history>=33){
        hletterTF.setText("E");
    cgpa=cgpa+1.0;
    }else {
        hletterTF.setText("F");
        cgpa=cgpa+0.0;
    }
      
    if(math>=90){
        mletterTF.setText("A");
        cgpa=cgpa+4.0;
        }else if(math<90&& math>=80){
            mletterTF.setText("B");
        cgpa=cgpa+3.5;
        }else if(math<80&& math>=70){
            mletterTF.setText("B+");
        cgpa=cgpa+3.0;
        }else if(math<70&& math>=60){
            mletterTF.setText("C");
        cgpa=cgpa+2.5;
        }else if(math<600&& math>=50){
            hletterTF.setText("C+");
        cgpa=cgpa+2.0;
        }else if(math<50&& math>=40){
            mletterTF.setText("D");
        cgpa=cgpa+1.5;
        }else if(math<40&& math>=33){
            mletterTF.setText("E");
        cgpa=cgpa+1.0;
        }else {
            mletterTF.setText("F");
            cgpa=cgpa+0.0;
        }


    if(english>=90){
        hletterTF.setText("A");
        cgpa=cgpa+4.0;
        }else if(english<90&& english>=80){
            letterTF.setText("B");
        cgpa=cgpa+3.5;
        }else if(english<80&& english>=70){
            letterTF.setText("B+");
        cgpa=cgpa+3.0;
        }else if(english<70&& english>=60){
            letterTF.setText("C");
        cgpa=cgpa+2.5;
        }else if(english<600&& english>=50){
            letterTF.setText("C+");
        cgpa=cgpa+2.0;
        }else if(english<50&& english>=40){
            letterTF.setText("D");
        cgpa=cgpa+1.5;
        }else if(english<40&& english>=33){
            letterTF.setText("E");
        cgpa=cgpa+1.0;
        }else {
            eletterTF.setText("F");
            cgpa=cgpa+0.0;
        }

    if(biology>=90){
        bletterTF.setText("A");
        cgpa=cgpa+4.0;
        }else if(biology<90&& biology>=80){
            bletterTF.setText("B");
        cgpa=cgpa+3.5;
        }else if(biology<80&& biology>=70){
            bletterTF.setText("B+");
        cgpa=cgpa+3.0;
        }else if(biology<70&& biology>=60){
            bletterTF.setText("C");
        cgpa=cgpa+2.5;
        }else if(biology<600&& biology>=50){
            hletterTF.setText("C+");
        cgpa=cgpa+2.0;
        }else if(biology<50&& biology>=40){
            bletterTF.setText("D");
        cgpa=cgpa+1.5;
        }else if(biology<40&& biology>=33){
            bletterTF.setText("E");
        cgpa=cgpa+1.0;
        }else {
            bletterTF.setText("F");
            cgpa=cgpa+0.0;
        }
            
        cgpa=cgpa/(total_credit);
        cgpaTF.setText(Double.toString(cgpa));
        averageTF.setText(Double.toString(average))
    
    }


