package com.stackoverflow.team08.answers.service;

import com.stackoverflow.team08.answers.entity.Answer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {
    public Answer createAnswer(Answer answer) {
        Answer createdAnswer = answer;

        return createdAnswer;
    }

    public Answer updateAnswer(Answer answer) {
        Answer updatedAnswer = answer;

        return updatedAnswer;
    }

    public Answer findAnswer(long answerId) {

        return null;
    }

    public List<Answer> findAnswers() {
        List<Answer> answers = List.of(
                new Answer(1L, "hello, world1", false),
                new Answer(2L, "hello, world2222", false)
        );
        return answers;
    }

    public void deleteAnswer(long answerId) {
    }
}
