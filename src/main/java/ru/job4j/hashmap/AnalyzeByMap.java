package ru.job4j.hashmap;

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
        List<Label> bestStudent = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int totalScore = 0;
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
            }
            Label studentLabel = new Label(pupil.name(), totalScore);
            bestStudent.add(studentLabel);
        }
        Collections.sort(bestStudent);
        return bestStudent.get(bestStudent.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> bestSubject = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                String subjectName = subject.name();
                int score = subject.score();
                bestSubject.put(subjectName, bestSubject.getOrDefault(subjectName, 0) + score);
            }
        }

        List<Label> subjectLabels = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : bestSubject.entrySet()) {
            String subjectName = entry.getKey();
            int totalScore = entry.getValue();
            Label subjectLabel = new Label(subjectName, totalScore);
            subjectLabels.add(subjectLabel);
        }
        Collections.sort(subjectLabels);
        return subjectLabels.get(subjectLabels.size() - 1);
    }
}