package com.android.inclassassignment08_yushug;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private TextView questionCountry;
    private TextView countryQuestion;
    private ImageView countryImage;
    private String answer;

    public CardView getCardView() {
        return cardView;
    }

    public void setCardView(CardView cardView) {
        this.cardView = cardView;
    }

    public TextView getQuestionCountry() {
        return questionCountry;
    }

    public void setQuestionCountry(TextView questionCountry) {
        this.questionCountry = questionCountry;
    }

    public TextView getCountryQuestion() {
        return countryQuestion;
    }

    public void setCountryQuestion(TextView countryQuestion) {
        this.countryQuestion = countryQuestion;
    }

    public ImageView getCountryImage() {
        return countryImage;
    }

    public void setCountryImage(ImageView countryImage) {
        this.countryImage = countryImage;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public QuestionViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        questionCountry = (TextView) itemView.findViewById(R.id.question_country);
        countryQuestion = (TextView) itemView.findViewById(R.id.country_question);
        countryImage = (ImageView) itemView.findViewById(R.id.country_image);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, answer, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
