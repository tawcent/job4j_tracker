package ru.job4j.hashmap;

import javax.naming.ServiceUnavailableException;
import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double totalScore = 0;
        int totalSubjects = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
                totalSubjects++;
            }
        }
        return totalSubjects == 0 ? 0 : totalScore / totalSubjects;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double totalScore = 0;
            int totalSubjects = 0;
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
                totalSubjects++;
            }
                double averageScore = totalSubjects == 0 ? 0 : totalScore / totalSubjects;
                result.add(new Label(pupil.name(), averageScore));

        }
        return result;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> subjectScore = new LinkedHashMap<>();
        int numbOfPupils = pupils.size();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                String nameOfSubject = subject.name();
                int currentScore = subjectScore.getOrDefault(nameOfSubject, 0);
                subjectScore.put(nameOfSubject, currentScore + subject.score());
            }
        }
        List<Label> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : subjectScore.entrySet()) {
            String subjectName = entry.getKey();
            double averageScore = (double) entry.getValue() / numbOfPupils;
            result.add(new Label(subjectName, averageScore));
        }
        return result;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int totalScore = 0;
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
            }
            Label label = new Label(pupil.name(), totalScore);
            result.add(label);
        }
        Collections.sort(result);
        return result.get(result.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> bestSubject = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                String nameOfScore = subject.name();
                int score = subject.score();
                bestSubject.put(nameOfScore, bestSubject.getOrDefault(nameOfScore, 0) + score);
            }
        }

        List<Label> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : bestSubject.entrySet()) {
            String subjectName = entry.getKey();
            int totalScore = entry.getValue();
            Label subjectLabel = new Label(subjectName, totalScore);
            result.add(subjectLabel);
        }
        Collections.sort(result);
        return result.get(result.size() - 1);
    }
}